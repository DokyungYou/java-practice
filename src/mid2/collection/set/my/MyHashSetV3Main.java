package mid2.collection.set.my;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> myStrSet = new MyHashSetV3<>(10);
        myStrSet.add("APPLE");
        myStrSet.add("ACID");
        System.out.println(myStrSet);

        System.out.println("APPLE.hashCode(): " + "APPLE".hashCode()); // 2003133
        System.out.println("ACID.hashCode(): " + "ACID".hashCode()); // 2003133

        // 검색
        System.out.println("myStrSet.contains(\"ACID\"): "+ myStrSet.contains("ACID"));
        System.out.println("myStrSet.contains(\"APPLE\"): "+ myStrSet.contains("APPLE"));
        System.out.println("myStrSet.contains(\"acid\"): "+ myStrSet.contains("acid"));

    }
}
