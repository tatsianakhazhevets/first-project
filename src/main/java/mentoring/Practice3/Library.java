package mentoring.Practice3;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    Library(String someBookTitle, String someAuthor, int someYear, String someCategory){
        this.bookTitle = someBookTitle;
        this.author = someAuthor;
        this.year = someYear;
        this.category = someCategory;
    }

    String getBookTitle(){
        return this.bookTitle;
    }
    String getAuthor(){
        return this.author;
    }
    int getYear(){
        return this.year;
    }
    String getCategory(){
        return this.category;
    }

    void setBookTitle(String newBookTitle){
        this.bookTitle = newBookTitle;
    }
    void  setAuthor(String newAuthor){
        this.author = newAuthor;
    }
    void setYear(int newYear){
        this.year = newYear;
    }
    void setCategory(String newCategory){
        this.category = newCategory;
    }

    public void print(){
        System.out.println("Наименование книги: " + this.bookTitle + " Автор: " + this.author + " Год: " + this.year + " Категория " + this.category);
    }


}
