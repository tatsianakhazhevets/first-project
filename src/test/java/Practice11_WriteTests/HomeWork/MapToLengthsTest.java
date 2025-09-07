package Practice11_WriteTests.HomeWork;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MapToLengthsTest extends MethodsForUnitTestCasesTest {

    public static Stream<Arguments> arraysForPositiveAndCornerCases() {
        return Stream.of(
                // Positive cases
                // Ascending
                Arguments.of(List.of("t", "tt", "ttt", "tttt", "ttttt"), List.of(1, 2, 3, 4, 5)),
                // Descending
                Arguments.of(List.of("ttttt", "tttt", "ttt", "tt", "t"), List.of(5, 4, 3, 2, 1)),
                // Mixed
                Arguments.of(List.of("tttt", "tt", "ttttt", "ttt", "t"), List.of(4, 2, 5, 3, 1)),
                // Same
                Arguments.of(List.of("tt", "tt", "tt", "tt", "tt"), List.of(2, 2, 2, 2, 2)),
                // Same 0
                Arguments.of(List.of("", "", "", "", ""), List.of(0, 0, 0, 0, 0)),
                // Mixed special sing
                Arguments.of(List.of("qqq", "!@#$", "123", "TH", ""), List.of(3, 4, 3, 2, 0)),
                // Corner cases
                Arguments.of(List.of("q"), List.of(1)),
                Arguments.of(List.of("6"), List.of(1)),
                Arguments.of(List.of("!"), List.of(1)),
                Arguments.of(List.of(""), List.of(0))

        );
    }

    @ParameterizedTest
    @MethodSource("arraysForPositiveAndCornerCases")
    public void checkThatMethodMapStringsToIntegers(List<String> words, List<Integer> expectedResult) {
        List<Integer> actualResult = methodsForUnitTestCases.mapToLengths(words);
        assertIterableEquals(expectedResult, actualResult);
    }

    @Test
    public void checkThatMethodThrowsException() {
        assertThrows(NullPointerException.class, () -> methodsForUnitTestCases.mapToLengths(null));
        assertThrows(NullPointerException.class, () -> methodsForUnitTestCases.mapToLengths(Arrays.asList(null, "one", "two")));
    }
}