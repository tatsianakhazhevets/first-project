package Practice8.video;

import Practice8.exceptions.BookNotFoundException;

public class Main {
    public static void main(String[] args) throws BookNotFoundException {
        Library library = new Library();

        library.addBook(new Book("1894", "Оруэлл"));
        library.addBook(new Book("Мартин Иден", "Лондон"));
        library.addBook(new Book("Онегин", "Пушкин"));
        // library.addBook(new Book("Онегин", "Пушкин"));

        try {
            library.findBook("344");
        } catch (BookNotFoundException e) {
            System.out.println("Поймали исключение");
        }



    }
}
