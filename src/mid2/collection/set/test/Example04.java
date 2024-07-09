package mid2.collection.set.test;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 주어지는 집합으로 합집합, 교집합, 차집합 구하기 (출력 순서관계 X)
public class Example04 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        System.out.println("합집합: " + getUnion(set1,set2));
        System.out.println("교집합: " + getIntersection(set1,set2));
        System.out.println("차집합: " + getDifferenceSets(set1,set2));
    }

    private static<E> Set<E> getUnion(Collection<E> collection1, Collection<E> collection2){
        Set<E> union = new HashSet<>(collection1);
        union.addAll(collection2);

        return union;
    }
    private static<E> Set<E> getIntersection(Collection<E> collection1, Collection<E> collection2){
        Set<E> set = new HashSet<>(collection1);
        //Set<E> intersection = new HashSet<>();

        set.retainAll(collection2); // 겹치는 값만 남기고 나머지 삭제
        return set;

//        for (E e : collection2) {
//            if(set.contains(e)){
//                intersection.add(e);
//            }
//        }
//        return intersection;
    }

    private static<E> Set<E> getDifferenceSets(Collection<E> collection1, Collection<E> collection2){
        Set<E> set = new HashSet<>(collection1);
        set.removeAll(collection2);
        return set;
    }
}
