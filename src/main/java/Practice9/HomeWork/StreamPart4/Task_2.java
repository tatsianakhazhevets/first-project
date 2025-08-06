package Practice9.HomeWork.StreamPart4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 5, 2, 7, 9, 10, 8);

        Map<Boolean, List<Integer>> evenAndOddNumbers = integers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));

        System.out.println(evenAndOddNumbers);
    }
}
