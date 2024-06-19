package grammer.variableType;

public class Casting {
    public static void main(String[] args) {

        // 자료형의 크기(값의 범위) 순서
        // byte < short/char < int < long < float < double

        // <기본자료형 간의 타입변환>
        // 같은 타입타입끼리의 연산 -> 해당 타입 (byte, short는 제외)
        // 다른 타입끼리의 연산 -> 값의 범위가 더 큰 타입으로 형변환

        int num1 = 3 / 2;
        System.out.println("int in 3/2 =  " + num1);

        double num2 = 3 / 2;
        System.out.println("double in 3/2 = " + num2);

        double num3 = 3.0 / 2;
        System.out.println("double in 3.0/2 = " + num3);

        double num4 = (double) 3 / 2;
        System.out.println("double in (double) 3/2 =  " + num4);

        double num5 = (double) (3 / 2);
        System.out.println("double in (double) (3/2) =  " + num5);
    }
}
