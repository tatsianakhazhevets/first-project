package mentoring.Practice9.HomeWork.FunctionalInterface.Task_1.Task_3;

import java.util.function.Predicate;

public class MainForPredicate {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (number) -> number % 2 == 0;

        System.out.println(isEven.test(8));
    }
}
