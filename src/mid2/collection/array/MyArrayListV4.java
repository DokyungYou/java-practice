package mid2.collection.array;

import java.util.Arrays;

// 동적 배열
public class MyArrayListV4<E> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData; // 이레이저 문제로 Object 타입 그대로 두기
    private int size = 0;

    public MyArrayListV4() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV4(int initialCapacity) {
        this.elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }


    public void add(E e){
        if(size == elementData.length){
//            System.out.println("capacity 초과");
//            return;
            increaseCapacity();
        }
        elementData[size++] = e;
    }

    private void increaseCapacity() {
        int newCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newCapacity); // newCapacity 길이의 배열을 생성하면서 복사한 기존 배열내용을 넣는다.
    }

    @SuppressWarnings("unchecked")
    public E get(int index){
        if(index > elementData.length-1){
            System.out.println("존재하지 않는 인덱스");
            return null;
        }
        return (E)elementData[index];
    }
    @SuppressWarnings("unchecked")
    public E set(int index, E element){    // 기존 값을 반환
        E oldValue = (E)elementData[index];
        elementData[index] = element;

        return oldValue;
    }

    public int indexOf(E object){
        for (int i = 0; i < size; i++) {
            if(object.equals(elementData[i]))  return i;
        }
        return -1;
    }

    public int indexOf(E object, int startIndex){
        for (int i = startIndex; i < size; i++) {
            if(object.equals(elementData[i]))  return i;
        }
        return -1;
    }

    @Override
    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size: " + size + "," + " capacity: " + elementData.length ;
    }

    // 데이터 추가
    public void add(int index, E e){
        if(size == elementData.length){
            increaseCapacity();
        }
        // 데이터 추가 전 이동필요 (한칸씩 오른쪽으로)
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    // 데이터 삭제 (삭제값 반환)
    @SuppressWarnings("unchecked")
    public E remove(int index){
        E removed = (E)elementData[index];

        // index 부터 마지막까지 왼쪽으로 밀기
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return removed;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size-1 ; i++) {
            elementData[i] = elementData[i+1];
        }

    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i-1];
        }
    }
}

