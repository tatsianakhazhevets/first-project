package Practice11_WriteTests.HomeWork;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class isAnagramTest extends MethodsForUnitTestCasesTest {

    public static Stream<Arguments> stringsForReturnTrue() {
         return Stream.of(
                // Positive cases
                // simple anagram + lower case
                Arguments.of("кот", "ток"),
                // equal anagram + lower case
                Arguments.of("траса", "траса"),
                // simple anagram + upper case
                Arguments.of(" СОН", " НОС"),
                // frace anagram + lover/upper case
                Arguments.of("Кот в доме", "Мед котов"),
                // digits anagram + space
                Arguments.of("123 456", "456 123"),
                // sign anagram + space
                Arguments.of("!@# $%^", "$%^!@#"),
                // Corner cases
                Arguments.of("abc", "cba"),
                Arguments.of("a", "a"),
                Arguments.of("", ""),
                Arguments.of("3", "3"),
                Arguments.of("!", "!")
         );
    }

    @ParameterizedTest
    @MethodSource("stringsForReturnTrue")
    public void checkThatMethodReturnTrue(String str1, String str2) {
        boolean actualResult = methodsForUnitTestCases.isAnagram(str1, str2);
        assertTrue(actualResult);
    }


    public static Stream<Arguments> stringsForReturnFalse() {
        return Stream.of(
                // Positive cases
                // simple anagram + lower case
                Arguments.of("кот", "сон"),
                // simple anagram + upper case
                Arguments.of(" Привет", " Пока"),
                // frace anagram + lover/upper case
                Arguments.of("Кот в доме", "Привет, мир!"),
                // digits anagram + space
                Arguments.of("123 456", "789 123"),
                // sign anagram + space
                Arguments.of("!@# $%^", "$%^?*("),
                // Negative cases
                Arguments.of(null, "кот"),
                Arguments.of("сон", null),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("stringsForReturnFalse")
    public void checkThatMethodReturnFalse(String str1, String str2) {
        boolean actualResult = methodsForUnitTestCases.isAnagram(str1, str2);
        assertFalse(actualResult);
    }
}