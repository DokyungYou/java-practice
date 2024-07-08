package mid2.collection.set;

import java.util.Arrays;

public class HashStart04 {
    static final int CAPACITY = 10;
    public static void main(String[] args) {

        Integer[] inputArray = new Integer[CAPACITY];

        // 배열[값 % CAPACITY] = 값; -> CAPACITY보다 큰 인덱스가 나올 수 없음(메모리 낭비 줄일 수 있음)
        add(inputArray, 1);
        add(inputArray, 3);
        add(inputArray, 5);
        add(inputArray, 7);
        add(inputArray, 9); // 9번 인덱스
        add(inputArray, 70); // 0번 인덱스
        add(inputArray, 99); // 9번 인덱스

        System.out.println(Arrays.toString(inputArray));

        // O(1)
        System.out.println(searchValue(inputArray,9)); // 99
        System.out.println(searchValue(inputArray,70));
        System.out.println(searchValue(inputArray,80)); // 80 % 10 = 0 -> 70 이 나와버림
        System.out.println(searchValue(inputArray,99)); // 99

    }

    static Integer searchValue(Integer[] array, int value){  // O(1)
        return array[getHashIndex(value)];
    }

    static void add(Integer[] array, int value){  // O(1)
        array[getHashIndex(value)] = value;
    }

    static int getHashIndex(int value){
        return value % CAPACITY;
    }

}
