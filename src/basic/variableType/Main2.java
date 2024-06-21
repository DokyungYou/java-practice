package basic.variableType;
// Java 프로그래밍 - 변수와 자료형_2

public class Main2 {
  public static void main(String[] args) {

//  1. 자료형 - 숫자
    System.out.println("== 숫자 ==");
//  1-1. 정수  (기본이 int, long은 l or L 붙여주기 )
    int intNum = 10;
    System.out.println("intNum = " + intNum); // 10

    System.out.println("int의 최소치: " + Integer.MIN_VALUE); // int의 최소치 : -2147483648
    System.out.println("int의 최댓치: "+ Integer.MAX_VALUE); // int의 최대치 :  2147483647

    // int의 최댓값을 넘어가는 수를 출력해보자
    int intNum2 = Integer.MAX_VALUE + 1;
    System.out.println("intNum2 = " + intNum2);  // -2147483648
    // 2147483647(최댓치) + 1 =>  2147483648 (X)
    //  2147483647(최댓치) + 1 => -2147483648 (o)


    long longNum1 = Integer.MAX_VALUE + 1;  // -2147483648

    // Integer.MAX_VALUE를 long으로 형변환 후 +1
    long longNum2 = (long)Integer.MAX_VALUE + 1;  // 2147483648
    System.out.println("long in maxInt + 1:  " + longNum1);
    System.out.println("long in (long)maxInt +1:  " + longNum2);



//  1-2. 실수 (double이 기본, float는 f or F 붙이기)
    float floatNum = 1.123f;
    System.out.println("Float.MAX_VALUE: "+Float.MAX_VALUE);  // 3.4028235E38   끝의 38은 10의 38승을 뜻함


    double doubleNum = 3.4028;
    System.out.println("Double.MAX_VALUE: "+Double.MAX_VALUE);  // 1.7976931348623157E308  E의 308승


//  1-3. 2진수 / 8진수 / 16진수
    int numBase2 = 0b1100;
    int numBase8 = 014;

    // 0~9 A~F
    int numBase16 = 0xC;

    System.out.println("0b1100: "+numBase2);
    System.out.println("014:"+numBase8);
    System.out.println("0xC: "+numBase16);


    // 기본출력은 10진수로 됨
    System.out.println("0b" + Integer.toBinaryString(numBase2));  // 12
    System.out.println("0" + Integer.toOctalString(numBase8));  // 12
    System.out.println("0x" + Integer.toHexString(numBase16));  // 12

    // 본래 진수로 출력하고 싶다면
    System.out.println("12 toBinary: " + Integer.toBinaryString(numBase2));
    System.out.println("12 toOxta: "+ Integer.toOctalString(numBase8));
    System.out.println("12 toHex: "+ Integer.toHexString(numBase16));



//  2. 자료형 - 부울
    System.out.println("== 부울 ==");
    boolean isPass = true;
    boolean isOk = false;

    System.out.println(isPass);
    System.out.println(isOk);


//  3. 자료형 - 문자
    System.out.println("== 문자 ==");
    char keyFirst = 'a';
    char keyLast = 'z';

    System.out.println(keyFirst);

    // 아스키코드값 (문자가 숫자에 매핑돼있음)
    System.out.println("'a' to int: " + (int)keyFirst);
    System.out.println("'z' to int: " + (int)keyLast);

  }

}
