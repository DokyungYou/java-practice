package mid1.lang.math.example;

public class Example02 {
    public static void main(String[] args) {
        // 배열에 입력된 모든 숫자의 합 구하기
        String[] numbers = {"1.2", "4", "3", "-1", "-10", "4.4", "7", "9.9"};

        double result = 0.0;
        for(String num : numbers){
            double parseNum = Double.parseDouble(num);
            result += parseNum;
            System.out.print(parseNum + "  ");
        }
        System.out.println("\n result: " + result);
    }
}
