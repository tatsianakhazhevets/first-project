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

public class SortByLengthTest extends MethodsForUnitTestCasesTest {

    public static Stream<Arguments> listsForPositiveAndNegativeTestCases() {
        return Stream.of(
                // Positive
                // Natural order
                Arguments.of(List.of("a", "aa", "aaa", "aaaa", "aaaaaa"), List.of("a", "aa", "aaa", "aaaa", "aaaaaa")),
                // Reversed order
                Arguments.of(List.of("aaaaa", "aaaa", "aaa", "aa", "a"), List.of("a", "aa", "aaa", "aaaa", "aaaaa")),
                // Mixed order
                Arguments.of(List.of("aaa", "a", "aaaa", "aaaaa", "aa"), List.of("a", "aa", "aaa", "aaaa", "aaaaa")),
                // Repeated order
                Arguments.of(List.of("aaa", "a", "aaaa", "aa", "bb"), List.of("a", "aa", "bb", "aaa", "aaaa")),
                // Only repeated order
                Arguments.of(List.of("aaa", "aaa", "aaa", "aaa", "aaa"), List.of("aaa", "aaa", "aaa", "aaa", "aaa")),
                // With Special words
                Arguments.of(List.of("aaa", "!@#$%^", "aaaa", "25", "bb"), List.of("25", "bb", "aaa", "aaaa", "!@#$%^")),
                // Corner cases
                Arguments.of(List.of("aaa"), List.of("aaa")),
                Arguments.of(List.of("123"), List.of("123")),
                Arguments.of(List.of("!"), List.of("!")),
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("listsForPositiveAndNegativeTestCases")
    public void checkThatMethodSortsStringsCorrectly(List<String> words, List<String> expectedResult) {
        List<String> actualResult = methodsForUnitTestCases.sortByLength(words);
        assertIterableEquals(expectedResult, actualResult);

    }

    @Test
    public void checkThatMethodThrowsException() {
        assertThrows(NullPointerException.class, () -> methodsForUnitTestCases.sortByLength(null));
        assertThrows(NullPointerException.class, () -> methodsForUnitTestCases.sortByLength(Arrays.asList(null, "one", "two")));
    }
}