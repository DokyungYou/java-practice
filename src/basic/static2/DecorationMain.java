package basic.static2;

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
    }
}
