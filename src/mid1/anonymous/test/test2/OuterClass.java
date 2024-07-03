package mid1.anonymous.test.test2;

import java.util.Arrays;

public class OuterClass {

    class InnerClass{
        public void printMethod(){
            System.out.println(Arrays.toString(InnerClass.class.getDeclaredMethods()));
        }
    }
}
