package mid2.collection.array;

import java.util.Arrays;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV1(int initialCapacity) {
        this.elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object e){
        if(size >= elementData.length){
            System.out.println("capacity 초과");
            return;
        }
        elementData[size++] = e;
    }

    public Object get(int index){
        if(index > elementData.length-1){
            System.out.println("존재하지 않는 인덱스");
            return null;
        }
        return elementData[index];
    }

    public Object set(int index, Object element){    // 기존 값을 반환
        Object oldValue = elementData[index];
        elementData[index] = element;

        return oldValue;
    }

    public int indexOf(Object object){
        for (int i = 0; i < size; i++) {
            if(object.equals(elementData[i]))  return i;
        }
        return -1;
    }

    public int indexOf(Object object, int startIndex){
        for (int i = startIndex; i < size; i++) {
            if(object.equals(elementData[i]))  return i;
        }
        return -1;
    }

    public String toString(){
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < size - 1; i++) {
//            sb.append(elementData[i]).append(",");
//        }
//        sb.append(elementData[size - 1]);
//
//        return sb.toString();

        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size: " + size + "," + " capacity: " + elementData.length ;
    }
}

