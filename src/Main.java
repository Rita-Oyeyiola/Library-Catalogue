import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Book books = new Book();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the author of the book");
        String author = scanner.nextLine();
        books.setAuthor(author);

        System.out.println("Please enter the title of the book");
        String title = scanner.nextLine();
        books.setTitle(title);

        System.out.println("Please enter the ISBN of the book");
        String ISBN = scanner.nextLine();
        books.setISBN(ISBN);

        System.out.println("Please enter genre");
        String genre = scanner.nextLine();
        books.setGenre(genre);


        ArrayList<String> LibraryBooks =
               new ArrayList<>(Arrays.asList("science","math","english","political science"));

        LibraryCatalogue libraryAccess = new LibraryCatalogue();
        System.out.println(LibraryBooks);



    }
}