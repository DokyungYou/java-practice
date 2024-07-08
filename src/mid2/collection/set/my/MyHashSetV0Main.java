package mid2.collection.set.my;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 myHashSet = new MyHashSetV0();
        myHashSet.add(1); // O(1)
        myHashSet.add(2); // O(1) * O(n)
        myHashSet.add(3); // O(1) * O(n)
        myHashSet.add(4); // O(1) * O(n)
        System.out.println(myHashSet);

        System.out.println("중복 데이터 저장시도: " + myHashSet.add(4));
        System.out.println(myHashSet);

        System.out.println("myHashSet.contains(3): " + myHashSet.contains(3));
        System.out.println("myHashSet.contains(0): " + myHashSet.contains(0));
        System.out.println(myHashSet);
    }
}
