package mentoring.Practice9.HomeWork.StreamPart2;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("стул", "табуретка", "кот", "собака", "тигренок");

        List<String> stringsWithMoreThemFiveLetters = strings.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        System.out.println(stringsWithMoreThemFiveLetters);
    }
}
