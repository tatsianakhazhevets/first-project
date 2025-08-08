package Practice11_WriteTests.HomeWork;

public class MethodsForUnitTestCases {

    // 1. Проверка чётности числа.
    // Напишите тесты для метода, который определяет,
    // является ли число чётным:

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 2. Подсчёт количества гласных в строке.
    // Напишите тесты для метода, который считает количество гласных букв в строке:

    public int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}