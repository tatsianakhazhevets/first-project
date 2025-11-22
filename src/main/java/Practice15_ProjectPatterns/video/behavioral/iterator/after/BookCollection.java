package Practice15_ProjectPatterns.video.behavioral.iterator.after;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements IterableCollection<Book> {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator();
    }


    class BookIterator implements Iterator<Book> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < books.size();
        }

        @Override
        public Book next() {
            if (hasNext()) {
                return books.get(currentIndex++);
            }
            return null;
        }
    }
}