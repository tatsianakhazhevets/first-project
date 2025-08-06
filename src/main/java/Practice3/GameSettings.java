package Practice3;

public class GameSettings {
    static int maxPlayers;
    static int playersCounter;
    final String gameName;
    int currentPlayers;

    GameSettings(String someGameName, int someCurrentPlayers){
        this.gameName = someGameName;
        this.currentPlayers = someCurrentPlayers;
    }

    static {
        maxPlayers = 6;
        playersCounter = 0;
    }

    public static int setMaxPlayers(int newMax){
        maxPlayers = newMax;
        return newMax;
    }

    public int addPlayer(){
        this.currentPlayers = Math.min(this.currentPlayers + 1, maxPlayers);
        return 0;
    }

    public void printGameStatus(){
        System.out.println("Название игры: " + this.gameName + " текущее количество игроков: " + this.currentPlayers + " максимальное количество игроков: " + maxPlayers);
    }

}
