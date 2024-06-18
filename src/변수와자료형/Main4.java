package 변수와자료형;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Main4 {
  public static void main(String[] args){

//  1. 자료형 - 리스트
    System.out.println("== 리스트 ==");
    
    // 제네릭 없이 사용하는게 가능은 하다.
    ArrayList l1 = new ArrayList();

//  1-1. add
    l1.add(1);
    l1.add("Hi");
    l1.add("2");
    l1.add(0,0);
    System.out.println(l1);  // [0, 1, Hi, 2]

//  1-2. get
    System.out.println(l1.get(2));
    System.out.println(l1.get(l1.toArray().length-1));

//  1-3. size
    System.out.println(l1.size());  // list는 length가 아닌 size로 잡음

//  1-4. remove

    // 그냥 숫자를 넣으면 인덱스
    l1.remove(0);
    System.out.println("l1.remove(0): " + l1); // [1, Hi, 2]
    
    // 인덱스가 아닌 숫자값을 지정하고싶은 경우
    l1.remove(Integer.valueOf(1));
    System.out.println("l1 에서 숫자 1 remove: " + l1); // [Hi, 2]

//  1-5. clear
    l1.clear();
    System.out.println("cleared l1: "+l1);



    
//  정렬 알고리즘은 추후에 자세히 (복잡도 등)
//  1-6. sort
    ArrayList<Integer> l2 = new ArrayList<>();
    l2.add(3);
    l2.add(5);
    l2.add(2);
    l2.add(1);
    System.out.println("l2: " + l2);

    l2.sort(Comparator.naturalOrder());
    System.out.println("l2 naturalOrder: "+l2);

    l2.sort(Comparator.reverseOrder());
    System.out.println("l2 reverseOrder: "+l2);

//  1-7. contains
    System.out.println(l2.contains(2));
    System.out.println(l2.contains(0));

//  2.Maps
    System.out.println("== Maps ==");

//  2-1. put
    HashMap<String,Integer> supermarketMap= new HashMap<>();
    supermarketMap.put("carrot", 2000);
    supermarketMap.put("chives", 3000);

    System.out.println(supermarketMap);  // {chives=3000, carrot=2000}

//  2-2. get
    System.out.println("carrot: " + supermarketMap.get("carrot"));  // 2000
    System.out.println("durian: "+ supermarketMap.get("durian"));  // null

//  2-3. size
    System.out.println(supermarketMap.size());  // 2

//  2-4. remove
    System.out.println(supermarketMap.remove("chives"));  // 3000   (지우는 값을 리턴함)
    
    // 없는 값을 지우려할 때
    System.out.println(supermarketMap.remove("durian"));  // null  (에러가 뜨진 않음)

    System.out.println("supermarketMap: " + supermarketMap);  // {carrot=2000}


//  2-5. containsKey
    System.out.println(supermarketMap.containsKey("carrot"));  //true
    System.out.println(supermarketMap.containsValue(2000));  //true


  }
}

