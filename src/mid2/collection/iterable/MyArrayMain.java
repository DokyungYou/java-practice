package mid2.collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1,2,3,4,5,6});

        Iterator<Integer> iterator = myArray.iterator();
        while (iterator.hasNext()){
            System.out.println("value: " + iterator.next());
        }
    }
}
