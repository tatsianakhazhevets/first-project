package no_more_manual_level_up_automation.practice_first_firstProgram;

public class MathOperations {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return Math.round(x / (double) y);
    }

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int difference(int a, int b) {
        return Math.abs(a - b);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return Math.round(seconds / 60.0);
    }

    public static double averageSpeed(double distance, double time) {
        if (time == 0) {
            throw new IllegalArgumentException("Time couldn't be 0");
        }
        return Math.round(distance / time);
    }

    public static double findHypotenuse(double a, double b) {
        return Math.round(Math.sqrt(a * a + b * b));
    }

    public static double circleCircumference(double radius) {
        return Math.round(2 * Math.PI * radius);
    }

    public static double calculatePercentage(double total, double part) {
        if (total == 0) {
            throw new IllegalArgumentException("Time couldn't be 0");
        }
        return Math.round((part / total) * 100);
    }

    public static double celsiusToFahrenheit(double c) {
        return Math.round(c * 9 / 5 + 32);
    }

    public static double fahrenheitToCelsius(double f) {
        return Math.round((f - 32) * 5 / 9);
    }
}