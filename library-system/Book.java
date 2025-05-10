public class Book {
    private String title;
    private String author;
    private int isbn;
    private boolean isAvailable;

    public Book(String title,String author,int isbn,boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getIsbn(){
        return isbn;
    }

    public boolean getIsAvailable(){
        return isAvailable;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
}
