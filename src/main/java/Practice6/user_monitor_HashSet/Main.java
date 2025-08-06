package Practice6.user_monitor_HashSet;

public class Main {
    public static void main(String[] args) {
        UserMonitor userMonitor = new UserMonitor();

        userMonitor.addNewSession("177");
        userMonitor.addNewSession("177");
        userMonitor.addNewSession("177");
        userMonitor.addNewSession("177");
        userMonitor.addNewSession("134");
        userMonitor.addNewSession("134");
        userMonitor.addNewSession("134");
        userMonitor.addNewSession("134");
        userMonitor.addNewSession("134");
        userMonitor.addNewSession("134");

        userMonitor.printSessions();



    }
}
