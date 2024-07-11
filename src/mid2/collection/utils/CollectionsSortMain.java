package mid2.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(List.of(3,5,8,3,2,5,6,7,8,0));
        System.out.println("before: " + list);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println("최댓값: " + max + "  최솟값: " +  min);

        Collections.shuffle(list);
        System.out.println("after shuffle: "+ list);

        Collections.sort(list); // list.sort(null) 을 권장
        System.out.println("after sort: " + list);

        Collections.reverse(list);
        System.out.println("after reverse: " + list);
        
    }
}
