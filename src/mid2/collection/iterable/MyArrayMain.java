package mid2.collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1,2,3,4,5,6});

        Iterator<Integer> iterator = myArray.iterator();
        while (iterator.hasNext()){
            System.out.println("value: " + iterator.next());
        }

        // for-each 문 (향상된 for문)
        // 컴파일 시점에 위의 iterator 반복문 코드와 같이 변경되는 것이다.
        for (int value : myArray) {
            System.out.println("value: " + value);
        }
    }
}
