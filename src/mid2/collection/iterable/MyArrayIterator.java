package mid2.collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {     // remove() forEachRemaining() 은 default 메서드
    
    private int currentIndex = -1;
    private final int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        return (targetArr.length - 1) > (currentIndex);
    }

    @Override
    public Integer next() {
        return targetArr[++currentIndex];
    }
}

