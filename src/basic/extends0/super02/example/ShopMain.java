package basic.extends0.super02.example;

// Book, Album, Movie 상품 클래스 만들기 (코드 중복이 없게 상속 관계를 사용)
// 공통 속성: name, price
public class ShopMain {
    public static void main(String[] args) {

        Book book = new Book("자바의정석", 27000,"남궁*");
        Album album = new Album("앨범1",100000, "아티스트1");
        Movie movie = new Movie("영화1",10000,"감독1",new String[]{"배우1","배우2", "배우3"});


        book.showInfo();
        album.showInfo();
        movie.showInfo();
    }
}
