package mid2.generic.test.example03;

import mid2.generic.test.example03.unit.Sorcerer;

public class UnitPrinterTest {
    public static void main(String[] args) {

        Party.Member<Sorcerer> sorcererMember = new Party.Member<>(new Sorcerer());
        UnitPrinter.printUnit(sorcererMember);

        Sorcerer sorcerer = UnitPrinter.printAndReturnUnit(sorcererMember);
        System.out.println(sorcerer);
    }
}
