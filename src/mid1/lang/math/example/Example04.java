package mid1.lang.math.example;

import java.util.Arrays;
import java.util.Random;

public class Example04 {
    public static void main(String[] args) {

        // 로또 번호 자동 생성기 만들기
        // 1~45 사이의 숫자 6개 뽑기
        // 숫자 중복 허용 X
        // 실행할때마다 결과가 달라야함

        
        // 내 풀이 ==========================================
        Random random = new Random();
        int[] lottoNums = new int[6];
        
        for (int i = 0; i < lottoNums.length; i++) {
            int randomNum = random.nextInt(45) + 1;
            lottoNums[i] = randomNum;

            for (int j = 0; j < i; j++) {
                if(lottoNums[j] == randomNum){
                    i--;
                    break;
                }
            }
        }
        System.out.println("로또 번호: " + Arrays.toString(lottoNums));


        // 해설 ====================================================
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] result = lottoGenerator.generateNums();
        System.out.println("로또 번호: " + Arrays.toString(result));
    }
}
