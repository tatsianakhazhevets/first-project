package mentoring.Practice9.HomeWork.StreamPart2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("стул", "стул", "табуретка", "кот", "собака", "тигренок", "кот", "собака", "тигренок");

        List<String> notDuplicatedElements = strings.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(notDuplicatedElements);
    }
}
