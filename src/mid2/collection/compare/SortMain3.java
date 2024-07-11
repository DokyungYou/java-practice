package mid2.collection.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        Member member1 = new Member("조팀장", 1997);
        Member member2 = new Member("유백수", 1996);
        Member member3 = new Member("안동무", 1995);
        Member member4 = new Member("유나나", 1992);

        Member[] members = {member1, member2, member3,member4};
        System.out.println(Arrays.toString(members));

        Arrays.sort(members); // 이 때 정렬의 기준은 Comparable<Member>의 compareTo
        System.out.println(Arrays.toString(members));

        // 기본정렬이 아닌 정렬 방식 지정 시 Comparator 를 넘겨준다. (객체가 가진 Comparable 를 무시)
        Arrays.sort(members, new NameComparator());
        System.out.println(Arrays.toString(members));

        Arrays.sort(members, new NameComparator().reversed());
        System.out.println(Arrays.toString(members));
    }
}
