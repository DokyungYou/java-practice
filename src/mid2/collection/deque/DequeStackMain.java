package mid2.collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        // Deque 에서 Stack에서 쓰던 메서드까지 제공 (상속, 구현 관계가 아님에도)
        // 자바의 Stack은 성능이 좋지 않으므로 Deque의 ArrayDeque 사용권장

        // 데이터 추가
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);

        // 다음 꺼낼 데이터 단순 조회
        System.out.println("deque.peek(): "+ deque.peek());
        
        // 데이터 꺼내기
        System.out.println("deque.pop(): " + deque.pop());
        System.out.println(deque);

        System.out.println("deque.pop(): " + deque.pop());
        System.out.println(deque);

        System.out.println("deque.pop(): " + deque.pop());
        System.out.println(deque); // []

        // 요소가 없을 때 poll -> 에러 X,  pop() -> 에러발생
       // System.out.println("deque.pop(): " + deque.pop());  // NoSuchElementException


    }
}
