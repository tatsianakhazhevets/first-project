package mentoring.Practice15_ProjectPatterns.homework.singleton.task1;

public class ConfigurationManager {

    private String databaseUrl;
    private String databaseUser;
    private String databasePassword;
    private String filePath;
    private String logLevel;
    private String logFile;

    private static ConfigurationManager configurationManager;

    private ConfigurationManager() {
        this.databaseUrl = "someUrl";
        this.databaseUser = "someUser";
        this.databasePassword = "somePassword";
        this.filePath = "someFilePath";
        this.logLevel = "someLogLevel";
        this.logFile = "someLogFile";
    }

    public static ConfigurationManager getInstance() {
        if(configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

    public void printConfig() {
        System.out.println("Database Url: " + databaseUrl +
                "\nDatabase User: " + databaseUser +
                "\nDatabase Password: " + databasePassword +
                "\nFilePath: " + filePath +
                "\nLogL Level: " + logLevel +
                "\nLog File: " + logFile);
    }
}