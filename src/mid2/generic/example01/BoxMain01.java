package mid2.generic.example01;

public class BoxMain01 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.setValue(1); // auto boxing
        System.out.println("integerBox" + integerBox.getValue());

        StringBox stringBox = new StringBox();
        stringBox.setValue("hello");
        System.out.println("stringBox" + stringBox.getValue());
    }
}
