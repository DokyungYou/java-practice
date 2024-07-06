package mid2.collection.link;

public class MyLinkedListV2 {

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

    // 추가 코드
    public void add(int index, Object o){
        Node newNode = new Node(o);
        if(index == 0){
            newNode.next = first;
            first = newNode;
        } else {
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public Object remove(int index){
        Node removeNode= getNode(index);
        Object removedItem = removeNode.item;
        if(index == 0){
            first = first.next;
        }else{
            Node prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;

        return removedItem;
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
