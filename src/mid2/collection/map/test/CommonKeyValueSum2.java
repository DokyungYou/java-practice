package mid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum2 { // 정답2
    public static void main(String[] args) {

        // ImmutableCollections
        Map<String, Integer> map1 = Map.of( "C", 67,
                                            "I", 73,
                                            "T", 84,
                                            "R", 82,
                                            "i", 105,
                                            "c", 99);

        Map<String, Integer> map2 = Map.of( "A", 65,
                                            "C", 67,
                                            "I", 73,
                                            "D", 68);


        Map<String, Integer> resultMap = new HashMap<>();

        for (String key : map1.keySet()) {
            if(map2.containsKey(key)){
                resultMap.put(key, map1.get(key) + map2.get(key));
            }
        }
        System.out.println(resultMap);

    }
}
