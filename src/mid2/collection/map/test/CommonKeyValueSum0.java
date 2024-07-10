package mid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// map1 과 map2 에 공통으로 들어있는 키를 찾고, 그 합 구하기
// 내 풀이
public class CommonKeyValueSum0 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        map1.put("C", 67);
        map1.put("I", 73);
        map1.put("T", 84);
        map1.put("R", 82);
        map1.put("i", 105);
        map1.put("c", 99);

        map2.put("A", 65);
        map2.put("C", 67);
        map2.put("I", 73);
        map2.put("D", 68);

        System.out.println("공통값: " + getIntersection(map1, map2));
        System.out.println(getIntersectionValueSum(map1, map2));
    }

    private static<T> Set<T> getIntersection(Map<T, Integer> map1, Map<T, Integer> map2){
        Set<T> keys = map1.keySet();
        keys.retainAll(map2.keySet());
        return keys;
    }

    private static<T> Map<T, Integer> getIntersectionValueSum(Map<T, Integer> map1, Map<T, Integer> map2){
        Set<T> intersection = getIntersection(map1, map2);
        Map<T, Integer> resultSet = new HashMap<>();

        for (T t : intersection) {
            resultSet.put(t, (map1.get(t) + map2.get(t)));
        }

        return resultSet;
    }
}
