package mid.lang.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {

        // 기본형은 절대로 같은 값을 공유하지 않음
        int a = 1;
        int b = a; // a 값 복사후 b에 대입 (a와는 별개의 1이라는 값을 대입)

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        b = 2;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
