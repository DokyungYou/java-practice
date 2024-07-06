package mid2.collection.list;

public interface MyList<E> {

    int size();

    void add(E o);

    void add(int index, E e);

    E remove(int index);

    E set(int index, E element);

    E get(int index);

    int indexOf(E o);
}
