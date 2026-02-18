package mentoring.Practice11_WriteTests;

public class VideoCodeStringProcessor {

    // Метод для переворота строки
    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return new StringBuilder(input).reverse().toString();
    }

    // Метод для проверки, является ли строка палиндромом
    public boolean isPalindrom(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // Метод, который бросает исключение, если строка слишком короткая
    public String validateLength(String input, int minLenght) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        if (input.length() < minLenght) {
            throw new IllegalArgumentException("Input must be at least " + minLenght + " characters long");
        }
        return input;
    }
}
