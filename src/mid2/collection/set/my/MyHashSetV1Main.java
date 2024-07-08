package mid2.collection.set.my;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 myHashset = new MyHashSetV1(20);
        myHashset.add(1);
        myHashset.add(6);
        myHashset.add(2);
        myHashset.add(3);
        myHashset.add(11);
        myHashset.add(-12);
        myHashset.add(99);
        myHashset.add(-99);
        System.out.println(myHashset);

        System.out.println("myHashset.contains(99): " + myHashset.contains(-99));
        System.out.println("myHashset.contains(1): " + myHashset.contains(-1));

        System.out.println("myHashset.remove(11): " + myHashset.remove(11));
        System.out.println("myHashset.remove(15): " + myHashset.remove(15));
        System.out.println("myHashset.remove(-99): " + myHashset.remove(-99));
        System.out.println(myHashset);
    }
}
