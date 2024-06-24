package final01;

public class FinalLocalMain {
    public static void main(String[] args) {

        final int data1;
        data1 = 1; // 최초 한번만 할당 가능
//      data1 = 0; // 컴파일 오류

        method(100); // 100으로 넘긴 값을 변경불가
    }

    static void method(final int num){
       // num = 10;  인수로 받은 값을 복사해서 final 에 넣어줬기때문에 변경불가
    }
}
