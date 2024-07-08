package mid2.collection.set.my;

import java.util.Arrays;

public class MyHashSetV0 {
    private int[] elements = new int[10];
    private int size = 0;


    // 데이터를 추가할때마다 O(n) 의 성능 O(1) * O(n))
    public boolean add(int value){
        if(contains(value)) return false; // O(n)

        elements[size++] = value; // O(1)
        return true;
    }

    public boolean contains(int value) { // O(n)
        for (int i = 0; i < size; i++) {
            if(value == elements[i]) return true;
        }
        return false;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "element=" + Arrays.toString(Arrays.copyOf(elements, size)) +
                ", size=" + size +
                '}';
    }
}
