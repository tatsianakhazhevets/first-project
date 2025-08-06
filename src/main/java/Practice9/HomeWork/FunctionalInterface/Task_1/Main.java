package Practice9.HomeWork.FunctionalInterface.Task_1;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        MathOperation add = (x, y) -> x + y;
        MathOperation subtract = (x, y) -> x - y;
        MathOperation multiply = (x, y) -> x * y;
        MathOperation divide = (x, y) -> x / y;

        DecimalFormat df = new DecimalFormat("#.#");

        System.out.println(add.apply(2.2, 3.3));
        System.out.println(df.format(subtract.apply(4.4, 3.3)));
        System.out.println(multiply.apply(5.5, 10));
        System.out.println(divide.apply(6.6, 3.3));

    }
}
