package mid.anonymous.test.test2;

public class OuterClassMain {
    public static void main(String[] args) {
        OuterClass.InnerClass nestedClass = new OuterClass().new InnerClass();
        nestedClass.printMethod();
    }
}
