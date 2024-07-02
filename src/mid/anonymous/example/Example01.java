package mid.anonymous.example;

import java.util.Random;

public class Example01 {
    // 아래의 메서드들을 하나의 메서드에서 실행할 수 있도록 리팩토링하기


    /* 생각의 흐름
     -> 공통되는 부분은 남긴다.
     -> 다른 코드들을 한 메서드에 동적으로 넣을 방법 -> 외부에서 받는다 -> 어떻게? -> 자바는 메서드를 변수로 넣을 수 없다. -> 클래스에 메서드를 정의해놓고 해당 인스턴스로 받아오자 ->
     -> 같은 이름이면서 다른내용을 가진 메서드를 동적으로 받아오는 방법 -> 다형성 참조

     인터페이스타입을 매개변수로 받게끔 하고,
     본래 있던 코드들은 해당 인터페이스를 구현한 클래스에 따로 넣자.

     Refactoring01
    */
    public static void rollDice(){
        System.out.println("프로그램 시작"); // 중복되는 부분

        // 코드 조각 시작
        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("주사위 결과: " + randomValue);
        // 코드 조각 종료

        System.out.println("프로그램 종료");  // 중복되는 부분
    }

    public static void sum(){
        System.out.println("프로그램 시작");  // 중복되는 부분

        // 코드 조각 시작
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
        // 코드 조각 종료

        System.out.println("프로그램 종료");  // 중복되는 부분
    }

    public static void main(String[] args) {
        rollDice();
        sum();
    }

}
