package Practice11_WriteTests.HomeWork;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class isLeapYearTest extends MethodsForUnitTestCasesTest {

    @ParameterizedTest
    @ValueSource(ints = {
            // return True test cases
            // (year % 4 == 0 && year % 100 != 0)
            2024, 4, 3056,
            // (year % 400 == 0)
            4000, 2000, 1600
    })
    public void checkThatMethodReturnsTrue(int year) {
        boolean actualResult = methodsForUnitTestCases.isLeapYear(year);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {
            // return False test cases
            // not (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
            2025, 1601, 3058,
            // year % 100 == 0 && year % 400 != 0
            2100, 1900
    })
    public void checkThatMethodReturnsFalse(int year) {
        boolean actualResult = methodsForUnitTestCases.isLeapYear(year);
        assertFalse(actualResult);
    }

}
