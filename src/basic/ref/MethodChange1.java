package basic.ref;

public class MethodChange1 {

    static int changePrimitive(int x){
        return x = 20;

        // 그저 인수로 넘긴 값을 복사해서 x에 대입 후
        // x 매개변수의 값을 20으로 바꾼 것뿐임.
        // 인수에는 변화 X
    };

    public static void main(String[] args) {

        int a = 10;

        System.out.println(changePrimitive(a));
        System.out.println("a: "+ a);

    }
}
