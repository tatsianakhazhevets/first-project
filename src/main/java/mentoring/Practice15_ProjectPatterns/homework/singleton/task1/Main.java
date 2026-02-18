package mentoring.Practice15_ProjectPatterns.homework.singleton.task1;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();
        config.printConfig();
    }
}