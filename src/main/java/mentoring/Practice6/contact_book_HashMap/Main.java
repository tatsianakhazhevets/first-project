package mentoring.Practice6.contact_book_HashMap;

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        contactBook.addContact("Никита", 1233);
        contactBook.addContact("Коля", 2344);

        contactBook.printContacts();

        contactBook.updatePhone("Коля", 2543);
        contactBook.printContacts();

    }



}
