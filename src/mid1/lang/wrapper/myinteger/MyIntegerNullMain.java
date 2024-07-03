package mid1.lang.wrapper.myinteger;

public class MyIntegerNullMain {
    public static void main(String[] args) {
        MyInteger[] intArray = {
                new MyInteger(3),
                new MyInteger(4),
                new MyInteger(5),
                new MyInteger(2),
                new MyInteger(-3),
                new MyInteger(-1)
        };

        System.out.println(findValue(intArray, 4));
        System.out.println(findValue(intArray, -3));
        System.out.println(findValue(intArray, -10));  // null
        System.out.println(findValue(intArray, -1));
    }

    private static MyInteger findValue(MyInteger[] intArray, int target){
        for(MyInteger myInteger : intArray){
            if(target == myInteger.getValue()) return myInteger;
        }

        return null;
    }
}
