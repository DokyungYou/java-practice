package mid1.enumeration.ref03;

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

//    public int getDiscountPercent(){
//        return discountPercent;
//    }

    
    // 객체지향 관점에서 자신의 데이터를 외부에 노출하기보다 스스로 관리하는것이 캡슐화 원칙에 맞음
    // 이제는 Grade 가 스스로 할인율을 계산해준다.
    public int getDiscountAmount(int price){
        return price * discountPercent / 100;
    }
}
