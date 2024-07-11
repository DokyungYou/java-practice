package mid2.collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {

        // Immutable Collection
        List<Integer> integerList = List.of(1,2,3,4,2,4,6);   //integerList.sort(null); // UnsupportedOperationException
        Set<Integer> integerSet = Set.of(1,4,56,6,3);
        Map<Integer, String> integerMap = Map.of(1,"일", 2,"이", 3,"삼");

        System.out.println("class of integerList: " + integerList.getClass()); // ImmutableCollections$ListN
        System.out.println("class of integerSet: " + integerSet.getClass()); // ImmutableCollections$SetN
        System.out.println("class of integerMap: " + integerMap.getClass()); // ImmutableCollections$MapN
    }
}
