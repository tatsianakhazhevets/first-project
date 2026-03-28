package no_more_manual_level_up_automation.practice_five.conditional_statements_and_loops;

import java.util.Scanner;

public class DoWhileTasks {

    private static final Scanner scanner = new Scanner(System.in);

    public static void requestPositiveNumber() {
        int number;
        do {
            System.out.print("Enter your number: ");
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("Number is positive");
    }


    public static void checkPassword() {
        String password;
        String correctPassword = "ok";
        do {
            System.out.print("Enter the password: ");
            password = scanner.nextLine();
        } while (!password.equals(correctPassword));

        System.out.println("The password is correct");
    }


    public static void printNumbersFromOneTillTen() {
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number <= 10);
    }


    public static void checkCommand() {
        String command;
        String correctCommand = "exit";
        do {
            System.out.print("Enter the command: ");
            command = scanner.nextLine();
            System.out.println("The entered command is " + command);
        } while (!command.equals(correctCommand));

        System.out.println("The program has finished");
    }


    public static void countDigitsQuantity() {
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        int count = 0;
        if (number < 0) {
            do {
                number = number / 10;
                count++;
            } while (number < 0);
        } else if (number >= 0) {
            do {
                number = number / 10;
                count++;
            } while (number > 0);
        }

        System.out.println("The digits quantity is " + count);
    }
}