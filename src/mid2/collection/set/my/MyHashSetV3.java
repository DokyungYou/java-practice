package mid2.collection.set.my;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E>{

    static final int DEFAULT_INITIAL_CAPACITY = 15;
    private LinkedList<E>[] elements;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3(){
        initialList(capacity);
    }

    public MyHashSetV3(int capacity){
        initialList(capacity);
    }

    private void initialList(int capacity){
        elements = new LinkedList[this.capacity = capacity];
        for (int i = 0; i < capacity; i++) {
            elements[i] = new LinkedList<>();
        }
    }


    public boolean add(E value){
        if(contains(value)) return false;
        elements[getHashIndex(value)].add(value);
        size++;
        return true;
    }

    public boolean remove(E value){
        boolean isRemoved = elements[getHashIndex(value)].remove(value); // remove(int index) , remove(Object o)
        if(!isRemoved) return false;
        size--;
        return true;
    }

    private int getHashIndex(E value){
        return Math.abs(value.hashCode()) % elements.length; // 절댓값
    }

    public boolean contains(E value) {
        LinkedList<E> list = elements[getHashIndex(value)]; // O(1) * O(1)
        return list.contains(value); // O(n) -> 평균은 O(1)
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
