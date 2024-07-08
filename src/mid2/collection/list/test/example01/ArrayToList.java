package mid2.collection.list.test.example01;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        double average  = (double)total / nums.length;
        System.out.println("total: " + total);
        System.out.println("average: " + average);

        //List로 바꾸기 ====================================================

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("total: " + getTotal(list));
        System.out.println("average: " + getAverage(list));

    }

    static int getTotal(List<Integer> list){
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total;
    }

    static double getAverage(List<Integer> list){
        return (double) getTotal(list) / list.size();
    }

}
