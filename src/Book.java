import java.util.ArrayList;

public class Book {

    //attributes

    private String title;
    private String author;
    private String isbn;
    private int pages;


    public static ArrayList<Book> bookCollection = new ArrayList<Book>();

    //Object


    public Book(String title, String author, String isbn, int pages) {

    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.pages = pages;



    }



    //Setter

    public void setTitle(String newTitle) {

        this.title = newTitle;

    }
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }
    public void setIsbn(String newIsbn) {
        this.isbn = newIsbn;
    }
    public void setPages(int newPages) {
        this.pages = newPages;
    }

    //Getters

    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getIsbn() {
        return this.isbn;
    }
    public int getPages() {
        return this.pages;
    }

    //add book to bookCollection

    public static void addBook(Book book) {
        bookCollection.add(book);
    }

    //Remoce book from bookCollection

    public static void removeBook(Book book) {
        bookCollection.remove(book);
    }

    public static void sort(ArrayList<Book> books){

        books.sort((o2, o1)
    -> o1.getTitle().compareToIgnoreCase(o2.getTitle()));

    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", pages=" + pages +
                '}';
    }




}