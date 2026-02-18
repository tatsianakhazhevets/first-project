package mentoring.Practice9.HomeWork.StreamPart3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task_5 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 5, 9, 3);

        boolean isEven = integers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println(isEven);
    }
}
