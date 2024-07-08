package mid2.collection.set.start;

import java.util.Arrays;

public class HashStart01 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[5];
        inputArray[0] =1;
        inputArray[1] =3;
        inputArray[2] =5;
        inputArray[3] =7;
        inputArray[4] =9;
        System.out.println(Arrays.toString(inputArray));
        
        int searchValue = 9;
        for (Integer value : inputArray) { // O(n)
            if(value == searchValue) System.out.println(searchValue);

        }

    }
}
