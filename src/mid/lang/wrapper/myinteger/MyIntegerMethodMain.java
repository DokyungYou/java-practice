package mid.lang.wrapper.myinteger;

public class MyIntegerMethodMain {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);


        System.out.println(myInteger.compareTo(100));
        System.out.println(myInteger.compareTo(5));
        System.out.println(myInteger.compareTo(10));
    }
}
