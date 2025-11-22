package Practice15_ProjectPatterns.homework.singleton.task2;

public class Logger {

    private static Logger logger;

    private Logger() {}

    public static Logger getInstance() {
        if(logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void printInfoEvent(String message) {
        System.out.println("[INFO] " + message);
    }

    public void printErrorEvent(String message) {
        System.out.println("[ERROR] " + message);
    }

    public void printWarningEvent(String message) {
        System.out.println("[WARN] " + message);
    }
}