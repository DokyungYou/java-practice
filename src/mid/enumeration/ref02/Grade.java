package mid.enumeration.ref02;

// enum의 본질을 잊었을 땐 타입안전열거형 패턴으로 구현한 코드를 같이 보자 (example02)
public enum Grade {

    // 상수이름() 은 생성자를 호출한 것
    BASIC(10),  // public static final Grade BASIC = new ClassGrade(10); 가 축약된 느낌
    GOLD(20),
    DIAMOND(30);

    private final int discountPercent;

    // enum 의 생성자는 private 이 생략되었음
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent(){
        return discountPercent;
    }
}
