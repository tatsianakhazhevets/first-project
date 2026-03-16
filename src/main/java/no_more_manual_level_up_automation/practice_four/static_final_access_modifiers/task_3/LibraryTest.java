package no_more_manual_level_up_automation.practice_four.static_final_access_modifiers.task_3;

public class LibraryTest {
    public static void main(String[] args) {

        Library library = new Library();

        String author = library.author;
        int year = library.year;
        String category = library.category;

        System.out.println("The bookTitle field with the private access modifier can only be accessed via a getter: " + library.getBookTitle() +
                "\nThe author field with the protected access modifier can be accessed directly: " + author +
                "\nThe year field with the default access modifier can be accessed directly: " + year +
                "\nThe category field with the public access modifier can be accessed directly: " + category);

    }
}