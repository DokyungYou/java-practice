package mid2.collection.set.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

// 중복제거
public class Example01 {
    public static void main(String[] args) {

        // 중복 값 제거 후 출력 (출력 순서 관계없음)
        Integer[] intArray = {30,40,50,50,60,99,0,99};
        String[] strArray = {"녹차우롱차","우롱차","녹차","우롱차","녹롱차","우롱"};

        printCollection(extractUniqueValue(intArray));
        System.out.println();
        printCollection(extractUniqueValue(strArray));

    }

    private static <T> HashSet<T> extractUniqueValue(T[] array) {
        return new HashSet<>(Arrays.asList(array));
    }

    private static void printCollection(Collection<?> collection){
        Iterator<?> iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
