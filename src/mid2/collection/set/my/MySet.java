package mid2.collection.set.my;

public interface MySet<E> {
    boolean add(E value);
    boolean remove(E value);
    boolean contains(E value);
    int size();
}
