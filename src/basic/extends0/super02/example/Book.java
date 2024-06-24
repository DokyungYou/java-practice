package basic.extends0.super02.example;

public class Book extends Item{
    private String author;

    public Book(String name, int price,String author){
        super(name, price);
        this.author = author;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("저자: " + author);
    }
}
