package no_more_manual_level_up_automation.practice_five.conditional_statements_and_loops;

import java.util.Scanner;

public class ForTasks {

    public static void printNumbersFromOneTillHundredDividedByThree() {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }


    public static int sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            throw new IllegalArgumentException("Number must be more then 0");
        }

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }


    public static void printMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            throw new IllegalArgumentException("Number must be more then 0");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + number + " = " + i * number);
        }
    }


    public static boolean isPrimeCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            throw new IllegalArgumentException("Negative numbers, 0 and 1 are not prime numbers");
        }

        boolean isPrime = true;

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


    public static void printNumbersFromOneTillTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}