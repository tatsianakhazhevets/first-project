package no_more_manual_level_up_automation.practice_five.conditional_statements_and_loops;

import java.util.Scanner;

public class IfElseTasks {

    public static String checkNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        String result = "";
        if (number > 0) {
            result = "Number is positive";
        } else if (number < 0) {
            result = "Number is negative";
        } else {
            result = "Number is zero";
        }

        return result;
    }


    public static int printMaxNumber() {
        Scanner scanner = new Scanner(System.in);
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade from 1 till 5: ");
        int number = scanner.nextInt();

        if (number >= 6 || number <= 0) {
            throw new IllegalArgumentException("The grade must be from 1 till 5");
        }

        String textDescription = "";
        switch (number) {
            case 5:
                textDescription = "Excellent";
                break;
            case 4:
                textDescription = "Good";
                break;
            case 3:
                textDescription = "Satisfactorily";
                break;
            case 2:
            case 1:
                textDescription = "Unsatisfactorily";
                break;
        }

        return textDescription;
    }


    public static String checkParity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        String parity = "";
        if (number % 2 == 0) {
            parity = "Number is even";
        } else {
            parity = "Number is odd";
        }

        return parity;
    }


    public static String defineDiscountValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age <= 0 || age > 110) {
            throw new IllegalArgumentException("The age is not valid");
        }

        String discount = "";
        if (age < 18) {
            discount = "25%";
        } else if (age >= 65) {
            discount = "30%";
        } else {
            discount = "No discount";
        }

        return discount;
    }


    public static String evaluateGradeOnPoints() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grade from 0 till 100: ");
        int point = scanner.nextInt();

        if (point < 0 || point > 100) {
            throw new IllegalArgumentException("The grade must be from 0 till 100");
        }

        String pointDescription = "";
        if (point >= 90) {
            pointDescription = "Excellent";
        } else if (point >= 75 && point <= 89) {
            pointDescription = "Good";
        } else if (point >= 60 && point <= 74) {
            pointDescription = "Satisfactorily";
        } else {
            pointDescription = "Unsatisfactorily";
        }

        return pointDescription;
    }
}