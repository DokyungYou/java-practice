package basic.memory;

public class JavaMemoryMain1 {

    public static void main(String[] args) {
        System.out.println("== main 시작 ==");
        method1(1);
        System.out.println("===============");
        method2(1);

        System.out.println("== main 끝 ==");

    }

    static void method1(int num1){
        System.out.println("method1 시작");

        int cal = num1 * 2;

        method2(cal);
        System.out.println("method1 끝");

    }
    static void method2(int num2){
        System.out.println("method2 시작");

        System.out.println("method2 끝");

    }
}
