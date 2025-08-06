package Practice4.HomeWork;

import java.util.Scanner;

public class WhileHomeWork {
    public static void main(String[] args) {
        //factorial();
        //evenNumbers();
        positiveNumbers();

    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int i = 1;
        int result = 1;
        while (i <= number) {
            result = result * i;
            i++;
        }
        System.out.println(result);
    }

    public static void evenNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int i = 1;
        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        i++;
        }
    }


    public static void positiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            while (number >= 1) {
                System.out.println(number);
                number--;
            }
        } else {
            System.out.println("Ошибка данных!");
        }


    }


}
