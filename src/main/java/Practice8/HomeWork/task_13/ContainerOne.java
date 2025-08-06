package Practice8.HomeWork.task_13;

public class ContainerOne<T> implements Container<T> {

    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }

}
