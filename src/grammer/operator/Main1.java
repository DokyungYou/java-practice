package grammer.operator;

public class Main1 {

  public static void main(String[] args) {

//  1. 대입 연산, 부호 연산자
    int num = 100;
    System.out.println("num: "+num);

    num += 10;
    System.out.println("num+=10: " + num);

    num -= 100;
    System.out.println("num-=100: " + num);


//  2. 산술 연산자, 증가/감소 연산자
    System.out.println("== 산술 연산자, 증가/감소 연산자 ==");
    int numX = 10;
    int numY = 3;

    System.out.println("numX + numY: " + numX + numY);
    System.out.println("numX - numY: " + (numX - numY));
    System.out.println("numX / numY: " + numX / numY);  // 10/3 = 3 (정수형이라 나머지는 날라감)
    System.out.println("numX % numY: " + numX % numY);  // 1


    // 증가, 감소연산자가 뒤에 붙은 경우는 해당 코드에서 적용 X
    int numZ = 3;
    System.out.println(numZ++); // 3
    System.out.println(numZ); // 4
    System.out.println(++numZ); // 5

//  3. 관계 연산자
    System.out.println("== 관계 연산자 ==");
    int numA = 10;
    int numB = 9;

    System.out.println(numA > numB);
    System.out.println(numA < numB);
    System.out.println(numA == numB);


//  4. 논리 연산자
    System.out.println("== 논리 연산자 ==");
    System.out.println((10 > 7) && (11 == 11));
    System.out.println((10 < 7) || (11 == 11));


//  5. 복합 대입 연산자
    System.out.println("== 복합 대입 연산자 ==");
    int num1 = 10;
    int num2 = 5;
    int num3 = 1;
    int num4 = 5;

    num1+= 10;
    num2-= num1;
    num3 *= num2;
    num4 /= num1;

    System.out.println("num1+= 10: " + num1);
    System.out.println("num2-= num1: "+ num2);
    System.out.println("num3*= num2: "+ num3);
    System.out.println("num4 /= num1: "+num4);  // 5 / 10 => 0

//  6. 삼항 연산자
    System.out.println("== 삼항 연산자 ==");

    int a = 100;
    String aResult = (a == 10)? "성공!": "실패!";
    System.out.println(aResult);
  }
}