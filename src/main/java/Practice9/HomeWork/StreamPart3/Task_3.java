package Practice9.HomeWork.StreamPart3;

import java.util.Arrays;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 5, 8, 2, 9, 3);

        int sumOfNumbers = integers.stream()
                .mapToInt(n -> n.intValue())
                .sum();

        System.out.println(sumOfNumbers);
    }
}
