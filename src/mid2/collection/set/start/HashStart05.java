package mid2.collection.set.start;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart05 {
    static final int CAPACITY = 15; // 용량을 변경할 때마다 충돌 확률이 달라지는 것을 볼 수 있음 (보통 배열크기의 75%을 적절한 기준으로 삼는다.)
    public static void main(String[] args) {

        LinkedList<Integer>[] listInArray = new LinkedList[CAPACITY];

        // 실수한 부분:
        // for-each문 사용 시 기존의 요소를 변경시키는 것이 아닌
        // 기존 요소에서 "복사한 값" 을 새로운 변수에 할당하는 것임
//        for (LinkedList<Integer> list : listInArray) {
//            list = new LinkedList<>();
//        }

        for (int i = 0; i < listInArray.length; i++) {
            listInArray[i] = new LinkedList<>();
        }

        System.out.println(Arrays.toString(listInArray));

       
        add(listInArray, 1);
        add(listInArray, 1);
        add(listInArray, 3);
        add(listInArray, 5);
        add(listInArray, -7);
        add(listInArray, 21);
        add(listInArray, -31);
        add(listInArray, 11);
        add(listInArray, 9);
        add(listInArray, 70);
        add(listInArray, 0);
        add(listInArray, 99);

        System.out.println(Arrays.toString(listInArray));

        System.out.println("contains(70): " + contains(listInArray, 70));
        System.out.println("contains(-1): " + contains(listInArray, -1));
        System.out.println("contains(-31): " + contains(listInArray, -31));


        // O(1)
        System.out.println(searchValue(listInArray,9));
        System.out.println(searchValue(listInArray,70));
        System.out.println(searchValue(listInArray,80));
        System.out.println(searchValue(listInArray,99));

    }


    /*
    이론상으로 해시알고리즘은 O(1) * O(n) 이지만
    용량을 적절히 잡아주면 충돌이 거의 없기때문에
    O(1) * O(1) 의 성능을 보여주는 편이다.
     */
    private static Integer searchValue(LinkedList<Integer>[] array, int value){
        LinkedList<Integer> list = array[getHashIndex(value)];
        for (Integer integer : list) {
            if(value == integer) return integer;
        }
        return null;
}

    private static boolean contains(LinkedList<Integer>[] array, int value){
        return array[getHashIndex(value)].contains(value); // O(1) * O(n)
    }

    private static void add(LinkedList<Integer>[] array, int value){
        LinkedList<Integer> list = array[getHashIndex(value)]; // O(1)
        if(!list.contains(value)) list.add(value); // O(n)  배열의 길이가 작을수록 충돌횟수 up
    }

    private static int getHashIndex(int value){
        int hashIndex = value % CAPACITY;
        if(hashIndex < 0) hashIndex *= -1;

        return hashIndex;
    }


}
