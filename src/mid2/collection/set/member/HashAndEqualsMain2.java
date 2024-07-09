package mid2.collection.set.member;

import mid2.collection.set.my.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        MyHashSetV2 myHashSet = new MyHashSetV2(10);

        MemberNoEq member1 = new MemberNoEq("id-001");
        MemberNoEq member2 = new MemberNoEq("id-001");

        myHashSet.add(member1);
        myHashSet.add(member2);
        System.out.println(myHashSet);

        System.out.println("member1.hashCode(): "+ member1.hashCode());
        System.out.println("member2.hashCode(): "+ member2.hashCode());

        System.out.println("member1 본래 해시코드: " + System.identityHashCode(member1));
        System.out.println("member2 본래 해시코드: " + System.identityHashCode(member2));

        // MyHashSetV2{elements=[[MemberNoEq{id='id-001'}, MemberNoEq{id='id-001'}], [], [], [], [], [], [], [], [], []], size=2, capacity=10}
        // private String id; 을 기반으로 해시코드를 생성하게끔 재정의했기때문에 둘의 해시코드는 동일함 -> 같은 해시인덱스 생성
        // equals() 를 재정의 하지 않음 -> 참조값 기반으로 비교해서 다른 값으로 인식 -> 같은 인덱스에 동일한 속성값의 객체가 중복으로 들어가버림



        System.out.println("myHashSet.contains(member1): " + myHashSet.contains(member1));
        System.out.println("myHashSet.contains(member2): " + myHashSet.contains(member2));


        System.out.println("myHashSet.contains(member1.getId()): " + myHashSet.contains(new MemberNoHashNoEq(member1.getId())));
        System.out.println("myHashSet.contains(member2.getId()): " + myHashSet.contains(new MemberNoHashNoEq(member2.getId())));


    }
}
