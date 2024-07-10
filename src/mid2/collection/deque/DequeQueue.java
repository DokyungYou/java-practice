package mid2.collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueue {
    public static void main(String[] args) {
        // Queue의 기능만 쓸거면 Queue로 타입정의해주기 (Queue <- Deque <- ArrayDeque, LinkedList )
        // Stack의 기능이 필요하면 Deque
        Deque<Integer> deque = new ArrayDeque<>();

        // 데이터 추가
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        deque.offer(4);
        System.out.println(deque);

        // 다음에 꺼낼 수 있는 요소 (단순 조회)
        System.out.println("deque.peek()" + deque.peek());

        // 데이터 꺼내기
        System.out.println("deque.poll(): " + deque.poll());
        System.out.println(deque);

        System.out.println("deque.poll(): " + deque.poll());
        System.out.println(deque);

        System.out.println("deque.poll(): " + deque.poll());
        System.out.println(deque);

        System.out.println("deque.poll(): " + deque.poll());
        System.out.println(deque);

        System.out.println("deque.poll(): " + deque.poll());
        System.out.println(deque);

    }
}
