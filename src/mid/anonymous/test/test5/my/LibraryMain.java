package mid.anonymous.test.test5.my;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Java 마스터","송");
        library.addBook("자바의 정석","남궁");
        library.addBook("자바 완전 정복","김");
        library.addBook("자바 프로그래밍 입문","박");

        library.printBookList();
    }
}
