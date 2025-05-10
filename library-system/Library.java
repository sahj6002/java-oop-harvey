import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void checkout(String title){
        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)){
                book.setAvailable(false);
                System.out.println(title + " checked out successfully.");
                return;
            }
        }
        System.out.println("Book not found " + title);
    }

    public void displayDetails(String title){
        for (Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                System.out.println(book.getTitle() + " by " + book.getAuthor() + " isbn:" + book.getIsbn());
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }
}
