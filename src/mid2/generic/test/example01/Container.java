package mid2.generic.test.example01;

public class Container<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean isNull(){
        return value == null;
    }
}
