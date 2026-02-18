package mentoring.Practice6.user_monitor_HashSet;

import java.util.HashSet;

public class UserMonitor {
    // хранение уникальных сессий
    private HashSet<String> sessions;

    public UserMonitor() {
        this.sessions = new HashSet<>();
    }

    public void addNewSession(String session) {
        sessions.add(session);
    }

    // доступ к сессии - все сессии
    public HashSet<String> getSession() {
        return this.sessions;
    }

    public void printSessions() {
        System.out.println("Все уникальные сессии: ");
        sessions.forEach(System.out::println);
    }


}
