package no_more_manual_level_up_automation.practice_three.static_final_access_modifiers.task_5;

public class Main {
    public static void main(String[] args) {

        GameSettings gameOne = new GameSettings("Some Game One", 2);
        GameSettings gameTwo = new GameSettings("Some Game Two", 4);

        GameSettings.maxPlayers = 5;

        gameOne.addPlayer();
        gameTwo.addPlayer();

        gameOne.printGameStatus();
        gameTwo.printGameStatus();
    }
}