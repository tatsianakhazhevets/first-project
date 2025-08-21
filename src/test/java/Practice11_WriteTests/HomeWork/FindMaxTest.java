package Practice11_WriteTests.HomeWork;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxTest extends MethodsForUnitTestCasesTest {

    public static Stream<Arguments> arraysForPositiveAndCornerCases() {
        return Stream.of(
                // positive test cases
                Arguments.of(new int[] {9, 5, 3, 0, 1}, 9),
                Arguments.of(new int[] {5, 3, 0, 1, 10}, 10),
                Arguments.of(new int[] {-1, -3, -20, -15, -10}, -1),
                Arguments.of(new int[] {-13, -3, 0, -15, -2}, 0),
                Arguments.of(new int[] {-13, -3, -100, -15, -2}, -2),
                Arguments.of(new int[] {-13, 13, 0, -15, -2}, 13),
                Arguments.of(new int[] {5, 5, 5, 5, 5}, 5),
                // corner test cases
                Arguments.of(new int[] {1}, 1),
                Arguments.of(new int[] {0}, 0),
                Arguments.of(new int[] {-1}, -1),
                Arguments.of(new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE, }, Integer.MAX_VALUE)
        );
    }


    @ParameterizedTest
    @MethodSource("arraysForPositiveAndCornerCases")
    public void checkThatMethodCanFindMaxValueInArray(int[] numbers, int expectedResult) {
        int actualResult =  methodsForUnitTestCases.findMax(numbers);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkThatMethodThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> {
            methodsForUnitTestCases.findMax(null);
        });
    }

    @Test
    public void checkThatMethodThrowsNoSuchElementException() {
        assertThrows(NoSuchElementException.class, () -> {
            methodsForUnitTestCases.findMax(new int[] {});
        });
    }
}