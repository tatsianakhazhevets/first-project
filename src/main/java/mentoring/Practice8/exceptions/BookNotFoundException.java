package mentoring.Practice8.exceptions;

// проверяемый -> наследуется от Exception (наследники)
public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}
