package mentoringTests.Practice13_ComplexTask.Task_2;

import mentoring.Practice13_ComplexTask.Task_2.UserValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateEmailTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "userName25@gmail.com", "userName25@gmail.ru", // email common view
            "Aa_1Bb.2%Cc-3@Aa1Bb.2Cc-3.qw" // email with max regex options
    })
    public void methodShouldReturnTrueForValidEmails(String email) {
        boolean actualResult = UserValidator.validateEmail(email);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            // email has not allowed special sings
            "?!Aa_1Bb.2Cc-3@?!Aa_1Bb.2Cc-3@.qw_12?!", "?!Aa_1Bb.2Cc-3@Aa_1Bb.2Cc-3@.qw_12",
            "Aa_1Bb.2Cc-3@Aa_1Bb.2Cc-3@.qw_12?!",
            "userName25@@gmail.com", // email has 2 @@
            "userName25gmail.com", // email does not have @
            "userName25@gmailcom", // email does not coma @[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
            "userName25@gmail.c" // email has less than 2 letter[A-Za-z]{2,}$"
    })
    public void methodShouldReturnFalseForInvalidEmails(String email) {
        boolean actualResult = UserValidator.validateEmail(email);
        assertFalse(actualResult);
    }

    @Test
    public void methodMatchesShouldThrowsNullPointerExceptionWhenEmailIsNull() {
        assertThrows(NullPointerException.class, () ->  UserValidator.validateEmail(null));
    }
}