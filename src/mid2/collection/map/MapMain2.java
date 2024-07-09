package mid2.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String,Integer> menuSet = new HashMap<>();

        // map 데이터 추가
        menuSet.put("뉴욕 스트립스테이크", 47900);
        menuSet.put("바베큐 돈마호크 스테이크", 24900);
        menuSet.put("트러플머쉬룸크림파스타", 8900);
        menuSet.put("봉골레파스타", 8900);
        System.out.println(menuSet);

        menuSet.put("뉴욕 스트립스테이크", 10000000); // 같은 key 에 저장 시 새로운값으로 덮어씌움
        System.out.println(menuSet);


        boolean containsKey1 = menuSet.containsKey("바베큐 돈마호크 스테이크");
        boolean containsKey2 = menuSet.containsKey("새우 알리오올리오");
        System.out.println("menuSet.containsKey(\"바베큐 돈마호크 스테이크\"): " + containsKey1);
        System.out.println("menuSet.containsKey(\"새우 알리오올리오\"): " + containsKey2);


        // 특정 값 삭제 (해당 key 의 value 반환)
        Integer remove1 = menuSet.remove("뉴욕 스트립스테이크");
        Integer remove2 = menuSet.remove("새우 알리오올리오");

        System.out.println("menuSet.remove(\"뉴욕 스트립스테이크\"): " + remove1);
        System.out.println("menuSet.remove(\"새우 알리오올리오\"): " + remove2);


    }
}
