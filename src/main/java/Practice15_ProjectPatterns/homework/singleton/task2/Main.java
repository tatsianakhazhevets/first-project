package Practice15_ProjectPatterns.homework.singleton.task2;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.printInfoEvent("Успешное подключение к базе данных");
        logger.printErrorEvent("Исключение при выполнении операций");
        logger.printWarningEvent("Попытка работы с устаревшими методами");
    }
}