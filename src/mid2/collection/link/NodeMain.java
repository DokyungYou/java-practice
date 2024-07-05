package mid2.collection.link;

public class NodeMain {
    public static void main(String[] args) {
        // 노드 생성 후 연결 A-> B -> c
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("모든 노드 탐색");
        System.out.println("first.item: " + first.item);
        System.out.println("first.next.item: " + first.next.item);
        System.out.println("first.next.next.item: " + first.next.next.item);
        // ======================================================================
        Node n = first;
        while(n != null){
            System.out.println(n);
            n = n.next;
        }
    }
}
