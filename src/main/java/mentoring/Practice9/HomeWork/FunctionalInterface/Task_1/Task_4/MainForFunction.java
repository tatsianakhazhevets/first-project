package mentoring.Practice9.HomeWork.FunctionalInterface.Task_1.Task_4;

import java.util.function.Function;

public class MainForFunction {
    public static void main(String[] args) {
        Function<String, Integer> stringToLenght = (string) -> string.length();

        System.out.println(stringToLenght.apply("lambda"));
    }
}
