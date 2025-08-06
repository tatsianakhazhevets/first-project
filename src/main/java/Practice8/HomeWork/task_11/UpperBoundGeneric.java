package Practice8.HomeWork.task_11;

import java.util.List;

public class UpperBoundGeneric {

    public static void sumOfElements(List<? extends Number> list) {
        double result = 0.0;

        for(Number element : list) {
            result += element.doubleValue();
        }
        System.out.println(result);
    }
}
