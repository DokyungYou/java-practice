package mid2.collection.set;

import mid2.collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        // Object 의 기본 해시코드 (참조값 기반)
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        System.out.println("object1.hashCode(): " + object1.hashCode());
        System.out.println("object2.hashCode(): " + object2.hashCode());
        System.out.println("object3.hashCode(): " + object3.hashCode());

        // 16진수화
        System.out.println("object1: " + object1);
        System.out.println("object2: " + object2);
        System.out.println("object3: " + object3);

        // 각 클래스마다 hashCode 재정의 되어있음
        Integer zero = 0;
        Integer five = 5;
        String bob = "BOB";
        String monster = "monster";
        System.out.println("Integer 0.hashCode(): " + Integer.valueOf(0).hashCode());
        System.out.println("Integer 5.hashCode(): " + Integer.valueOf(5).hashCode());
        System.out.println("Integer -10.hashCode(): " + Integer.valueOf(-10).hashCode()); // 해시코드는 음수값도 있다.

        System.out.println("\"bob\".hashCode(): " + bob.hashCode());
        System.out.println("\"monster\".hashCode(): " + monster.hashCode());


        // equals 재정의 (id 값이 동일 시 동일한 값)
        // 참조값은 다르나 동일한 것으로 간주
        Member member1 = new Member("ID-001");
        Member member2 = new Member("ID-001");
        System.out.println("member1.equals(member2): "+ member1.equals(member2));
        System.out.println("member1 == member2: "+ (member1 == member2)); // == 는 스택메모리값 비교 (참조값 비교)

        System.out.println("member1.hashCode(): "+ member1.hashCode());
        System.out.println("member2.hashCode(): "+ member2.hashCode());

    }
}
