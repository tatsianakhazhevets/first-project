package mentoring.Practice4.HomeWork;

import java.util.Scanner;

public class BreakContinueHomeWork {
    public static void main(String[] args) {
        //sumOfNumbers();
        //countTillTwenty();
        tenNumbers();
    }

    public static int sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            if (number <= 0) {
                System.out.print("Неверное значение");
                break;
            }
            sum += number;
            System.out.println("Сумма чисел: " + sum);
        }
        return sum;
    }

    public static void countTillTwenty() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void tenNumbers() {
        int number = 1;
        int counter = 0;

        while (true) {
            if (number % 2 == 0 && number % 5 == 0) {
                System.out.println(number);
                counter++;
            }
            if (counter == 10) {
                break;
            }
            number++;
        }

    }


}
