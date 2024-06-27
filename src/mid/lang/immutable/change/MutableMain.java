package mid.lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObject object = new MutableObject(100);
        object.add(100);
        System.out.println("object.getValue(): "+ object.getValue());
    }
}
