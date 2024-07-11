package mid2.collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMain4 {
    public static void main(String[] args) {
        Member member1 = new Member("조팀장", 1997);
        Member member2 = new Member("유백수", 1996);
        Member member3 = new Member("안동무", 1995);
        Member member4 = new Member("유나나", 1992);

        //List<Member> memberList = new ArrayList<>();
        List<Member> memberList = new ArrayList<>(List.of(member1, member2, member3, member4));
        System.out.println(memberList + "\n");


        System.out.println("====================================================================");

        System.out.println("==== Comparable 기본 정렬 ====");
        memberList.sort(null); // 비교자를 넣지 않으면 Comparable 의 compareTo 정렬사용
        System.out.println(memberList + "\n");

        System.out.println("==== Comparator 정렬 ====");
        memberList.sort(new NameComparator());
        System.out.println(memberList + "\n");

        memberList.sort(new NameComparator().reversed());
        System.out.println(memberList + "\n");

        System.out.println("====================================================================");

        // 이 방식보다는 위처럼 객체의 정렬 메서드사용을 권장
        Collections.sort(memberList);
        Collections.sort(memberList, new NameComparator());
    }
}
