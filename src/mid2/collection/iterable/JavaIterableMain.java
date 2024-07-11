package mid2.collection.iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        printIterator(list.iterator());
        printForEach(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        printIterator(set.iterator());
        // class java.util.HashMap$KeyIterator 이 출력되는 이유 (HashSet은 HashMap을 사용한다. 사실 Value 가 더미값으로 들어간 Map이나 마찬가지)

        printForEach(set);
    }

    private static<E> void printIterator(Iterator<E> iterator){
        System.out.println("class of iterator: " + iterator.getClass()); // 자료구조별로 자신만의 Iterator 구현체를 반환하는 것을 볼 수 있음
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    private static<E> void printForEach(Iterable<E> iterable){

        // Collection implements Iterable
        System.out.println("class of iterable: "+ iterable.getClass());

        for (E e : iterable) {
            System.out.println(e);
        }
    }
}
