package mentoring.Practice9.HomeWork.StreamPart2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_4 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> doubleNumbers = integers.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());

        System.out.println(doubleNumbers);
    }
}
