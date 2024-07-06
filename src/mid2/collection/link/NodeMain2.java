package mid2.collection.link;

public class NodeMain2 {
    public static void main(String[] args) {
        // 노드 생성 후 연결 A-> B -> c
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        System.out.println("== 모든 노드 탐색 ==");
        getPrintAll(first);


        System.out.println("== 마지막 노드 조회하기 ==");
        Node lastNode = getLastNode(first);
        System.out.println("마지막 노드: " + lastNode);


        System.out.println("== 특정 index의 노드 조회하기 ==");
        int index = 2;
        Node thirdNode = getNode(first, index);
        System.out.println("thirdNode.item: " + thirdNode.item);

        System.out.println("== 데이터 추가 ==");
        add(first, "D");

    }

    private static void add(Node first, String value) {
        getLastNode(first).next = new Node(value);
    }

    private static void getPrintAll(Node node) {
        Node n = node;
        while(n != null){
            System.out.println(n.item);
            n = n.next;
        }
    }

    private static Node getNode(Node fristNode ,int index) {
        Node n = fristNode;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        return n;
    }

    private static Node getLastNode(Node node) {
        Node n = node;
        while(n.next != null){
            n = n.next;
        }
        return n; // n.next == null
    }
}
