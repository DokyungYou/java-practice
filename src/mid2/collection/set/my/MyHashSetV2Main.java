package mid2.collection.set.my;

public class MyHashSetV2Main {
    public static void main(String[] args) {
        MyHashSetV2 myHashset = new MyHashSetV2(10);
        myHashset.add("A");
        myHashset.add("B");
        myHashset.add("C");
        myHashset.add("C");
        myHashset.add("ACID");
        System.out.println(myHashset);

        System.out.println("A.hashCode(): " + "A".hashCode()); // 65
        System.out.println("B.hashCode(): " + "B".hashCode()); // 66
        System.out.println("C.hashCode(): " + "C".hashCode()); // 67
        System.out.println("C.hashCode(): " + "C".hashCode()); // 67
        System.out.println("ACID.hashCode(): " + "ACID".hashCode()); // 2003133

        // 검색
        System.out.println("myHashset.contains(\"ACID\"): "+ myHashset.contains("ACID"));
        System.out.println("myHashset.contains(\"A\"): "+ myHashset.contains("A"));
        System.out.println("myHashset.contains(\"acid\"): "+ myHashset.contains("acid"));

    }
}
