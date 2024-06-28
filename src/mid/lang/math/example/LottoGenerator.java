package mid.lang.math.example;


import java.util.Random;

// 내가 절차지향적으로 풀이했던 것을 객체지향적으로 바꿔보자
public class LottoGenerator {
    private final Random random = new Random();
    private final int[] lottoNums;

    public LottoGenerator(){
        lottoNums = new int[6];
    }
    
    // 숫자 뽑기
    public int[] generateNums(){
        int count = 0;
        while(count < lottoNums.length){
            int randomNum = random.nextInt(45) + 1;
            
            // 중복 검사
            if(isUnique(count, randomNum)){
                lottoNums[count] = randomNum;
                count++;
            }
        }
        return lottoNums;
    }

    
    // 중복 검사
    private boolean isUnique(int count, int randomNum){

        for (int i = 0; i < count; i++) {
            if(randomNum == lottoNums[i]) return false;
        }
        return true;
    }
    

}
