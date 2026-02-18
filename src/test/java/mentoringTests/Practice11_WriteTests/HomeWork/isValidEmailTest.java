package mentoringTests.Practice11_WriteTests.HomeWork;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class isValidEmailTest extends MethodsForUnitTestCasesTest {

    @ParameterizedTest
    @ValueSource(strings = {
            // valid e-mail -> return true
            "userName25@gmail.com",
            "userName25@gmail.ru",
            "Aa_1Bb.2Cc-3@Aa_1Bb.2Cc-3.qw_12"
    })

    public void checkThatMethodValidateCorrectEmails(String email) {
        boolean actualResult = methodsForUnitTestCases.isValidEmail(email);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            // valid e-mail -> return false
            "?!Aa_1Bb.2Cc-3@?!Aa_1Bb.2Cc-3@.qw_12?!",
            "?!Aa_1Bb.2Cc-3@Aa_1Bb.2Cc-3@.qw_12",
            "Aa_1Bb.2Cc-3@Aa_1Bb.2Cc-3@.qw_12?!",
            "userName25@@gmail.com",
            "userName25gmail.com",
            "userName25@gmailcom",
            "userName25@gmail.c"
    })

    public void checkThatMethodValidateIncorrectEmails(String email) {
        boolean actualResult = methodsForUnitTestCases.isValidEmail(email);
        assertFalse(actualResult);
    }

    @Test
    public void checkThatMethodValidateNullValue() {
        boolean actualResult = methodsForUnitTestCases.isValidEmail(null);
        assertFalse(actualResult);
    }


}
