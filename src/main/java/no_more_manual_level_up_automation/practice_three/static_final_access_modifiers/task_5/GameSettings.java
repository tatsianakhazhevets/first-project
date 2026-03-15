package no_more_manual_level_up_automation.practice_three.static_final_access_modifiers.task_5;


public class GameSettings {
    protected static int maxPlayers;
    private final String gameName;
    private int currentPlayers;

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    public int addPlayer() {
        return currentPlayers++;
    }

    public void printGameStatus() {
        System.out.println("Game Name is " + this.gameName +
                "\nCurrent number of the players: " + this.currentPlayers +
                "\nMaximum possible number of the players: " + maxPlayers);
    }
}