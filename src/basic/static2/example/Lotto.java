package basic.static2.example;

import java.util.Arrays;

public class Lotto {

    int[] numbers = new int[6];

    static private long totalSaleCount;



    public Lotto(int[] selectedNumbers){

        System.out.println("선택한 숫자: " + Arrays.toString(selectedNumbers));
        boolean isValid = true;

        for (int i = 0; i < numbers.length; i++) {
            if(!(1 <= selectedNumbers[i] && selectedNumbers[i] <= 45)){
                isValid = false;
                System.out.println("무효값: " + selectedNumbers[i]);
            }
            numbers[i] = selectedNumbers[i];
        }

        if(isValid) totalSaleCount++;
        System.out.println("========================================");
    }

    public static void showTotalSaleCount(){
        System.out.println("총 판매수: "+ totalSaleCount);
    }

}
