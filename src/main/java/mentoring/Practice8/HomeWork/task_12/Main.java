package mentoring.Practice8.HomeWork.task_12;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();

        LowerBoundGeneric.addAndPrintNumbers(integerList);
        System.out.println(integerList);
    }
}
