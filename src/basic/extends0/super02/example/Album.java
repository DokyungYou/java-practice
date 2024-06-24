package basic.extends0.super02.example;

public class Album extends Item{
    private String artist;

    public Album(String name, int price, String artist){
        super(name, price);
        this.artist = artist;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("아티스트: "+ artist);
    }
}
