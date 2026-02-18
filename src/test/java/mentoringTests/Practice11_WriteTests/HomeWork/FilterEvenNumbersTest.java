package mentoringTests.Practice11_WriteTests.HomeWork;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FilterEvenNumbersTest extends MethodsForUnitTestCasesTest {

    public static Stream<Arguments> listsForPositiveAndCornerCases() {
        return Stream.of(
                // Positive cases
                // odd/even + positive and 0
                Arguments.of(List.of(0, 1, 2, 3, 4), List.of(0, 2, 4)),
                // odd/even + negative and 0
                Arguments.of(List.of(0, -1, -2, -3, -4), List.of(0, -2, -4)),
                // odd/even + positive/negative/0
                Arguments.of(List.of(9, -6, 7, -100, 0), List.of(-6, -100, 0)),
                // even + positive
                Arguments.of(List.of(2, 4, 6, 8, 10), List.of(2, 4, 6, 8, 10)),
                // even + negative
                Arguments.of(List.of(-2, -4, -6, -8, -10), List.of(-2, -4, -6, -8, -10)),
                // odd + positive
                Arguments.of(List.of(5, 11, 25, 33, 1), List.of()),
                // odd + negative
                Arguments.of(List.of(-5, -11, -25, -33, -1), List.of()),
                // odd + negative + repeatable
                Arguments.of(List.of(-5, -5, -5, -5, -5), List.of()),
                // odd + positive + repeatable
                Arguments.of(List.of(5, 5, 5, 5, 5), List.of()),
                // even + positive + repeatable
                Arguments.of(List.of(4, 4, 4, 4, 4), List.of(4, 4, 4, 4, 4)),
                // even + negative + repeatable
                Arguments.of(List.of(-4, -4, -4, -4, -4), List.of(-4, -4, -4, -4, -4)),
                // 0
                Arguments.of(List.of(0, 0, 0, 0, 0), List.of(0, 0, 0, 0, 0)),
                //Corner cases
                Arguments.of(List.of(0), List.of(0)),
                Arguments.of(List.of(2), List.of(2)),
                Arguments.of(List.of(3), List.of()),
                Arguments.of(List.of(-6), List.of(-6)),
                Arguments.of(List.of(7), List.of()),
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("listsForPositiveAndCornerCases")
    public void checkThatMethodReturnsListOfEvenNumbers(List<Integer> numbers, List<Integer> expectedResult) {
        List<Integer> actualResult = methodsForUnitTestCases.filterEvenNumbers(numbers);
        assertIterableEquals(expectedResult, actualResult);

    }


    @Test
    public void checkThatMethodThrowsException() {
        assertThrows(NullPointerException.class, () -> methodsForUnitTestCases.filterEvenNumbers(Arrays.asList(null, 2, 7, 6, 9)));
    }
}