package Practice8.generics;

// реализует хранение объекта любого типа
// public class Box<T extends Book> {
public class Box<T> {
    // переменная хранилище
    private T element;

    // кладем элемент
    public void setElement(T element) {
        this.element = element;
    }

    // читаем, получаем доступ
    public T getElement() {
        return this.element;
    }
}
