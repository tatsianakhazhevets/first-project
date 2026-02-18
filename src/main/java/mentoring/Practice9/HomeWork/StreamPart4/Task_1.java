package mentoring.Practice9.HomeWork.StreamPart4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task_1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Вввв", "Аааа", "Ввв", "Нннн", "Ааа", "Рррр", "Ннн");

        Map<Character, List<String>> fistLetter = strings.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(fistLetter);
    }
}
