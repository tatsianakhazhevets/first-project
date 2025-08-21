package Practice11_WriteTests.HomeWork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import com.fasterxml.jackson.databind.ObjectMapper;

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


    // 3. Разворот строки.
    // Напишите тесты для метода, который переворачивает строку:
    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }


    // 4. Поиск максимального числа в массиве.
    // Напишите тесты для метода, который находит максимальное число в массиве:
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }


    // 5. Проверка, является ли год високосным.
    // Напишите тесты для метода, который определяет, является ли год високосным:
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 6. Проверка валидности email.
    // Напишите тесты для метода, который проверяет, является ли строка валидным email:
    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }


    // 7. Факториал числа.
    // Напишите тесты для метода, который вычисляет факториал числа:
    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        return (n == 0) ? 1 : n * factorial(n - 1);
    }


    // 8. Поиск второго максимального числа в массиве.
    // Напишите тесты для метода, который находит второе по величине число:

    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers)
                .distinct()
                .sorted()
                .skip(numbers.length - 2)
                .findFirst()
                .orElseThrow();
    }


    // 9. Подсчёт количества слов в строке.
    // Напишите тесты для метода, который считает количество слов в строке:

    public int countWords(String sentence) {
        return sentence
                .trim()
                .isEmpty() ? 0 : sentence.split("\\s+").length;
        //-> corrected .isEmpty() ? 0 : sentence.trim().split("\\s+").length;

    }

    // public static void main(String[] arrays) {
    //   System.out.println(Arrays.toString(" В лесу родилась елочка ".split("\\s+")));
    // }


    //10. Проверка валидности номера телефона.
    // Напишите тесты для метода, который проверяет валидность телефонного номера:

    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }


    // 11. Фильтрация списка чисел (оставить только чётные)

    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    // 12. Сортировка списка строк по длине
    public List<String> sortByLength(List<String> words) {
        return words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }


    // 13. Проверка, является ли строка анаграммой другой
    public boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null) return false;
        char[] arr1 = str1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] arr2 = str2.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }


    // 14. Нахождение среднего значения массива чисел
    public double findAverage(int[] numbers) {
        return Arrays.stream(numbers)
                .average()
                .orElseThrow();
    }


    // 15. Преобразование списка строк в список их длин
    public List<Integer> mapToLengths(List<String> words) {
        return words.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }


    // 16. Разбиение строки на части по разделителю
    public String[] splitString(String input, String delimiter) {
        return input.split(delimiter);
    }


    // 17. Проверка корректности пароля (длина, символы, цифры)
    public boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) return false;
        return password.matches("^(?=.*[A-Z])(?=.*\\d).+$");
    }


    // 18. Нахождение наибольшего общего делителя (НОД)
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // 19. Проверка, является ли строка JSON-объектом
    public boolean isValidJson(String json) {
        try {
            new ObjectMapper().readTree(json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // 20. Проверка, содержит ли массив дубликаты
    public boolean hasDuplicates(int[] numbers) {
        return Arrays.stream(numbers)
                .distinct()
                .count() != numbers.length;
    }
}