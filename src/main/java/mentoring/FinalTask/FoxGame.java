package mentoring.FinalTask;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FoxGame {

    private final Map<String, StageDescription> stages = new HashMap<>();
    private String currentStageId = "start";
    private boolean running = true;
    Scanner scanner = new Scanner(System.in);


    /**
     * Constructor of the FoxGame class.
     * Initializes all stages of the game with ids, descriptions, options, and final states.
     * Contains the text (for every stage) that the user sees.
     */

    public FoxGame() {

        stages.put("start", new StageDescription("start",
                "Every morning Little Fox woke up, had breakfast, and went to see Little Squirrel. " +
                        "\nThis morning was no exception. Little Fox came to their usual meeting place, but Little Squirrel was not there. " +
                        "\nThe little fox waited and waited but his friend didn’t come. The little squirrel has not missed a single meeting yet. " +
                        "\n“Suddenly he got into trouble” thought the Little Fox. What should the Little Fox do? " +
                        "\na -> Return back " +
                        "\nb -> Go for search ",
                Map.of("a", "win", "b", "search"),
                false));

        stages.put("win", new StageDescription("win",
                "Returning home, Little Fox found Little Squirrel there." +
                        "\nIt turned out that Little Squirrel came to the meeting place earlier and saw a swarm of angry bees there." +
                        "\nHe hastened to warn Little Fox about this, but they missed each other." +
                        "\nFinally, friends found each other!",
                Map.of(),
                true));

        stages.put("search", new StageDescription("search",
                "All the forest inhabitants were busy with their own affairs and did not pay attention " +
                        "\nto the Little Fox and his problem. But suddenly someone saw Little Squirrel... Little Fox didn’t know what to do. " +
                        "\nHelp him." +
                        "\na -> Try to find out about Little Squirrel from the forest inhabitants" +
                        "\nb -> Search for Little Squirrel alone",
                Map.of("a", "owl_wolf", "b", "alone"),
                false));

        stages.put("alone", new StageDescription("alone",
                "The Little Fox wandered through the forest for too long in search of a friend and did not notice how lost he was." +
                        "\nNow we need to look for him himself.",
                Map.of(),
                true));

        stages.put("owl_wolf", new StageDescription("owl_wolf",
                "While Little Fox was making a decision, the forest inhabitants dispersed in all directions. " +
                        "\nOnly the Owl and the Wolf remained. But the Owl can have memory problems, and the Wolf can get very angry due to questions. " +
                        "\nWhom to choose?" +
                        "\na -> Ask Owl" +
                        "\nb -> Ask Wolf",
                Map.of("a", "owl_direction", "b", "wolf_direction"),
                false));

        stages.put("owl_direction", new StageDescription("owl_direction",
                "The Owl did not want to speak for a long time, but in the end, " +
                        "\nshe said that she saw a frightened Little Squirrel running deep into the forest. " +
                        "\nAll forest dwellers know that in the depths of the forest it is dangerous, " +
                        "\nif Little Squirrel is there, he urgently needs help." +
                        "\na -> Trust the Owl and go deep into the forest " +
                        "\nb -> You shouldn't trust the Owl. Look for the Little Squirrel alone",
                Map.of("a", "go_to_forest", "b", "alone"),
                false));

        stages.put("wolf_direction", new StageDescription("wolf_direction",
                "The wolf turned out to be quite friendly but could not help. " +
                        "\nHe just said that the little fox should not wander through the forest alone. " +
                        "\nAnd what should I do now? " +
                        "\na -> The wolf is right. Return home" +
                        "\nb -> Search for Little Squirrel alone",
                Map.of("a", "win", "b", "alone"),
                false));

        stages.put("go_to_forest", new StageDescription("go_to_forest",
                "In the depths of the forest, the Little Fox met the Little Bear. " +
                        "\nThe lazy Little Bear was ready to tell everything he knew if the Little Fox brought him honey. " +
                        "\na -> No, too much time has been spent, we need to move on. Look for Little Squirrel alone " +
                        "\nb -> We need to take this chance and get some honey",
                Map.of("a", "alone", "b", "get_honey"),
                false));

        stages.put("get_honey", new StageDescription("get_honey",
                "The little fox quickly found honey, but a swarm of angry bees was flying around. " +
                        "\nThe little fox was always afraid of bees, but he was also afraid of not finding a friend. " +
                        "\na -> Wait till the bees fly away " +
                        "\nb -> Try to steal the honey immediately",
                Map.of("a", "bees_fly", "b", "bees_byte"),
                false));

        stages.put("bees_fly", new StageDescription("bees_fly",
                "The little fox waited a little, and the bees scattered. The little fox collected honey without any problems. " +
                        "\nSuddenly he realized that he was very hungry. What to do?" +
                        "\na -> Eat a little and take a break" +
                        "\nb -> Hurry up and take the honey to Little Bear",
                Map.of("a", "take_honey", "b", "bear_answer"),
                false));

        stages.put("bees_byte", new StageDescription("bees_byte",
                "This wasn't the best idea. The bees bit the little fox, now he himself needs help.",
                Map.of(),
                true));

        stages.put("take_honey", new StageDescription("take_honey",
                "While the Little Fox was eating, the evil bees returned and bit him. " +
                        "\nThe little fox needs help, he will not be able to continue his search.",
                Map.of(),
                true));

        stages.put("bear_answer", new StageDescription("bear_answer",
                "The satisfied Little Bear told Little Fox that he knew the Squirrel family very well and " +
                        "\nwas sure that Little Little Squirrel would never go deep into the forest. " +
                        "\nHe assured Little Fox that Squirrels don't get into trouble and that Owls can't be trusted, " +
                        "\nand he also tried to persuade Little Fox to return home. " +
                        "\na -> The little bear doesn’t know anything; we need to continue the search. Look for the Little Squirrel alone " +
                        "\nb -> Maybe he's right and Little Fox is just panicking. Return back",
                Map.of("a", "alone", "b", "win"),
                false));
    }


    /**
     * Starts the game, displaying the main menu when the program starts.
     * This method calls the @mainMenuOne() method, which displays the initial menu.
     */

    public void startGame() {
        mainMenuOne();
    }

    /**
     * Displays the game's main menu one with options to start the game,
     * load the game, or exit the program at the beginning of the game.
     * Processes user input and performs the appropriate actions.
     * If the user enters an invalid choice, an exception
     * is thrown, and the menu will prompt the user again until a valid choice is made.
     */

    private void mainMenuOne() {

        System.out.println("Choose the variant:" + "\n");

        while (true) {
            System.out.println("=== MAIN MENU ===");
            System.out.println("1. Start game");
            System.out.println("2. Load game");
            System.out.println("3. Exit");

            String input = scanner.nextLine().trim();

            try {
                switch (input) {
                    case "1":
                        currentStageId = "start";
                        start();
                        return;
                    case "2":
                        loadGame();
                        return;
                    case "3":
                        running = false;
                        return;
                    default:
                        throw new InvalidChoiceException("Not correct, try again.");
                }
            } catch (InvalidChoiceException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    /**
     * Starts the game loop, where the main gameplay occurs.
     * Responsible for displaying the description, receiving the user's choice,
     * and transitioning between stages.
     * If the user enters an invalid choice, an exception is thrown, and the menu
     * will prompt the user again until a valid choice is made.
     */

    public void start() {

        while (running) {
            StageDescription stageDescription = stages.get(currentStageId);
            System.out.println("\n" + stageDescription.getDescription());

            if (stageDescription.isFinal()) {
                System.out.println("The stage is final. Type 'menu' to go to the main menu.");
                while (true) {
                    String input = scanner.nextLine().trim();
                    if (input.equalsIgnoreCase("menu")) {
                        mainMenuTwo();
                        break;
                    } else {
                        System.out.println("Please type 'menu' to go to the main menu.");
                    }
                }
                continue;
            }

            System.out.println("Choose a or b. Or type 'menu' to go to main menu.");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("menu")) {
                mainMenuTwo();
            } else {
                try {
                    if (stageDescription.getGameVariants().containsKey(input)) {
                        currentStageId = stageDescription.getGameVariants().get(input);
                    } else {
                        throw new InvalidChoiceException("Invalid choice, please type 'a' or 'b'.");
                    }
                } catch (InvalidChoiceException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("Thank you for playing!");
    }

    /**
     * Displays the game's main menu two with options to continue, save,
     * load the game, start a new game, or exit the program.
     * Processes user input and performs the appropriate actions.
     * If the user enters an invalid choice, an exception
     * is thrown, and the menu will prompt the user again until a valid choice is made.
     */

    private void mainMenuTwo() {

        System.out.println("Choose the variant:" + "\n");

        while (true) {
            System.out.println("=== MAIN MENU ===");
            System.out.println("1. Continue game");
            System.out.println("2. Save game");
            System.out.println("3. Load game");
            System.out.println("4. Start new Game");
            System.out.println("5. Exit");

            String input = scanner.nextLine().trim();

            try {
                switch (input) {
                    case "1":
                        return;
                    case "2":
                        saveGame();
                        break;
                    case "3":
                        loadGame();
                        break;
                    case "4":
                        currentStageId = "start";
                        return;
                    case "5":
                        running = false;
                        return;
                    default:
                        throw new InvalidChoiceException("Not correct, try again.");
                }
            } catch (InvalidChoiceException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    /**
     * Saves the current game progress to a file.
     * Request from the user for a file name to save.
     * If a file with that name already exists, no saving occurs.
     */

    public void saveGame() {
        System.out.print("Enter save file name: ");
        String filename = scanner.nextLine().trim();
        File file = new File(filename);

        if (file.exists()) {
            System.out.println("The file wasn't saved, because it has already existed.");
            return;
        }

        try (FileWriter fw = new FileWriter(file)) {
            fw.write(currentStageId);
            System.out.println("Save!");
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }


    /**
     * Loads a saved game from a file whose name is entered by the user.
     * If the file exists and contains a valid stage identifier,
     * the current game stage is uploaded.
     * If there are errors reading the file or the file format is invalid, outputs appropriate messages.
     */

    public void loadGame() {
        System.out.print("Enter save file name: ");
        String filename = scanner.nextLine().trim();
        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("File not found.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String loadedStage = br.readLine();
            if (loadedStage != null && stages.containsKey(loadedStage)) {
                currentStageId = loadedStage;
                System.out.println("Game loaded successfully.");
            } else {
                System.out.println("Invalid save file.");
            }
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}