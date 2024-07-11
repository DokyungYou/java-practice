package mid2.collection.utils;

import java.util.*;

public class EmptyList {
    public static void main(String[] args) {

        // 빈 가변 리스트 생성 ==============================================================
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // 빈 불변 리스트 생성 ==============================================================
        List<Integer> ofList = List.of(); // Java9
        List<Integer> emptyList = Collections.emptyList(); // Java5

        System.out.println("class of ofList: " + ofList.getClass()); // java.util.ImmutableCollections$ListN
        System.out.println("class of emptyList: " + emptyList.getClass()); // java.util.Collections$EmptyList

        // 배열을 넘겨서 만들기 
        Integer[] arr = {1,2,3,4,5};
        List<Integer> ofList2 = List.of(arr); // 불변

        // Arrays.asList(): 길이는 불변, 요소는 가변
        // 배열의 참조값을 넘겨서 만든다. (내부에 새롭게 만드는 것이 아닌)
        // 엄청 큰 배열을 토대로 List를 만드는 경우 asList를 쓰는게 성능상 더 효과적일 수는 있음
        List<Integer> asList = Arrays.asList(arr);
        asList.set(0,0);
        asList.set(1,0);
        asList.set(2,0);
        asList.set(3,0);
        asList.set(4,0);

        // 참조값이 같기 때문에 asList를 변경시 기존 배열의 값도 변경된다.
        System.out.println("arr: "+ Arrays.toString(arr));
        System.out.println("asList: " + asList);


    }
}
