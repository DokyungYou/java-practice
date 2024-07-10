package mid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 { // 정답1
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("C", 67);
        map1.put("I", 73);
        map1.put("T", 84);
        map1.put("R", 82);
        map1.put("i", 105);
        map1.put("c", 99);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("A", 65);
        map2.put("C", 67);
        map2.put("I", 73);
        map2.put("D", 68);

        Map<String, Integer> resultMap = new HashMap<>();

        for (String key : map1.keySet()) {
            if(map2.containsKey(key)){
                resultMap.put(key, map1.get(key) + map2.get(key));
            }
        }
        System.out.println(resultMap);

    }
}
