package mentoring.Practice9.HomeWork.StreamPart3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task_4 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Малина", "Банан", "Клубника", "Персик", "Брусника");

        Optional<String> bString = strings.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst();

        System.out.println(bString);

    }
}
