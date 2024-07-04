package mid2.generic.example05;

public class Box<T>{

    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}
