package mid2.collection.link;

public class MyLinkedListV1 {

    private Node first;
    private int size = 0;

    public void add(Object o){
        Node newNode = new Node(o);
        if(first == null){
            first = newNode;
        }else{
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node n = first;
        while (n.next != null){
            n = n.next;
        }
        return n;
    }

    // 해당 노드의 기존 값 반환
    public Object set(int index, Object element){

        Node n = getNode(index);
        Object oldValue = n.item;
        n.item = element;
        return  oldValue;
    }

    public Object get(int index){
        return getNode(index).item;
    }

    private Node getNode(int index) {
        Node n = first;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        return n;
    }

    // my
//    public int indexOf(Object o){
//        Node n = first;
//        for (int i = 0; i < size; i++) {
//            if(n.item == o) return i;
//            n = n.next;
//        }
//        return -1;
//    }

    public int indexOf(Object o){
        int index = 0;
        for (Node n = first; n != null ; n = n.next) {
            if(o.equals(n.item)){
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
