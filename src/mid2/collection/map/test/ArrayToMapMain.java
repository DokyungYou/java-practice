package mid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

// 배열 -> 맵 전환
public class ArrayToMapMain {
    public static void main(String[] args) {
        String[][] menuArray = {
                {"트러플오일 감자튀김","8000"},
                {"그린샐러드", "6000"},
                {"고르곤졸라 피자", "13000"},
                {"하우스와인", "6000"},
                {"리코타치즈샐러드","10000"}
        };


        HashMap<String, Integer> menuSet = new HashMap<>();

        for (String[] menu : menuArray) {
            menuSet.put(menu[0], Integer.valueOf(menu[1]));
        }

        for (Map.Entry<String, Integer> entry : menuSet.entrySet()) {
            System.out.println("name: " + entry.getKey() + " | price: " + entry.getValue());
        }

    }
}
