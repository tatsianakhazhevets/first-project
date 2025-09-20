package Practice13_ComplexTask.Task_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateNameTest {

    @ParameterizedTest
    @ValueSource(strings = {
           "Tania", // regular name
            "T", // name which consist of 1 Upper Case Letter
            "Taaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" // long variant of name
    })
    public void methodShouldReturnTrueForValidNames(String name) {
        boolean actualResult = UserValidator.validateName(name);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "Таня", // name on cyrillic
            "Zaрина", // name with mix of cyrillic and latin
            "Т", // name which consist of 1 Upper Case Letter Cyrrilic
            "t", //  name which consist of 1 lower case letter latin
            "tANIA", // name with the fist letter lower case and others upper case
            "TaniA", // name with the fist and last letters upper case and others lower case
            "tania",  // name with lower case letters
            "25", // insert age instead of name
            "qaz@gmail.com", // insert email instead of name
            "!@#$", // name which consists of special signs
            "Anna-Maria" // name which consists of two parts
    })
    public void methodShouldReturnFalseForInvalidNames(String name) {
        boolean actualResult = UserValidator.validateName(name);
        assertFalse(actualResult);
    }

    @Test
    public void methodChecksNameThatEqualsToNull() {
        assertFalse(UserValidator.validateName(null));
    }
}