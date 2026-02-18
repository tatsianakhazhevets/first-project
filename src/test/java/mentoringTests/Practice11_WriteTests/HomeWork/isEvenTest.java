package mentoringTests.Practice11_WriteTests.HomeWork;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class isEvenTest extends MethodsForUnitTestCasesTest {

    @ParameterizedTest
    @ValueSource(ints = {
            // positive test with negative number
            -2,
            // positive test with 0
            0,
            // positive test with positive number
            2,
            // positive test with positive big number
            1000,
            // positive test with negative big number
            -1000,
            // positive test with min int value
            Integer.MIN_VALUE
    })
    public void checkThatTheNumberIsEven(int number) {
        boolean actualResult = methodsForUnitTestCases.isEven(number);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {
            // negative test with negative number
            -1,
            // negative test with positive number
            1,
            // negative test with positive big number
            1001,
            // negative test with negative big number
            -1001,
            // negative test with max int value
            Integer.MAX_VALUE
    })
    public void checkThatTheNumberIsNotEven(int number) {
        boolean actualResult = methodsForUnitTestCases.isEven(number);
        assertFalse(actualResult);
    }
}