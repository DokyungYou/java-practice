package mid2.collection.compare;

import java.util.Set;
import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        Member member1 = new Member("조팀장", 1997);
        Member member2 = new Member("유백수", 1996);
        Member member3 = new Member("안동무", 1995);
        Member member4 = new Member("유나나", 1992);

        // 데이터를 넣으면서 바로 정렬이 되어야하기때문에 Comparable 이 구현돼있어야한다.
        TreeSet<Member> memberTreeSet1 = new TreeSet<>(Set.of(member1,member2,member3,member4));
        System.out.println(memberTreeSet1);


        // 객체를 생성하면서 정렬기준을 지정해준다.
        TreeSet<Member> memberTreeSet2 = new TreeSet<>(new NameComparator());
        memberTreeSet2.add(member1);
        memberTreeSet2.add(member2);
        memberTreeSet2.add(member3);
        memberTreeSet2.add(member4);
        System.out.println(memberTreeSet2);

    }
}
