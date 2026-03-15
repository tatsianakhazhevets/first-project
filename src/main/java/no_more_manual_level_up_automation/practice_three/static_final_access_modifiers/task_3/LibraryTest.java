package no_more_manual_level_up_automation.practice_three.static_final_access_modifiers.task_3;

public class LibraryTest {
    public static void main(String[] args) {

        Library library = new Library();

        //library.bookTitle - access only via getter
        library.getBookTitle();
        String author = library.author;
        int year = library.year;
        String category = library.category;
    }
}