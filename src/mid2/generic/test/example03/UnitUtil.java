package mid2.generic.test.example03;


import mid2.generic.test.example03.unit.ClassUnit;

/*
TODO 1
두 유닛을 입력 받고 체력이 높은 유닛 반환 (같은 경우 둘 중 아무나 반환)
제네릭 메서드 사용하기
입력하는 유닛의 타입과 반환하는 유닛의 타입이 동일해야함
 */
public class UnitUtil {

    public static <T extends ClassUnit> T maxHp(T class1, T class2){
        return class1.getHp() > class2.getHp() ? class1 : class2;
    }

}
