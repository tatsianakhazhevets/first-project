package mentoringTests.Practice11_WriteTests.video;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Class StringProcessor, method reverse")
public class ReverseStringTest extends StringProcessorTest {
    /* 1. Test design
       1.1 Scope of tests - corner cases
       - happy path: sasha -> ahsas
       - corner case
       -- "" -> "" (пустая строка)
       -- "a" -> "a" (однобуквенная)
       - negative path:
       -- null -> Illegal Argument Exception
     */


    public static Stream<Arguments> validStringsToReverse() {
        return Stream.of(
                // happy path: sasha -> ahsas
                Arguments.of("sasha", "ahsas"),
                // corner case: "" -> ""
                Arguments.of("", ""),
                // corner case: "a" -> "a"
                Arguments.of("a", "a"));
    }

    @ParameterizedTest
    @MethodSource("validStringsToReverse")
    public void userCanReverseValidString(String initialString, String expectedString) {
        // вначале создаем объект из класса, который тестируем
        // Удаление StringProcessor
        //VideoCodeStringProcessor videoCodeStringProcessor = new VideoCodeStringProcessor();
        // создаем переменную инпут
        // параметризация - выносим меняющиеся переменные в параметры метода!
        // String initialString = "sasha";
        // ожидаемая строка
        // String expectedString = "ahsas";
        // создаем переменную с результатом и обращаемся к методу из класса

        String reversedString = videoCodeStringProcessor.reverse(initialString);
        assertEquals(expectedString, reversedString, "String reversed incorrectly!!!");
    }

    /*
    Вместо повторяющегося кода -> параметризируем изменяемые данные
    @Test
    public void userCanReverseValidStringForCornerCase() {
        VideoCodeStringProcessor videoCodeStringProcessor = new VideoCodeStringProcessor();
        String initialString = "";
        String expectedString = "";
        String reversedString = videoCodeStringProcessor.reverse(initialString);
        assertEquals(expectedString, reversedString, "String reversed incorrectly!!!");
    }

    @Test
    public void userCanReverseValidStringForCornerCaseWithOneLetter() {
        VideoCodeStringProcessor videoCodeStringProcessor = new VideoCodeStringProcessor();
        String initialString = "a";
        String expectedString = "a";
        String reversedString = videoCodeStringProcessor.reverse(initialString);
        assertEquals(expectedString, reversedString, "String reversed incorrectly!!!");
    }
    */

    // негативный и позитивный тест никогда не соединяются в один тест!!!
    // если шаги теста меняются - это всегда новый тест

    @Test
    public void userCannotReverseNullString() {
        //VideoCodeStringProcessor videoCodeStringProcessor = new VideoCodeStringProcessor();
        // если здесь, то эксепшн просто выпадет
        // videoCodeStringProcessor.reverse(null);

        assertThrows(IllegalArgumentException.class, () -> {
            // внутри проходит отлов эксепшена
            videoCodeStringProcessor.reverse(null);
        }, "Reversing of null string should lead to IllegalArgumentException");
    }
}
