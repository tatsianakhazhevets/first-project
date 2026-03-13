package no_more_manual_level_up_automation.practice_first_firstProgram;

public class Main {
    public static void main(String[] args) {

        int add = MathOperations.add(11, 82);
        int sub = MathOperations.subtract(25, 6);
        int mult = MathOperations.multiply(5, 10);
        double div = MathOperations.divide(33, 6);
        int max = MathOperations.findMax(99, 66);
        int dif = MathOperations.difference(99, 66);
        int area = MathOperations.squareArea(5);
        int perimeter = MathOperations.squarePerimeter(6);
        double second = MathOperations.convertSecondsToMinutes(550);
        double speed = MathOperations.averageSpeed(50, 25);
        double hypotenuse = MathOperations.findHypotenuse(30, 25);
        double circle = MathOperations.circleCircumference(8);
        double percentage = MathOperations.calculatePercentage(60, 5);
        double fahrenheit = MathOperations.celsiusToFahrenheit(33);
        double celsius = MathOperations.fahrenheitToCelsius(14);

        System.out.println("The result of the method add() is " + add +
                "\nThe result of the method subtract() is " + sub +
                "\nThe result of the method multiply() is " + mult +
                "\nThe result of the method divide() is " + div +
                "\nThe result of the method findMax() is " + max +
                "\nThe result of the method difference() is " + dif +
                "\nThe result of the method squareArea() is " + area +
                "\nThe result of the method squarePerimeter() is " + perimeter +
                "\nThe result of the method convertSecondsToMinutes() is " + second +
                "\nThe result of the method averageSpeed() is " + speed +
                "\nThe result of the method findHypotenuse() is " + hypotenuse +
                "\nThe result of the method circleCircumference() is " + circle +
                "\nThe result of the method calculatePercentage() is " + percentage +
                "\nThe result of the method celsiusToFahrenheit() is " + fahrenheit +
                "\nThe result of the method fahrenheitToCelsius() is " + celsius);
    }
}