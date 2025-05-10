import java.util.ArrayList;
import java.util.List;


public class Member {
    private String name;
    private int memberId;
    private String email;
    private List<Book> booksCheckedOut;

    public Member(String name,int memberId, String email){
        this.name = name;
        this.memberId = memberId;
        this.email = email;
        this.booksCheckedOut = new ArrayList<>();
    }

    public void borrowBook(Book book){
        if (book.getIsAvailable()){
            booksCheckedOut.add(book);
            book.setAvailable(false);
            return;
        }else{
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Book book){
        if (booksCheckedOut.contains(book)){
            booksCheckedOut.remove(book);
            book.setAvailable(true);
            return;
        } else {
            System.out.println("Book is borrowed by a member.");
        }
    }

    public void displayMemberInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + memberId);
        System.out.println("Email: " + email);
        System.out.println("Books Checked out:");
        for (Book book : booksCheckedOut){
            System.out.println(" - " + book.getTitle());
        }
    }

}
