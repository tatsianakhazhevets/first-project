package no_more_manual_level_up_automation.practice_five.conditional_statements_and_loops;

import java.util.Scanner;

public class BreakContinueTasks {

    public static void countSumUntilNegativeNumber() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("The value is negative.");
                break;
            }
            sum += number;
            System.out.println("The sum of the numbers is " + sum);
        }
    }


    public static void skipValuesDividedByThree() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }


    public static void printPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter the number: ");
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("The number is negative");
                continue;
            }
            System.out.println("Printed value is " + number);
        } while (true);
    }


    public static void enterStringsUntilCommandStop() {
        Scanner scanner = new Scanner(System.in);

        String command;
        String correctCommand = "stop";
        while (true) {
            System.out.print("Enter the command: ");
            command = scanner.nextLine();
            if (command.equals(correctCommand)) {
                System.out.println("The process is stopped");
                break;
            }
        }
    }
}