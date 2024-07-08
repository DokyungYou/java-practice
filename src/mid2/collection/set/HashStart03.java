package mid2.collection.set;

import java.util.Arrays;

public class HashStart03 {
    public static void main(String[] args) {

        Integer[] inputArray = new Integer[100];

        // 배열의 인덱스를 값으로 사용
        inputArray[1] = 1;
        inputArray[3] = 3;
        inputArray[5] = 5;
        inputArray[7] = 7;
        inputArray[9] = 9;
        inputArray[70] = 70;
        inputArray[99] = 99;
        
        // 고작 7개의 데이터만 들어가지만 100길이의 배열이 필요
        System.out.println(Arrays.toString(inputArray));

        // O(1)
        System.out.println(searchValue(inputArray,9));
        System.out.println(searchValue(inputArray,70));
        System.out.println(searchValue(inputArray,80));
        System.out.println(searchValue(inputArray,99));

    }

    // 데이터 조회 시 데이터의 값을 인덱스로 사용하여 조회 -> O(1)
    // 속도성능은 up, but 메모리 낭비
    static Integer searchValue(Integer[] array, int value){
        return array[value];
    }
}
