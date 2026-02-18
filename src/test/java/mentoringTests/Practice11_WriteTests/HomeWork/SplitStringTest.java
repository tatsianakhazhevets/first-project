package mentoringTests.Practice11_WriteTests.HomeWork;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SplitStringTest extends MethodsForUnitTestCasesTest {

    public static Stream<Arguments> testDataForPositiveAndCornerCases() {
        return Stream.of(
                //Positive cases
                // Happy path
                Arguments.of("арбуз,дыня,персик", ",", new String[] {"арбуз", "дыня", "персик"}),
                // Same string
                Arguments.of("арбуз,арбуз,арбуз", ",", new String[] {"арбуз", "арбуз", "арбуз"}),
                // Delimiter at the beginning
                Arguments.of(",дыня,персик", ",", new String[] {"", "дыня", "персик"}),
                // Delimiter at the end
                Arguments.of("арбуз,дыня,", ",", new String[] {"арбуз", "дыня",}),
                // No Delimiter at the String
                Arguments.of("арбуздыняперсик", ",", new String[] {"арбуздыняперсик"}),
                // Delimiter is .
                Arguments.of("арбуз.дыня.персик", "\\.", new String[] {"арбуз", "дыня", "персик"}),
                // Delimiter is |
                Arguments.of("арбуз|дыня|персик", "\\|", new String[] {"арбуз", "дыня", "персик"}),
                // Delimiter in string and in delimiter part is different
                Arguments.of("арбуз-дыня-персик", ",", new String[] {"арбуз-дыня-персик"}),
                // Delimiter is special sign
                Arguments.of("арбуз!дыня!персик", "!", new String[] {"арбуз", "дыня", "персик"}),
                // String with the special signs
                Arguments.of("!@#,!$%,234", ",", new String[] {"!@#", "!$%", "234"}),
                // Corner cases
                Arguments.of("арбуз,", ",", new String[] {"арбуз"}),
                Arguments.of("", ",", new String[] {""}),
                Arguments.of(",,,", ",", new String[] {}),
                Arguments.of("a,,,b", ",", new String[] {"a", "", "", "b"})

        );
    }

    @ParameterizedTest
    @MethodSource("testDataForPositiveAndCornerCases")
    public void checkThatMethodSplitsString(String input, String delimiter, String[] expectedResult) {
        String[] actualResult = methodsForUnitTestCases.splitString(input, delimiter);
        assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void checkThatMethodThrowsException() {
        assertThrows(NullPointerException.class, () -> methodsForUnitTestCases.splitString("арбуз,дыня,персик", null));
        assertThrows(NullPointerException.class, () -> methodsForUnitTestCases.splitString(null, ","));
    }

}
