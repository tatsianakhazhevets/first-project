package mentoring.Practice4.HomeWork;

import java.util.Scanner;

public class DoWhileHomeWork {
    public static void main(String[] args) {
        //positiveNumber();
        //checkPassword();
        fromOneToTen();
    }

    public static void positiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.print("Положительное число!");
    }

    public static void checkPassword() {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
        } while (!password.equals("Верный"));
        System.out.print("Пароль подходит!");
    }

    public static void fromOneToTen() {
        int number = 1;

        do {
            System.out.println(number);
            number++;
        } while (number <= 10);
    }

}
