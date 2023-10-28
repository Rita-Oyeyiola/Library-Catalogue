import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LibraryCatalog libraryCatalog = new LibraryCatalog();

        while (true){
            System.out.println("Library Catalog Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Find Book");
            System.out.println("4. List Books");
            System.out.println("5. Exit");
            System.out.println("Enter your Choice:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    Book book = new Book();
                    System.out.println("Please enter the title of the book /n");
                    String title = scanner.nextLine();
                    book.setTitle(title);

                    System.out.println("Please enter the author of the book /n");
                    String author = scanner.nextLine();
                    book.setAuthor(author);

                    System.out.println("Please enter the isbn of the book /n");
                    String isbn = scanner.nextLine();
                    book.setISBN(isbn);

                    System.out.println("Please enter the genre of the book /n");
                    String genre = scanner.nextLine();
                    book.setISBN(genre);

                    libraryCatalog.addBook(book);
                    break;

                case 2:
                    System.out.println("Please enter the title of the book you want to remove");
                    String bookTitle = scanner.nextLine();
                    libraryCatalog.removeBook(bookTitle);
                    break;

                case 3:
                    System.out.println("Please enter the title of the book you want to find/n");
                    String bookName = scanner.nextLine();
                    Book bookInfo = libraryCatalog.findBook(bookName);

                    System.out.println("Title:" + bookInfo.getTitle());
                    System.out.println("Author:" + bookInfo.getAuthor());
                    System.out.println("ISBN:" + bookInfo.getISBN());
                    System.out.println("Genre:" + bookInfo.getGenre());
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    libraryCatalog.listBooks();
                    break;

                case 5:
                    System.out.println("Exiting. Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again./n");
                    break;



            }

        }

    }
}