package mentoring.Practice8.HomeWork.task_9;

import java.util.List;

public class TaskNine {

    public static <T> void printList(List<T> list) {
        for(T elements : list) {
            System.out.println(elements);
        }
    }
}
