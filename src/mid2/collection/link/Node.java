package mid2.collection.link;

public class Node {
    Object item;

    Node next;

    public Node(Object item){
        this.item = item;
    }


    // A -> B -> C
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node x = this;
        sb.append("[");
        while (x != null){
            sb.append(x.item);
            if(x.next != null){
                sb.append(" -> ");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }

    // IDE 자동오버라이딩 toString()
//    @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                '}';
//    }
}
