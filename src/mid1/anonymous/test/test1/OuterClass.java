package mid1.anonymous.test.test1;

import java.util.Arrays;

public class OuterClass {

    static class NestedClass{
        public void printMethod(){
            System.out.println(Arrays.toString(NestedClass.class.getDeclaredMethods()));
        }
    }
}
