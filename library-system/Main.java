public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Harry Potter","JK Rowling",000001,true);
        Book book2 = new Book("IT","Stephen Hawking",000002,true);
        Book book3 = new Book("Sysphus","Danillo Camus",000003,true);

        Member member1 = new Member("Ian",121010,"ianpoloponyok@gmail.com");
        Member member2 = new Member("Abe",061406,"abe@gmail.com");
        Member member3 = new Member("Hasia",030421,"hasia@gmail.com");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        member1.borrowBook(book1);
        member1.returnBook(book1);
        member1.displayMemberInfo();
    }
}
