package basic.extends0.super02.example;


// public final class Item
// 이렇게 클래스에 final 을 붙일 수 있는데 그럼 상속못해줌
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

    public final void cannotOverrideMethod(){
        System.out.println("이건 자식이어도 못 준다.");
    }

}
