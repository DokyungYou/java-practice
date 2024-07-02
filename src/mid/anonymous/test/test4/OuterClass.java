package mid.anonymous.test.test4;

import java.util.Arrays;

public class OuterClass {

    public void myMethod(){

        Printer printer = new Printer(){
            @Override
            public void printMethod(){
            System.out.println(Arrays.toString(OuterClass.class.getDeclaredMethods()));
        }};

        printer.printMethod();
    }

}
