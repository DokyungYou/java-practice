package mid2.collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {
    public static void main(String[] args) {
        Integer[] array = {1, 3, 6, 0, -3, -5, 2, 11};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, new AscComparator());
        System.out.println("오름차순 정렬 후 " + Arrays.toString(array));

        Arrays.sort(array, new DescComparator());
        System.out.println("내림차순 정렬 후 " + Arrays.toString(array));


        // Comparator 익명클래스로 구현해서 넣기
        Arrays.sort(array, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                // return o1 > o2 ? 1 : (o1 == o2) ? 0 : -1;
                return o1.compareTo(o2);

                /*
                 public static int compare(int x, int y) {
                     return (x < y) ? -1 : ((x == y) ? 0 : 1);
                }
                */
            }
        });
        System.out.println(Arrays.toString(array));

        System.out.println("=== reversed ===");
        Arrays.sort(array, new AscComparator().reversed()); // 내림차순으로 바꿔줌
        System.out.println(Arrays.toString(array));

    }
    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2){
            System.out.println("o1: " + o1 + ", o2: " + o2);
            return (o1 < o2) ? -1 : (o1 == o2) ? 0 : 1 ;
        }

    }

    static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2){
            System.out.println("o1: " + o1 + ", o2: " + o2);
            return (o1 < o2) ? -1 : ((o1.equals(o2)) ? 0 : 1) * -1 ;
        }

    }
}
