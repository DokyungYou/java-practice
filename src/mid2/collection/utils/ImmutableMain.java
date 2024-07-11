package mid2.collection.utils;

import java.util.*;

public class ImmutableMain {
    public static void main(String[] args) {
        // Immutable Collection
        List<Integer> immutableList = List.of(1,2,3,4,2,4,6);
        Set<Integer> immutableSet = Set.of(1,4,56,6,3);
        Map<Integer, String> immutableMap = Map.of(1,"일", 2,"이", 3,"삼");

        // Immutable Collection -> new Collection
        List<Integer> integerList = new ArrayList<>(immutableList);
        Set<Integer> integerSet = new HashSet<>(immutableSet);
        Map<Integer, String> integerMap = new HashMap<>(immutableMap);

        System.out.println("class of integerList: " + integerList.getClass());
        System.out.println("class of integerSet: " + integerSet.getClass());
        System.out.println("class of integerMap: " + integerMap.getClass());


        // Collection -> new Immutable Collection
        List<Integer> immutableList2 = Collections.unmodifiableList(integerList);
        Set<Integer> immutableSet2 = Collections.unmodifiableSet(integerSet);
        Map<Integer, String> immutableMap2 = Collections.unmodifiableMap(integerMap);


    }
}
