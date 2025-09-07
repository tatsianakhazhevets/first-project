package Practice11_WriteTests.HomeWork;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class isValidPhoneNumberTest extends MethodsForUnitTestCasesTest {

    /*
    + {7 44 365} 1234567891
     */

    @ParameterizedTest
    @ValueSource(strings = {
           // Positive cases
           "+7 5558889999",
           "+777 5558889999"
    })
    public void checkValidNumbers(String phone) {
        boolean actualResult = methodsForUnitTestCases.isValidPhoneNumber(phone);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            // Negative cases
            // more than matches
            "+7 55588899999",
            "+7777 5558889999",
            // empty parts
            "+ 5558889999",
            "+777 ",
            // \d{10} less
            "+77 111222333",
            // without +
            "777 5558889999",
            // empty
            "",
            // +
            "+"
    })
    public void checkInvalidNumbers(String phone) {
        boolean actualResult = methodsForUnitTestCases.isValidPhoneNumber(phone);
        assertFalse(actualResult);
    }
}