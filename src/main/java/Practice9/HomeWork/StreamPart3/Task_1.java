package Practice9.HomeWork.StreamPart3;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 5, 8, 2, 9, 3);

        int maxValue = integers.stream()
                .max(Comparator.naturalOrder())
                .get();

        System.out.println(maxValue);
    }
}
