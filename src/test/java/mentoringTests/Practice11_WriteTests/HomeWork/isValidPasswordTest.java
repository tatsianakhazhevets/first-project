package mentoringTests.Practice11_WriteTests.HomeWork;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class isValidPasswordTest extends MethodsForUnitTestCasesTest {

    @ParameterizedTest
    @ValueSource(strings = {
            // Happy path
            "QAZqwe123",
            // Length is 8
            "Qwe123er",
            // Length is 8, only Upper case and digits
            "QTG123UJ",
            // Length is 8, + special sigh
            "Qas123U!",
            // Length is 8, + one Upper case and digits
            "Q1asdqwe",
            // Length is 8, +  7 Upper case and 1 digit
            "Q1ERTYUI",
            // Length is 8, +  1 Upper case and 7 digit
            "1234567A",
    })
    public void checkThatMethodReturnTrueForValidPassword(String password) {
        boolean actualResult = methodsForUnitTestCases.isValidPassword(password);
        assertTrue(actualResult);
    }


    @ParameterizedTest
    @ValueSource(strings = {
            // Length is 7
            "Qwe123e",
            // Length is 8, only Lower case and digits
            "asd123as",
            // Length is 8, + only special sigh
            "!@#$%^!#",
            // Length is 8, + only digits
            "12345678",
            // Length is 8, +  only Upper case
            "QQERTYUI",
            // Length is 8, only Lower case
            "wsxedcrf",
            // Empty
            "",
    })
    public void checkThatMethodReturnFalseForInvalidPassword(String password) {
        boolean actualResult = methodsForUnitTestCases.isValidPassword(password);
        assertFalse(actualResult);
    }


    @Test
    public void checkThatMethodReturnFalseForNull() {
        boolean actualResult = methodsForUnitTestCases.isValidPassword(null);
        assertFalse(actualResult);
    }
}