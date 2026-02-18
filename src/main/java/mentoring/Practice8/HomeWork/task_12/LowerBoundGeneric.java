package mentoring.Practice8.HomeWork.task_12;

import java.util.List;

public class LowerBoundGeneric {

    public static void addAndPrintNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(15);
        list.add(20);
    }
}
