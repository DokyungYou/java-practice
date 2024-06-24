package final01;

public class FinalInit {

    /*
    final 인스턴스 변수의 경우 필드 선언 동시에 값을 할당하거나
    생성자를 통해서라도 값을 할당해줘야한다.
   */
    final int finalValue1; // 인스턴스마다 다른 값을 가지기때문에 final '변수' 로써의 의미가 있음
    final int finalValue2 = 2; // 변수로써의 의미가 없음 (모든 인스턴스들이 같은 값을 가질텐데, 인스턴스 변수로 만들기엔 메모리 낭비 & 중복)


    //상수 (static final 이 붙은 변수, 변하지않고 항상 일정한 값을 갖는 수 ,대문자로 네이밍)
    static final int CONST_VALUE = 100;

    public FinalInit(int value){
        this.finalValue1 = value; // 이후로는 value1 값 수정 불가
    }
}
