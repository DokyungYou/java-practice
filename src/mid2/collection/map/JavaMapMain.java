package mid2.collection.map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {

        run(new HashMap<>());
        run(new LinkedHashMap<>());  // 덮어씌워져도 먼저 들어가있던 순서가 중요
        run(new TreeMap<>()); // key 자체를 기준으로 정렬

    }

    private static void run(Map<String, Integer> map){
        System.out.println("map: " + map.getClass());
        map.put("T", 10);
        map.put("R", 200);
        map.put("I", 30);
        map.put("C", 222);
        map.put("K", 654);
        map.put("S", 829);
        map.put("T", 928);
        map.put("E", 231314);
        map.put("R", -1019847);


        Iterator<String> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println( key + ": " + map.get(key) + " ");
        }
        System.out.println();
    }
}
