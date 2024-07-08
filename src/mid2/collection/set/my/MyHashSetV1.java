package mid2.collection.set.my;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    static final int DEFAULT_INITIAL_CAPACITY = 15;
    private LinkedList<Integer>[] elements;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1(){
        initialList(capacity);
    }

    public MyHashSetV1(int capacity){
        initialList(capacity);

    }

    private void initialList(int capacity){
        elements = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            elements[i] = new LinkedList<>();
        }
    }


    public boolean add(int value){
        if(contains(value)) return false;
        elements[getHashIndex(value)].add(value);
        size++;
        return true;
    }

    public boolean remove(int value){

        boolean isRemoved = elements[getHashIndex(value)].remove(Integer.valueOf(value)); // remove(int index) , remove(Object o)
        if(!isRemoved) return false;
        size--;
        return true;
    }

    private int getHashIndex(int value){
        int hashIndex = value % elements.length;
        if(value < 0) return hashIndex * -1;

        return hashIndex;
    }

    public boolean contains(int value) { // O(n)
        LinkedList<Integer> list = elements[getHashIndex(value)];
        return list.contains(value);
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
