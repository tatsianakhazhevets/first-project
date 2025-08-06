package Practice8.HomeWork.task_6;

public class GenericMethod {

    public static <T> void printArray(T[] arrayList) {
        for (T element : arrayList) {
            System.out.println(element);
        }
    }
}
