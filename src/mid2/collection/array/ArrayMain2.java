package mid2.collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        // 배열의 첫번째 위치에 추가
        // 기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 첫번째 위치에 추가
        System.out.println("배열의 첫번째 위치에 5라는 값 추가 - O(n)");
        int newValue = 5;
        addFirstValue(arr, newValue);
        System.out.println(Arrays.toString(arr));


        // 특정 index 위치에 추가
        // 기본 배열의 데이터를 한 칸 씩 뒤로 밀고 배열의 index 위치에 추가
        System.out.println("배열의 index(3) 위치에 30 추가 - O(n)");
        addAtIndex(arr,3 ,30);
        System.out.println(Arrays.toString(arr));


        // 배열의 마지막 위치에 추가
        System.out.println("배열의 마지막 위치에 100 추가 - O(1)");
        addLastValue(arr, 100);
        System.out.println(Arrays.toString(arr));
    }

    private static void addFirstValue(int[] arr, int newValue) {

        // O(n)
        for (int i = arr.length - 1; i > 0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = newValue;
    }

    private static void addAtIndex(int[] arr, int index , int newValue) {

        // O(n)
        for (int i = arr.length-1 ; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = newValue;
    }

    private static void addLastValue(int[] arr, int newValue) {
        arr[arr.length-1] = newValue;
    }
}
