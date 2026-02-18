package mentoring.FinalTask;

import java.util.Map;

public class StageDescription {

    private final String id;
    private final String description;
    private final Map<String, String> gameVariants;
    private final boolean isFinal;


    /**
     * Constructor for creating a game stage.
     * @param id unique stage identifier.
     * @param description stage description displayed to the player.
     * @param gameVariants map of options: key is the option, value is the next stage.
     * @param isFinal flag indicating whether the stage is final.
     */

    public StageDescription(String id, String description, Map<String, String> gameVariants, boolean isFinal) {
        this.id = id;
        this.description = description;
        this.gameVariants = gameVariants;
        this.isFinal = isFinal;
    }


    /**
     * Returns the description of the current stage.
     * @return the stage description text.
     */

    public String getDescription() {
        return description;
    }


    /**
     * Returns the options for the current stage.
     * @return a map of options, where the key is the player's choice, the value is the next stage.
     */

    public Map<String, String> getGameVariants() {
        return gameVariants;
    }


    /**
     * Returns the flag for checking if the current stage is final.
     * @return true if the stage is final, otherwise false.
     */

    public boolean isFinal() {
        return isFinal;
    }
}