package Practice9.HomeWork.StreamPart2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("переменная", "декларирование", "инициализация", "компиляция", "интерпретация");

        List<Integer> lenght = strings.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println(lenght);
    }
}
