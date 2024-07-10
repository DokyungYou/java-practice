package mid2.collection.deque;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        // Queue <- Deque <- ArrayDeque , LinkedList
        Queue<Integer> queue = new ArrayDeque<>();
        //Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue);

        // 꺼내지 않고 조회
        System.out.println("queue.peek(): " + queue.peek());
        
        // 데이터 꺼내기
        queue.poll();
        System.out.println(queue); // [2, 3, 4]

        queue.poll();
        System.out.println(queue); // [3, 4]

        queue.poll();
        System.out.println(queue); // [4]

        queue.poll();
        System.out.println(queue); // []

        queue.poll();
        System.out.println(queue); // [] stack과 달리 에러X



    }
}
