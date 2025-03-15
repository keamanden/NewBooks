

public class Test{


    public static void main(String[] args) {

      Book.bookCollection.add(new Book("harry potter", "j.k.Rowling", "0-3549-5491-1", 380 ));
      Book book2 = new Book("the lord of the rings", "j.k.Rowling", "0-7771-3681-3", 450 );
      Book book3 = new Book("the hobbit", "j.k.Rowling", "0-3542-5491-1", 380 );

      Book.addBook(book2);
      Book.addBook(book3);
      Book.sort(Book.bookCollection);

      System.out.println(Book.bookCollection);
      
    }

    //add book to book collection





}
