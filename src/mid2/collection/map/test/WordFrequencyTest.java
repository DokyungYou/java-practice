package mid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

// 같은 단어가 나타난 수 - 각각의 단어가 나타난 수 출력
public class WordFrequencyTest {
    public static void main(String[] args) {

        String text = "hair,tonic,bear,yeast,monster,hair,tonic,tonic";
        String[] split = text.split(",");

        Map<String, Integer> map = new HashMap<>();

        for (String s : split) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        System.out.println(map);
    }
}
