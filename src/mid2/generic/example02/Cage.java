package mid2.generic.example02;

public class Cage<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}
