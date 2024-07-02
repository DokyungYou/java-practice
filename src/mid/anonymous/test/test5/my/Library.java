package mid.anonymous.test.test5.my;

/* 도서 관리 시스템 만들기
여러권의 도서 정보를 관리할 수 있어야한다.
Book: 제목(title), 저자명(author) - Library 내부에서만 사용
기능: 도서 추가, 모든 도서 정보 출력
 */

import java.util.ArrayList;

public class Library { // 매번 만드는 중간에 깨닫는다. 아 캡슐화..
    private Book[] books;
    private int bookCount;

    public Library() {
        this.books = new Book[5];
        bookCount = 0;
    }

    public void addBook(String title, String author){
        if(bookCount >= books.length -1){
            System.out.println("더이상 책을 저장할 수 없습니다.");
            return;
        }
        books[bookCount++] = new Book(title,author);
    }

    public void printBookList(){
        for (Book book : books) {
            if(book != null) book.printInfo();
        }
    }

    private class Book{
        private String title;
        private String author;

         Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void printInfo(){
            System.out.printf("제목: %s | 저자: %s\n", title, author);
        }


    }

}
