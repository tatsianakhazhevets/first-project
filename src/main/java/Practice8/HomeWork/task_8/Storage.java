package Practice8.HomeWork.task_8;

import java.util.stream.StreamSupport;

public class Storage <T> {

    private T element;

    public Storage(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void printStorage() {
        System.out.println(element);
    }
}
