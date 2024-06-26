package mid.lang.object.poly;

public class ObjectPolyExample01 {
    public static void main(String[] args) {
        Car car = new Car();
        Cat cat = new Cat();

        action(car);
        action(cat);
    }
    private static void action(Object object){
        
        // 직접만든 클래스에 정의한 메서드를 호출하기 위해선 객체 다운캐스팅 필요
        // Object 는 해당 메서드들을 모른다.
        if(object instanceof Car){
            ((Car) object).move();
        }else if(object instanceof Cat){
            ((Cat) object).sound();
        }
    }
}
