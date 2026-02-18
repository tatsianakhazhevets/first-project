package mentoring.Practice15_ProjectPatterns.video.creational.singleton.before;

public class Main {
    public static void main(String[] args) {
        // мы можем создавать разные экземпляры конфигурации, хотя она должна быть одна
        DatabaseConfig config1 = new DatabaseConfig();
        DatabaseConfig config2 = new DatabaseConfig();

        config1.config = "DB Config for User A";
        config2.config = "DB Config for User B";

        config1.displayConfig(); // Выводит "DB Config for User A"
        config2.displayConfig(); // Выводит "DB Config for User B"
    }
}

// Проблемы:
// конфиг должен быть единственным, иначе вызываем конфиг в разных местах, а конфигурации разные
