package no_more_manual_level_up_automation.practice_first_firstProgram;

public class MathOperations {

    public static int add(int firstAddend, int secondAddend) {
        return firstAddend + secondAddend;
    }

    public static int subtract(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }

    public static int multiply(int firstFactor, int secondFactor) {
        return firstFactor * secondFactor;
    }

    public static double divide(int dividend, int divisor) {
        return dividend / (double) divisor;
    }

    public static int findMax(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }

    public static int difference(int firstValue, int secondValue) {
        return Math.abs(firstValue - secondValue);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    public static double averageSpeed(double distance, double time) {
        if (time == 0) {
            throw new IllegalArgumentException("Time cannot be 0");
        }
        return distance / time;
    }

    public static double findHypotenuse(double firstLeg, double secondLeg) {
        return Math.sqrt(firstLeg * firstLeg + secondLeg * secondLeg);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        if (total == 0) {
            throw new IllegalArgumentException("Total cannot be 0");
        }
        return (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}