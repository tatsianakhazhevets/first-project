package Practice11_WriteTests.HomeWork;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordsTest extends  MethodsForUnitTestCasesTest {

   public static Stream<Arguments> sentencesForPositiveAndCornerCases() {
        return Stream.of(
                // Positive cases
                Arguments.of("В лесу родилась елочка", 4),
                Arguments.of(" В лесу родилась елочка ", 4),
                Arguments.of(" кошка и собака ", 3),
                Arguments.of("Привет, как дела?", 3),
                Arguments.of("123 456 789", 3),
                Arguments.of("8-123-456-789", 1),
                Arguments.of("company&core", 1),
                //Corner cases
                Arguments.of(" В ", 1),
                Arguments.of(" Яблоко ", 1),
                Arguments.of("В А Т", 3),
                Arguments.of("", 0),
                Arguments.of(" ", 0)
        );
   }

    @ParameterizedTest
    @MethodSource("sentencesForPositiveAndCornerCases")
    public void checkThatMethodCountWordsCorrectly(String sentence, int expectedResult) {
        int actualResult = methodsForUnitTestCases.countWords(sentence);
        assertEquals(expectedResult, actualResult);
   }

    @Test
    public void checkThatMethodCountWordsIncorrectly() {
        assertThrows(NullPointerException.class,
                () -> methodsForUnitTestCases.countWords(null));
   }
}