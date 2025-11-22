package Practice15_ProjectPatterns.video.creational.singleton.after;

public class Main {
    public static void main(String[] args) {
        // есть возможность вызвать конструктор, так как констрктор паблик
        // если делаем конструктор приватным, то тогда возможность пропадает
        //DatabaseConfig config1 = new DatabaseConfig();
        //DatabaseConfig config2 = new DatabaseConfig();

        DatabaseConfig config1 = DatabaseConfig.getInstance();
        DatabaseConfig config2 = DatabaseConfig.getInstance();

        config1.config = "DB Config for User A";
        config2.config = "DB Config for User B";

        config1.displayConfig(); // Выводит "DB Config for User B"
        config2.displayConfig(); // Выводит "DB Config for User B"
        // теперь конфиг меняется везде одинаково
    }
}