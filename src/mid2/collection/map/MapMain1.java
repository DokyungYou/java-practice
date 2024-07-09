package mid2.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> menuSet = new HashMap<>();

        // map 데이터 추가
        menuSet.put("뉴욕 스트립스테이크", 47900);
        menuSet.put("바베큐 돈마호크 스테이크", 24900);
        menuSet.put("트러플머쉬룸크림파스타", 8900);
        menuSet.put("봉골레파스타", 8900);
        System.out.println(menuSet);
        
        // 특정 값 조회
        System.out.println("봉골레파스타 가격: " + menuSet.get("봉골레파스타"));
        System.out.println("트러플머쉬룸크림파스타 가격: " + menuSet.get("트러플머쉬룸크림파스타"));
        System.out.println("바베큐 돈마호크 스테이크 가격: " + menuSet.get("바베큐 돈마호크 스테이크"));

        // keySet
        Set<String> menuNames = menuSet.keySet();
        for(String name : menuNames){
            Integer price = menuSet.get(name);
            System.out.println("이름: " + name + " | 가격: " + price);
        }

        // values
        Collection<Integer> values = menuSet.values();
        for (Integer value : values) {
            System.out.print(value + "  ");
        }

        //entrySet
        Set<Map.Entry<String, Integer>> entries = menuSet.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("key: " + key + "  value: " + value);
        }

    }
}
