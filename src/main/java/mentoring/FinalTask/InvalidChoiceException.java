package mentoring.FinalTask;

public class InvalidChoiceException extends RuntimeException {

    /**
     * Creates a new exception with the message.
     * @param message an error message describing the invalid selection
     */

    public InvalidChoiceException(String message) {
        super(message);
    }
}