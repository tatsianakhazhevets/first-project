package mentoring.Practice15_ProjectPatterns.video.behavioral.iterator.after;

public interface IterableCollection<T> {
    Iterator<T> createIterator();
    // метод для создания итератора, можно сказать фабричный
}
