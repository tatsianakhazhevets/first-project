package Practice13_ComplexTask.Task_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidateTest {

    @Test
    public void methodShouldNotThrowExceptionWithValidUserData() {
        User user = new User("Tania", 18, "tania@gmail.com");
        assertDoesNotThrow(() -> UserValidator.validate(user));
    }

    @Test
    public void methodShouldThrowExceptionWithInvalidUserName() {
        User user = new User("Таня", 18, "tania@gmail.com");
        assertThrows(InvalidUserException.class, () -> UserValidator.validate(user));
    }

    @Test
    public void methodShouldThrowExceptionWithInvalidUserAge() {
        User user = new User("Tania", 1, "tania@gmail.com");
        assertThrows(InvalidUserException.class, () -> UserValidator.validate(user));
    }

    @Test
    public void methodShouldThrowExceptionWithInvalidUserEmail() {
        User user = new User("Tania", 18, "tania@gmailcom");
        assertThrows(InvalidUserException.class, () -> UserValidator.validate(user));
    }

    @Test
    public void methodShouldNotThrowExceptionWithInvalidUserDataAndWithFlagOff() {
        User user = new User("Таня", 1, "tania@gmailcom");
        UserValidator.validationEnabled = false;
        assertDoesNotThrow(() -> UserValidator.validate(user));
        UserValidator.validationEnabled = true;;
    }
}