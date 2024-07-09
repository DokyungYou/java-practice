package mid2.collection.set.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

// 중복 제거와 입력 순서 유지
public class Example02 {
    public static void main(String[] args) {
        // 중복 값 제거 후 출력 (입력순서대로 출력)
        Integer[] intArray = {30,40,50,50,60,99,0,99};
        String[] strArray = {"녹차우롱차","우롱차","녹차","우롱차","녹롱차","우롱"};

        printCollection(extractUniqueOrdered(intArray));
        printCollection(extractUniqueOrdered(strArray));
    }

    private static <E>LinkedHashSet<E> extractUniqueOrdered(E[] array){
        return new LinkedHashSet<>(List.of(array));  // 버전 9 이후부턴 Arrays.asList() 보다는 List.of() 권장
    }

    private static void printCollection(Collection<?> collection){
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}
