package mid2.collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
    public static void main(String[] args) {

        // 대체적으로 성능이 ArrayDeque > LinkedList
        // 이론상 삽입, 삭제 시 LinkedList가 우수해야하나 실제 사용환경에선 여러 요소로 인해 ArrayDeque 가 성능이 더 좋을 때가 많음
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>();


        // 데이터 추가
        deque.offerFirst(1); // 앞에 추가
        System.out.println(deque);

        deque.offerLast(3); // 뒤에 추가
        System.out.println(deque);

        deque.offer(2); // Queue의 offer (뒤에 추가)
        System.out.println(deque);

        // 다음 꺼낼 데이터 확인 (단순 조회)
        System.out.println("deque.peek(): "+ deque.peek()); // Queue의 peek (앞 확인)
        System.out.println("deque.peek(): "+ deque.peekFirst());
        System.out.println("deque.peek(): "+ deque.peekLast());
        
        // 데이터 꺼내기
        System.out.println("deque.poll(): " + deque.poll());  // Queue의 poll (앞에서 꺼내기)
        System.out.println(deque);

        System.out.println("deque.pollFirst(): " + deque.pollFirst());
        System.out.println(deque);

        System.out.println("deque.pollLast(): " + deque.pollLast()); // []
        System.out.println(deque);

        System.out.println("deque.pollLast(): " + deque.pollLast()); // 에러발생 X, null 반환
    }
}
