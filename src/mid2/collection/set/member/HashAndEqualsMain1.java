package mid2.collection.set.member;

import mid2.collection.set.my.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MyHashSetV2 myHashSet = new MyHashSetV2(10);

        MemberNoHashNoEq member1 = new MemberNoHashNoEq("id-001");
        MemberNoHashNoEq member2 = new MemberNoHashNoEq("id-001");
        myHashSet.add(member1);
        System.out.println(myHashSet);

        System.out.println("member1.hashCode(): "+ member1.hashCode());
        System.out.println("member2.hashCode(): "+ member2.hashCode());

        System.out.println("myHashSet.contains(member1): " + myHashSet.contains(member1));
        System.out.println("myHashSet.contains(member2): " + myHashSet.contains(member2));

        myHashSet.add(member2);
        System.out.println(myHashSet);
        System.out.println("myHashSet.contains(member2): " + myHashSet.contains(member2));

        System.out.println("myHashSet.contains(member1.getId()): " + myHashSet.contains(new MemberNoHashNoEq(member1.getId())));
        System.out.println("myHashSet.contains(member2.getId()): " + myHashSet.contains(new MemberNoHashNoEq(member2.getId())));


    }
}
