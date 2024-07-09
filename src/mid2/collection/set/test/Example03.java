package mid2.collection.set.test;

import java.util.*;

// 중복제거와 데이터 순서 유지 (데이터 값 순서)
public class Example03 {
    public static void main(String[] args) {
        // 중복 값 제거 후 출력 (입력순서대로 출력)
        Integer[] intArray = {130,40,520,50,60,99,0,99};
        String[] strArray = {"ABCD","A","AB","AA","DA","BA"};

        printCollection(extractUniqueSorted(intArray));
        printCollection(extractUniqueSorted(strArray));
    }

    private static <E> TreeSet<E> extractUniqueSorted(E[] array){
        return new TreeSet<>(List.of(array));
    }

    private static void printCollection(Collection<?> collection){
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}

