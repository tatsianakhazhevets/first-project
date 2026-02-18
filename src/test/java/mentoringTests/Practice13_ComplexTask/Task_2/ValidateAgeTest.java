package mentoringTests.Practice13_ComplexTask.Task_2;

import mentoring.Practice13_ComplexTask.Task_2.UserValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateAgeTest {

    @ParameterizedTest
    @ValueSource(ints = {
            18, 19, 99, 100, // border age values
            50 // age value in the middle
    })
    public void methodShouldReturnTrueForValidAge(int age) {
        boolean actualResult = UserValidator.validateAge(age);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {
            17, 101, // border age values
            -18, // age negative value
            0, // age is null
            500 // age with value far from age range
    })
    public void methodShouldReturnFalseForInvalidAge(int age) {
        boolean actualResult = UserValidator.validateAge(age);
        assertFalse(actualResult);
    }
}