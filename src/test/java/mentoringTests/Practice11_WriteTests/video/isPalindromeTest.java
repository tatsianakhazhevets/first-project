package mentoringTests.Practice11_WriteTests.video;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class isPalindromeTest extends StringProcessorTest {

    // часть, чтобы не писать перед каждым вызовом объект
    // вынесли в отдельный класс

    /*
    private VideoCodeStringProcessor videoCodeStringProcessor;
    @BeforeEach
    public void setupTest() {
        videoCodeStringProcessor = new VideoCodeStringProcessor();
    }
    */

    /*
    Тесты для проверки, является ли палиндромом:
    - позитивные кейсы
    -- четное количество: "abba" -> true
    -- нечетное количество: "hah" -> true
    - негативные кейсы
    -- "john" -> false
    - corner cases:
    - "a" - true
    - "" - true
    - null -> IllegalArgumentException
     */

    @ParameterizedTest
    @ValueSource(strings =  {
            // позитивные кейсы
            "abba", "hah",
            // угловые кейсы
            "a", ""})
    public void userCanCheckIfValidStringIsPalindrome(String initialString) {
        // VideoCodeStringProcessor videoCodeStringProcessor = new VideoCodeStringProcessor();

        boolean actualResult = videoCodeStringProcessor.isPalindrom(initialString);

        assertTrue(actualResult);
    }

    @Test
    public void userCanCheckIfStringIsNotPalindrome() {
        // VideoCodeStringProcessor videoCodeStringProcessor = new VideoCodeStringProcessor();

        String initialString = "john";

        boolean actualResult = videoCodeStringProcessor.isPalindrom(initialString);

        assertFalse(actualResult);
    }

    @Test
    public void userCannotCheckNullStringIsPalindrome() {
        assertThrows(IllegalArgumentException.class, () -> {
            videoCodeStringProcessor.reverse(null);
        }, "Checking if Null string is palindrome should lead to IllegalArgumentException");
    }
}
