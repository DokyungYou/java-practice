package mid2.collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Map에 들어있는 데이터 중 값이 X원인 모든 상품 출력
public class ItemPriceTest {
    public static void main(String[] args) {

        Map<String, Integer> menu = new HashMap<>();
        menu.put("새우로제 파스타" , 9900);
        menu.put("트리플머쉬룸크림파스타" , 8900);
        menu.put("핫스파이시 통베이컨 크림 파스타" , 8900);
        menu.put("토마토라구가지파스타" , 8900);
        menu.put("봉골레 파스타" , 8900);
        menu.put("새우 알리오올리오" , 9900);
        menu.put("리코타치즈&바게트 샐러드" , 10000);
        menu.put("뉴욕스트립스테이크" , 47900);
        menu.put("바베큐 돈마호크 스테이크" , 24900);
        menu.put("트러플오일 감자튀김" , 8000);
        menu.put("그린샐러드" , 6000);
        menu.put("하우스와인" , 6000);

        System.out.println("6000원 메뉴: " + getTargetsOfPrice(menu, 6000));
        System.out.println("9900원 메뉴: " + getTargetsOfPrice(menu, 9900));
        System.out.println("8900원 메뉴: " + getTargetsOfPrice(menu, 8900));
    }

    private static List<String> getTargetsOfPrice(Map<String, Integer> menu, int price){
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : menu.entrySet()) {
            if(entry.getValue() == price) result.add(entry.getKey());
        }
        return result;
    }
}
