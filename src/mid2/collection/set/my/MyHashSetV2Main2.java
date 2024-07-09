package mid2.collection.set.my;

import mid2.collection.set.member.Member;

public class MyHashSetV2Main2 {
    public static void main(String[] args) {
        MyHashSetV2 myHashset = new MyHashSetV2(10);

        Member kim = new Member("Kim");
        Member spring = new Member("Spring");
        Member java = new Member("Java");
        Member jpa = new Member("JPA");
        myHashset.add(kim);
        myHashset.add(spring);
        myHashset.add(java);
        myHashset.add(jpa);
        System.out.println(myHashset);

        System.out.println("kim.hash(): " + kim.hashCode());
        System.out.println("spring.hash(): " + spring.hashCode());
        System.out.println("java.hash(): " + java.hashCode());
        System.out.println("jpa.hash(): " + jpa.hashCode());


        // 검색
        System.out.println("myHashset.contains(\"new Member(\"Kim\")\"): "+ myHashset.contains(new Member("Kim")));
        System.out.println("myHashset.contains(\"A\"): "+ myHashset.contains("A"));

    }
}
