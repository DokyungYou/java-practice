package basic.extends0.super02.example;

public class Item {
    // 매번 캡슐화해야한다는걸 까먹는다..
    private String name;
    private int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void showInfo(){
        System.out.println("이름: "+ name+ " 가격: "+ price);
    }

}
