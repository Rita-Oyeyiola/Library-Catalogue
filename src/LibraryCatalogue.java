import java.util.ArrayList;

public class LibraryCatalogue {
        public ArrayList<Book> bookList =new ArrayList<>();

        public void addBook(Book books){
            bookList.add(books);
        }

        public void removeBook(String title){
            for (Book books : bookList){
                if(books.getTitle().equals(title)){
                    bookList.remove(books);
                    break;
                }
            }
        }
        public Book findBook(String title){
            for(Book books : bookList){
                if (books.getTitle().equals(title)){
                    return books;
                }
            }

            return null; }


        public void ListBooks(){
            for(Book books : bookList){
                System.out.println("Title" + books.getTitle());
                System.out.println("Author" + books.getAuthor());
                System.out.println("ISBN" + books.getISBN());
                System.out.println("Genre" + books.getGenre());
            }
        }








    }


