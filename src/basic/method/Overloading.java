package basic.method;

public class Overloading {
    
    // 동일한 이름, 다른 시그니쳐여야 메서드 오버로딩 가능 (리턴타입, 실행문은 상관없음)
    // 시그니쳐: 매개변수의 타입, 순서 , 개수

    // 매개변수의 타입이 같으나 개수가 다름
    public static int add(int a, int b){
        return a + b;
    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }


    // 매개변수의 타입과 개수는 같으나 순서가 다름
    public static void method1(int a, double b){
        System.out.println("method1(int a, double b)");
    }
    public static void method1(double a, int b){
        System.out.println("method1(double a, int b)");
    }

    // 매개변수의 타입만 다른경우
    public static void method2(int a, int b){
        System.out.println("method2(int a, int b)");
    }
    public static void method2(double a, double b){
        System.out.println("method2(double a, double b)");
    }


    public static void main(String[] args) {
        // 만약 method2(int a, int b)가 없다면 method2(double a, double b)로 호출하게될 것임 (자동 형변환)
        // 본인의 타입에 가장 맞는 메서드를 찾아서 실행, 없다면 형변환 가능한 타입의 메서드를 호출
        method2(1, 1); 
        
        
        method2(1.0, 1.0);
    }
}
