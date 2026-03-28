package no_more_manual_level_up_automation.practice_five.conditional_statements_and_loops;

import java.util.Scanner;

public class SwitchTasks {

    private static final Scanner scanner = new Scanner(System.in);

    public static String printDayOfTheWeekByNumber() {
        System.out.print("Enter the number from 1 till 7 corresponds to day of the week: ");
        int number = scanner.nextInt();

        return switch (number) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalArgumentException("Number must be between 1 till 7");
        };
    }


    public static String printTicketCostsByDayOfTheWeek() {
        System.out.print("Enter the number from 1 till 7 corresponds to day of the week: ");
        int number = scanner.nextInt();

        return switch (number) {
            case 1, 2, 3, 4, 5 -> "300 RUB";
            case 6, 7 -> "450 RUB";
            default -> throw new IllegalArgumentException("Number must be between 1 till 7");
        };
    }


    public static String convertGradeFromDigitalTillLiteral() {
        System.out.print("Enter the grade from 0 till 100: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number < 0 || number > 100) {
            throw new IllegalArgumentException("Number must be between 0 till 100");
        }

        return switch (number / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
    }


    public static String processTextCommands() {
        System.out.print("Enter the command: ");
        String command = scanner.nextLine();

        return switch (command) {
            case "start" -> "System is started";
            case "stop" -> "System is stopped";
            case "restart" -> "System is restarted";
            case "status" -> "System has status";
            default -> "The command is not correct. Please enter again.";
        };
    }


    public static double calculateSimpleOperations() {
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter the operator: ");
        String operator = scanner.next();

        if (secondNumber == 0 && operator.equals("/")) {
            throw new IllegalArgumentException("Divisor could not be 0");
        }

        return switch (operator) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            default -> throw new IllegalArgumentException("The operator is not correct. Please try again.");
        };
    }
}