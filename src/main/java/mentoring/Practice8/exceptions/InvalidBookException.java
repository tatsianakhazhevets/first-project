package mentoring.Practice8.exceptions;

// непроверяемый -> наследники Error, RunTimeException
public class InvalidBookException extends RuntimeException {
    // construction
    public InvalidBookException(String message) {
        super(message);
    }
}
