package mid.lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);


        System.out.println(myInteger.compareTo(100));
        System.out.println(myInteger.compareTo(5));
        System.out.println(myInteger.compareTo(10));
    }
}
