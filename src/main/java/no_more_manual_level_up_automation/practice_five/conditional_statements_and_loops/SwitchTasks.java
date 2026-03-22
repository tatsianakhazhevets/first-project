package no_more_manual_level_up_automation.practice_five.conditional_statements_and_loops;

import java.util.Scanner;

public class SwitchTasks {

    public static String printDayOfTheWeekByNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number from 1 till 7 corresponds to day of the week: ");
        int number = scanner.nextInt();

        String dayOfTheWeek = "";
        switch (number) {
            case 1 -> dayOfTheWeek = "Monday";
            case 2 -> dayOfTheWeek = "Tuesday";
            case 3 -> dayOfTheWeek = "Wednesday";
            case 4 -> dayOfTheWeek = "Thursday";
            case 5 -> dayOfTheWeek = "Friday";
            case 6 -> dayOfTheWeek = "Saturday";
            case 7 -> dayOfTheWeek = "Sunday";
            default -> {
                if (number <= 0 || number > 7) {
                    throw new IllegalArgumentException("Number must be between 1 till 7");
                }
            }
        }
        return dayOfTheWeek;
    }


    public static String printTicketCostsByDayOfTheWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number from 1 till 7 corresponds to day of the week: ");
        int number = scanner.nextInt();

        String ticketCost = "";
        switch (number) {
            case 1, 2, 3, 4, 5 -> ticketCost = "300 RUB";
            case 6, 7 -> ticketCost = "450 RUB";
            default -> {
                if (number <= 0 || number > 7) {
                    throw new IllegalArgumentException("Number must be between 1 till 7");
                }
            }
        }
        return ticketCost;
    }


    public static String convertGradeFromDigitalTillLiteral() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grade from 0 till 100: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 100) {
            throw new IllegalArgumentException("Number must be between 0 till 100");
        }

        String literalGrade = "";
        switch (number / 10) {
            case 10, 9 -> literalGrade = "A";
            case 8 -> literalGrade = "B";
            case 7 -> literalGrade = "C";
            case 6 -> literalGrade = "D";
            default -> literalGrade = "F";
        }
        return literalGrade;
    }


    public static String processTextCommands() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the command: ");
        String command = scanner.nextLine();

        String message = "";
        switch (command) {
            case "start":
                message = "System is started";
                break;
            case "stop":
                message = "System is stopped";
                break;
            case "restart":
                message = "System is restarted";
                break;
            case "status":
                message = "System has status";
                break;
            default:
                System.out.println("The command is not correct. Please enter again.");
        }
        return message;
    }


    public static double calculateSimpleOperations() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter the operator: ");
        String operator = scanner.next();

        if (secondNumber == 0 && operator.equals("/")) {
            throw new IllegalArgumentException("Divisor could not be 0");
        }

        double result = 0.0;
        switch (operator) {
            case "+" -> result = firstNumber + secondNumber;
            case "-" -> result = firstNumber - secondNumber;
            case "*" -> result = firstNumber * secondNumber;
            case "/" -> result = firstNumber / secondNumber;
            default -> System.out.println("The operator is not correct. Please try again.");
        }
        return result;
    }
}