package basic.access.example;

// 요구사항
// 접근 제어자를 사용하여 데이터를 캡슐화하기
// 해당 클래스는 다른 패키지에서도 사용 할 수 있어야한다.
public class Counter {

    private final int minCount = 0;
    private final int maxCount = 10;

    private int count;

    public Counter(){
        count = 5;
    }


    public int getCount(){
        return count;
    }
    public void increase(){
        if(!(count < maxCount && count >= minCount)){
            System.out.println("최대 count: " + maxCount +" - 더 이상 증가시킬 수 없습니다");
            return;
        }
        count++;
    }
    public void decrease(){
        if(!(count <= maxCount && count > minCount)){
            System.out.println("최소 count: " + minCount +" - 더 이상 감소시킬 수 없습니다.");
            return;
        }
        count--;
    }

}
