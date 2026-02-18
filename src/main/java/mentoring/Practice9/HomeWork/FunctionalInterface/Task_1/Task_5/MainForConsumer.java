package mentoring.Practice9.HomeWork.FunctionalInterface.Task_1.Task_5;

import java.util.function.Consumer;

public class MainForConsumer {
    public static void main(String[] args) {
        Consumer<String> printedString = (string) -> System.out.println(string);

        printedString.accept("Hello");
    }
}
