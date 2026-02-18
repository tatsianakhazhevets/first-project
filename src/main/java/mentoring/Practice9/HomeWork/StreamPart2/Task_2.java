package mentoring.Practice9.HomeWork.StreamPart2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numbersDividedByFive = integers.stream()
                .filter(n -> n % 5 ==0)
                .collect(Collectors.toList());

        System.out.println(numbersDividedByFive);
    }
}
