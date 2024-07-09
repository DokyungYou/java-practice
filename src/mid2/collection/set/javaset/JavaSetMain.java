package mid2.collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {

        // 타입추론
        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());
    }
    private static void run(Set<String> set){
        System.out.println("set: " + set.getClass());

        set.add("B");
        set.add("A");
        set.add("D");
        set.add("C");
        set.add("\" \"");
        set.add("5");
        set.add("1");

        // iterator() 사용 시 컬렉션 반복 출력가능
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+ "  "); // 현재 데이터를 반환 후 다음으로 이동
        }
        System.out.println();
    }

    /*
    set: class java.util.HashSet - 입력순서 보장 X, 조회 평균 O(1)
    A  1  B  C  D  " "  5

    set: class java.util.LinkedHashSet - 입력한 순서 보장, 조회 평균 O(1)
    B  A  D  C  " "  5  1

    set: class java.util.TreeSet - 데이터 값 기준 정렬, 조회 O(log N)
    " "  1  5  A  B  C  D
    */
}
