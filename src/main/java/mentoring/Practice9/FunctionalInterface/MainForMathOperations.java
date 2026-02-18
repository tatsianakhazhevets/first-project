package mentoring.Practice9.FunctionalInterface;

public class MainForMathOperations {
    public static void main(String[] args) {
        MathOperation add = (x, y) -> x + y;
        MathOperation subtract = (x, y) -> x - y;
        MathOperation multiply = (x, y) -> x * y;
        MathOperation divide = (x, y) -> x / y;


        System.out.println(add.apply(2, 3));
        System.out.println(subtract.apply(10, 7));
        System.out.println(multiply.apply(8, 3));
        System.out.println(divide.apply(15, 5));


    }
}
