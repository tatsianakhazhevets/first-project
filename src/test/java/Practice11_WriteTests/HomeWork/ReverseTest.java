package Practice11_WriteTests.HomeWork;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseTest extends MethodsForUnitTestCasesTest {

    public static Stream<Arguments> stringsForPositiveAndCornerCases() {
        return Stream.of(
                // positive cases
                Arguments.of("Hello World 365 times!", "!semit 563 dlroW olleH"),
                Arguments.of("cucumber", "rebmucuc"),
                Arguments.of("123456!@#$%^", "^%$#@!654321"),
                // corner cases
                Arguments.of("a", "a"),
                Arguments.of("", ""),
                Arguments.of(" ", " ")
        );
    }

    @ParameterizedTest
    @MethodSource("stringsForPositiveAndCornerCases")
    public void checkThatMethodReverseTheStringCorrectly(String input, String expectedResult) {
        String actualResult = methodsForUnitTestCases.reverse(input);
        assertEquals(expectedResult, actualResult);
    }


    public static Stream<Arguments> stringsForNegativeCases() {
        return Stream.of(
                // negative cases
                Arguments.of("abc", "abc"),
                Arguments.of("123456!@#$%^", "123456!@#$%^")
        );
    }

    @ParameterizedTest
    @MethodSource("stringsForNegativeCases")
    public void checkThatTheStringIsNotReverced(String input, String expectedResult) {
        String actualResult = methodsForUnitTestCases.reverse(input);
        assertNotEquals(expectedResult, actualResult);
    }

    @Test
    public void checkThatMethodReturnNull() {
        String actualResult = methodsForUnitTestCases.reverse(null);
        assertNull(actualResult);
    }
}
