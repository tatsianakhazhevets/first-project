package mentoringTests.Practice11_WriteTests.HomeWork;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class countVowelsTest extends MethodsForUnitTestCasesTest {

   public static Stream<Arguments> stringsForCheckPositiveAndCornerTestCases() {
        return Stream.of(
               // positive test cases
                Arguments.of("Hello World!", 3),
                Arguments.of("aeiou", 5),
                Arguments.of("UOIAE", 5),
                Arguments.of("ghvbn", 0),
                Arguments.of("GHVBN", 0),
                Arguments.of("12 Stories", 3),
                // corner test cases
                Arguments.of("a", 1),
                Arguments.of("c", 0),
                Arguments.of("y", 0),
                Arguments.of("", 0)

        );
   }

    @ParameterizedTest
    @MethodSource("stringsForCheckPositiveAndCornerTestCases")
    public void methodCountVowelsCorrectly(String input, int expectedResult) {
        int actualResult = methodsForUnitTestCases.countVowels(input);
        assertEquals(actualResult, expectedResult);
   }

   @Test
   public void methodCountVowelsIncorrectly() {
        assertThrows(IllegalArgumentException.class, () -> {
            methodsForUnitTestCases.countVowels(null); },
                    "Input is not correct.");
   }
}