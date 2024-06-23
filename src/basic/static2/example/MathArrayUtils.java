package basic.static2.example;

//배열용 수학 유틸리티 클래스 만들기
public class MathArrayUtils {

    public static int getSum(int[] array){
        int sum = 0;
        for(int num : array)  sum+= num;

        return sum;
    }
    public static double getAverage(int[] array){
        int totalCount = 0;
        int sum = 0;

        for(int num : array){
            sum +=  num;
            totalCount++;
        }


        return Double.parseDouble(String.format("%4.2f", (double) sum / totalCount));
    }

    public static int getMin(int[] array){
        int min = array[0];

        for (int i = 1; i < array.length; i++){
            if(min > array[i]) min = array[i];
        }

        return  min;
    }
    public static int getMax(int[] array){
        int max = array[0];

        for (int i = 1; i < array.length; i++){
            if(max < array[i]) max = array[i];
        }

        return  max;
    }
}
