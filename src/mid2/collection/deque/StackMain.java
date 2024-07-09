package mid2.collection.deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        // 현재는 스택 클래스 사용 지양 (Deque 를 사용할 것)
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);

        // 다음에 꺼낼 요소 확인(꺼내지 않은 상태로 조회)
        Integer peek = stack.peek();
        System.out.println("peek: " + peek);

        // 요소 뽑기
        Integer pop = stack.pop();
        System.out.println("pop: " + pop); // 4

        System.out.println("stack.pop(): "+ stack.pop()); // 3
        System.out.println("stack.pop(): "+ stack.pop()); // 2
        System.out.println("stack.pop(): "+ stack.pop()); // 1
        //System.out.println("stack.pop(): "+ stack.pop()); // EmptyStackException
        //System.out.println("stack.peek: " + stack.peek()); // EmptyStackException
        System.out.println("stack.empty(): " + stack.empty());
        System.out.println(stack); // []



    }
}
