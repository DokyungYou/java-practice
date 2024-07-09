package mid2.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {
        Map<String,Integer> menuSet = new HashMap<>();

        // map 데이터 추가 ===================================
        menuSet.put("뉴욕 스트립스테이크", 47900);
        menuSet.put("바베큐 돈마호크 스테이크", 24900);
        menuSet.put("트러플머쉬룸크림파스타", 8900);
        menuSet.put("봉골레파스타", 8900);
        System.out.println(menuSet);

        menuSet.put("뉴욕 스트립스테이크", 10000000); // 같은 key 에 저장 시 새로운값으로 덮어씌움
        System.out.println(menuSet);



        // 특정 key가 없는 경우에만 추가 ===================================
        if(!menuSet.containsKey("봉골레파스타")){
            menuSet.put("봉골레파스타", 10000);
        }
        // 특정 key 값이 있다면 덮어씌우기 X
        menuSet.putIfAbsent("토마토라구가지파스타", 8900);
        menuSet.putIfAbsent("토마토파스타", 8900);
        menuSet.putIfAbsent("바베큐 돈마호크 스테이크", 50000);

        System.out.println(menuSet);
    }
}
