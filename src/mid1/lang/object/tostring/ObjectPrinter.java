package mid1.lang.object.tostring;

public abstract class ObjectPrinter {
    // 구체적인 클래스를 사용하는 것이 아닌, 추상적인 Object 클래스를 사용
    // ObjectPrinter 가 Object 클래스를 사용하는 것은 Object 클래스에 의존한다고 표현
    public static void print(Object obj){ // Object 타입을 매개변수로 사용하여 다형적 참조 사용
        String str = "객체 정보 출력: " + obj.toString();
        System.out.println(str);
    }

    /* ObjectPrinter 에서의 OCP 원칙설명
    Open: 새로운 클래스 추가, toString 오버라이딩을 통해 기능 확장
    Closed: 새로운 클래스를 추가해도 ObjectPrinter 는 변경할 필요가 없음
    */




    /* println()
    Object에 의존하고 있는 상황
    Open: 새로운 클래스 추가, toString 오버라이딩을 통해 기능 확장
    Closed: 새로운 클래스를 추가해도 println() 은 변경할 필요가 없음
    */

//    public void println(Object x) {
//        String s = String.valueOf(x);
//        synchronized (this) {
//            print(s);
//            newLine();
//        }
//    }


}
