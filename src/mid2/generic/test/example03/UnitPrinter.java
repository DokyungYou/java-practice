package mid2.generic.test.example03;

import mid2.generic.test.example03.unit.ClassUnit;

/*
TODO
제네릭 메서드로 구현
와일드카드로 구현
*/
public class UnitPrinter {

    static <T extends ClassUnit> T printAndReturnUnit(Party.Member<T> unit){
        System.out.println(unit);
        return unit.getUnit();
    }

    static void printUnit(Party.Member<? extends ClassUnit> unit){
        System.out.println(unit);
    }
}
