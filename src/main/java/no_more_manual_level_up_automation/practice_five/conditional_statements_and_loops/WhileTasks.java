package no_more_manual_level_up_automation.practice_five.conditional_statements_and_loops;

import java.util.Scanner;

public class WhileTasks {

    public static long countFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number from 0 till 20: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 20) {
            throw new IllegalArgumentException("Number must be from 0 till 20");
        }

        int i = 1;
        long factorial = 1L;

        if (number == 0) {
            factorial = 1L;
        }

        while (i <= number) {
            factorial *= i;
            i++;
        }
        return factorial;
    }


    public static void printEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive");
        }

        int i = 1;
        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }


    public static void printReversedOrderOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive");
        }

        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}