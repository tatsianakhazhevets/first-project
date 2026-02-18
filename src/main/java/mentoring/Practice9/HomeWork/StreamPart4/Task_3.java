package mentoring.Practice9.HomeWork.StreamPart4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task_3 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 5, 2, 7, 9, 10, 8);

        double average = integers.stream()
                .collect(Collectors.averagingInt(n -> n));

        System.out.println(average);
    }
}
