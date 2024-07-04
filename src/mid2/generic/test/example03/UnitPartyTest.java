package mid2.generic.test.example03;

import mid2.generic.test.example03.unit.Assassin;
import mid2.generic.test.example03.unit.Hunter;
import mid2.generic.test.example03.unit.MartialArtist;
import mid2.generic.test.example03.unit.Sorcerer;

public class UnitPartyTest {
    public static void main(String[] args) {
        Party abrelshudParty = new Party(4);
        abrelshudParty.addMember(new Party.Member<>(new Assassin()));
        abrelshudParty.addMember(new Party.Member<>(new Assassin()));
        abrelshudParty.addMember(new Party.Member<>(new Hunter()));
        abrelshudParty.showMembers();

        abrelshudParty.addMember(new Party.Member<>(new Sorcerer()));
        abrelshudParty.addMember(new Party.Member<>(new MartialArtist()));

        abrelshudParty.changeMaxNumber(3);
        abrelshudParty.changeMaxNumber(5);
        abrelshudParty.addMember(new Party.Member<>(new Assassin()));

        abrelshudParty.showMembers();
    }
}
