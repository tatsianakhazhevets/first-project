package mentoring.Practice8.HomeWork.task_10;

import java.util.List;

public class NumberBox <T extends Number> {

    private T number;

    public static <T extends Number> void sumOfNumbers(List<T> list) {
        int result = 0;

        for(T number : list) {
            result += number.intValue();
        }
        System.out.println(result);
    }
}
