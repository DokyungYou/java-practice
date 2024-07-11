package mid2.collection.compare;

import java.util.Arrays;

public class SortMain1 {
    public static void main(String[] args) {
        Integer[] array = {1, 3, 6, 0, -3, -5, 2, 11};
        System.out.println(Arrays.toString(array));

        // 기본 정렬
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
