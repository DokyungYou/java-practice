package mid1.anonymous.test.test5.answer;

/* 도서 관리 시스템 만들기
여러권의 도서 정보를 관리할 수 있어야한다.
Book: 제목(title), 저자명(author) - Library 내부에서만 사용
기능: 도서 추가, 모든 도서 정보 출력
 */

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        this.books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(String title, String author){
        // 검증로직을 앞에 , 정상로직을 마지막에 넣으면 가독성 좋은듯 하고, 후에 검증로직 추가할때도 편함
        if(bookCount >= books.length){
            System.out.println("더이상 책을 저장할 수 없습니다.");
            return;
        }
        books[bookCount++] = new Book(title,author);
    }

    public void printBookList(){
        for (int i = 0; i < bookCount; i++) {
            System.out.printf("제목: %s | 저자: %s\n", books[i].title, books[i].author);
        }
    }

    // Book 이 Library의 것을 사용한다면 InnerClass
    // 아니라면 static
    private static class Book{
        private String title;
        private String author;

         Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

    }

}
