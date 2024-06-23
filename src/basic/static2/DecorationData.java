package basic.static2;

public class DecorationData {

    private int instanceValue;
    private static int staticValue;


    // static에선 static만 접근가능 <=> 인스턴스는 static 을  찾아갈 수 있음
    // static 을 사용하는 시점에서 인스턴스요소의 존재유무도 모르며, 존재해도 static 은 참조값 없이 호출하기때문에 인스턴스에 접근 차제가 불가 (매개변수로 인스턴스를 넘겨서 사용하는것과는 다른개념)
    public static void staticMethod(){

        // instanceValue++;
        // instanceCall();

        staticValue++;
        System.out.println("staticValue: " + staticValue);
    }

    // 인스턴스에선 staic도 접근가능 (인스턴스 생성 시점엔 이미 static이 존재하니까)
    public void instanceMethod(){

        instanceValue++;
        System.out.println("instanceValue: " + instanceValue);

        staticMethod();
    }


    // 외부에서 매개변수로 인스턴스를 넘기는 경우 해당 참조값을 사용하는 것이 가능
    public static void staticMethod(DecorationData data){
        data.instanceMethod();
    }
}
