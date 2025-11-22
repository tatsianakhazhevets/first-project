package Practice15_ProjectPatterns.video.behavioral.iterator.after;

public interface Iterator<T> {
    boolean hasNext(); // метод возвращает тру, если есть следующий элемент в коллекции
    T next(); // метод возвращает следующий элемент коллекции
}