package no_more_manual_level_up_automation.practice_five.conditional_statements_and_loops;

import java.util.Scanner;

public class IfElseTasks {

    private static final Scanner scanner = new Scanner(System.in);

    public static String checkNumber() {
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            return "Number is positive";
        } else if (number < 0) {
            return "Number is negative";
        } else {
            return "Number is zero";
        }
    }


    public static int printMaxNumber() {
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int maxNumber = 0;
        if (firstNumber >= secondNumber) {
            maxNumber = firstNumber;
        } else {
            maxNumber = secondNumber;
        }

        return maxNumber;
    }


    public static String defineGradeOnScale() {
        System.out.print("Enter your grade from 1 till 5: ");
        int number = scanner.nextInt();

        return switch (number) {
            case 5 -> "Excellent";
            case 4 -> "Good";
            case 3 -> "Satisfactorily";
            case 2, 1 -> "Unsatisfactorily";
            default -> throw new IllegalArgumentException("The grade must be from 1 till 5");
        };
    }


    public static String checkParity() {
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            return "Number is even";
        } else {
            return "Number is odd";
        }
    }


    public static String defineDiscountValue() {
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age <= 0 || age > 110) {
            throw new IllegalArgumentException("The age is not valid");
        }

        if (age < 18) {
            return "25%";
        } else if (age >= 65) {
            return "30%";
        } else {
            return "No discount";
        }
    }


    public static String evaluateGradeOnPoints() {
        System.out.print("Enter the grade from 0 till 100: ");
        int point = scanner.nextInt();

        if (point < 0 || point > 100) {
            throw new IllegalArgumentException("The grade must be from 0 till 100");
        }

        if (point >= 90) {
            return "Excellent";
        } else if (point >= 75 && point <= 89) {
            return "Good";
        } else if (point >= 60 && point <= 74) {
            return "Satisfactorily";
        } else {
            return "Unsatisfactorily";
        }
    }
}