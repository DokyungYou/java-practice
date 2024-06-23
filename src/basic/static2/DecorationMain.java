package basic.static2;

import static basic.static2.DecorationData.staticMethod;

public class DecorationMain {
    public static void main(String[] args) {
        String str = "Java";

        System.out.println(DecorationUtil.decorateString(str));

        // ==================================================

        System.out.println("== static 호출 ==");
        DecorationData.staticMethod(); // static: 1


        System.out.println("== instance 호출 01 ==");
        DecorationData data1 = new DecorationData();
        data1.instanceMethod();  // instance: 1, static: 2

        System.out.println("== instance 호출 02 ==");
        DecorationData data2 = new DecorationData();
        data2.instanceMethod();  // instance: 1, static: 3

        // ===================================================


        DecorationData.staticMethod();

        // 이런 식으로 한 파일 내에서 static요소를  빈번하게 호출 시 static import 고려
        // ex) import static basic.static2.DecorationData.staticMethod;  // 특정 메소드가 아닌 전체를 가져오고싶다면 .*
        staticMethod();
        staticMethod();
        staticMethod();
        staticMethod();



    }
}
