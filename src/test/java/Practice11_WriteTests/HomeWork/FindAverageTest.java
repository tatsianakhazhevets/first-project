package Practice11_WriteTests.HomeWork;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindAverageTest extends MethodsForUnitTestCasesTest {

    public static Stream<Arguments> arraysForPositiveAndCornerTestCases() {
        return Stream.of(
                // Positive cases
                // positive+negative numbers
                Arguments.of(new int[] {20, 5, 0, -1, -6}, 3.6),
                // positive numbers
                Arguments.of(new int[] {1, 2, 3, 4, 5}, 3),
                // negative numbers
                Arguments.of(new int[] {-1, -2, -3, -4, -5}, -3),
                // 0
                Arguments.of(new int[] {0, 0, 0, 0, 0}, 0),
                // same value
                Arguments.of(new int[] {100, 100, 100, 100, 100}, 100),
                // max+min
                Arguments.of(new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE}, -0.5),
                // Corner cases
                Arguments.of(new int[] {5}, 5),
                Arguments.of(new int[] {0}, 0),
                Arguments.of(new int[] {-8}, -8)
        );
    }

    @ParameterizedTest
    @MethodSource("arraysForPositiveAndCornerTestCases")
    public void checkThatMethodReturnsAverage(int[] numbers, double expectedResult) {
        double actualResult = methodsForUnitTestCases.findAverage(numbers);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkThatMethodReturnsException() {
        assertThrows(NoSuchElementException.class, () -> methodsForUnitTestCases.findAverage(new int [] {}));
    }
}
