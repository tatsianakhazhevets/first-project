package Practice9.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FilterList {
    public static void main(String[] args) {
        // 1. Создать список целых чисел, далее отфильтровать все четные числа и суммировать их
        // Промежуточная - фильтрация по четности
        // Терминальная операция - суммирование

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // стрим
        // int sum = numbers.stream()
               // .filter(n -> n % 2 == 0)
               // .mapToInt(Integer::valueOf)
               // .sum();

        // стрим с распечаткой
        IntStream stream = numbers.stream()
                .filter(n -> {
                    System.out.println("filter" + n);
                    return n % 2 == 0;
                })
                .mapToInt(n -> {
                    System.out.println("mapToInt: " + n);
                    return n;
                });

        System.out.println("Стрим создан, но терминальный метод еще не вызван");

        int sum = stream.sum();

        System.out.println(sum);



    }
}
