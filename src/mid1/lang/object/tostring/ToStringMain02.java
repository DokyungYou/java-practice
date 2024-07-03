package mid1.lang.object.tostring;

public class ToStringMain02 {
    public static void main(String[] args) {

        Car car = new Car("제네시스");  // toString 오버라이딩 X
        Cat cat = new Cat("고영희", 5); // toString 오버라이딩 O


        System.out.println("1. 현 위치에서 직접 toString 호출");
        System.out.println(car.toString());
        System.out.println(cat.toString());

        System.out.println();


        System.out.println("2. print 메서드 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(cat);

        System.out.println();


        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(cat);

        System.out.println();
        
        
        // 필요에 의해서 toString() 재정의시 참조값을 볼 수 없다.
        // 이때는  System.identityHashCode(Object x) 를 사용
        int identityHashCode = System.identityHashCode(cat); // 숫자만 나오는데 이것이 진짜 참조값
        System.out.println(identityHashCode);

        String refValue = Integer.toHexString(identityHashCode); // 16진수화한 값이 우리가 보던 참조값
        System.out.println(refValue);
    }
}
