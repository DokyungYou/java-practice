package mid2.generic.test.example03;

import mid2.generic.test.example03.unit.Assassin;
import mid2.generic.test.example03.unit.ClassUnit;
import mid2.generic.test.example03.unit.Hunter;
import mid2.generic.test.example03.unit.Warrior;

public class UnitUtilTest {
    public static void main(String[] args) {

        ClassUnit maxHpResult1 = UnitUtil.maxHp(new Assassin(), new Warrior());
        System.out.println("Assassin VS Warrior maxHp: " + maxHpResult1.toString());

        ClassUnit maxHpResult2 = UnitUtil.maxHp(new Hunter(), new Assassin());
        System.out.println("Hunter VS Assassin maxHp: " + maxHpResult2.toString());

    }
}
