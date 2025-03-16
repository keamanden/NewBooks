import java.util.ArrayList;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);


        while (true) {
            menu();
            useCase(Scanner);
            checkDupes();
        }
    }


    public static void menu() {
        System.out.println("1. Add a book");
        System.out.println("2. Remove a book");
        System.out.println("3. Sort the books");
        System.out.println("4. Display books");

    }

    public static void useCase(Scanner scanner) {
        Scanner Scanner = new Scanner(System.in);
        int userInput = Scanner.nextInt();
        switch (userInput) {

            case 1:
                System.out.println("You chose to add a book");
                System.out.println("Enter the title of the book");
                String title = Scanner.next();
                System.out.println("Enter the author of the book");
                String author = Scanner.next();
                System.out.println("Enter the isbn of the book");
                String isbn = Scanner.next();
                System.out.println("Enter the number of pages of the book");
                int pages = Scanner.nextInt();

                Book newBook = new Book(title, author, isbn, pages);
                Book.addBook(newBook);
                System.out.println("new book added = " + newBook);
                break;

            case 2:
                System.out.println("You chose to remove a book");
                System.out.println("Enter the title of the book");
                String title2 = Scanner.next();
                Book.bookCollection.removeIf(book -> book.getTitle().equals(title2));

                break;

            case 3:
                System.out.println("You chose to sort the books");
                Book.sortByName(Book.bookCollection);
                break;

            case 4:
                System.out.println(Book.bookCollection);
                break;


        }


    }

    public static void checkDupes() {

        for (int i = 0; i < Book.bookCollection.size(); i++) {
            System.out.println("outer i =" + i);
            for (int j = i + 1; j < Book.bookCollection.size(); j++) {
                System.out.println("inner j =" + j);
                System.out.println(Book.bookCollection.get(i).getTitle() + Book.bookCollection.get(j).getTitle());
                if (Book.bookCollection.get(i).getTitle().equals(Book.bookCollection.get(j).getTitle())) {

                    Book.bookCollection.remove(j);

                    System.out.println("Duplicate found");
                }
            }
        }


    }


}
