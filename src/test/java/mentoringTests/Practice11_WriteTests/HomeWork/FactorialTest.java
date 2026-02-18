package mentoringTests.Practice11_WriteTests.HomeWork;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest extends MethodsForUnitTestCasesTest {

    public static Stream<Arguments> numbersForPositiveAndCornerCases() {
        return Stream.of(
                // positive test cases with positive numbers
                Arguments.of(2, 2),
                Arguments.of(5, 120),
                Arguments.of(10, 3628800),
                Arguments.of(12, 479001600),
                // positive corner test cases with positive numbers
                Arguments.of(0, 1),
                Arguments.of(1, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("numbersForPositiveAndCornerCases")
    public void checkThatMethodCalculatesFactorialForPositiveAndCornerTestCases(int n, int expectedResult) {
        int actualResult = methodsForUnitTestCases.factorial(n);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkThatMethodCalculatesFactorialForPositiveAndCornerTestCases() {
        assertThrows(IllegalArgumentException.class,
                () -> methodsForUnitTestCases.factorial(-1));
        assertThrows(IllegalArgumentException.class,
                () -> methodsForUnitTestCases.factorial(Integer.MIN_VALUE));
    }
}