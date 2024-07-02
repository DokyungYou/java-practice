package mid.anonymous.test.test3;

import java.util.Arrays;

public class OuterClass {

    public void myMethod(){
        class InnerClass{
            public void printMethod(){
                System.out.println(Arrays.toString(InnerClass.class.getDeclaredMethods()));
            }
        }

        new InnerClass().printMethod();
    }

}
