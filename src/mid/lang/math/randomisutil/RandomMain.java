package mid.lang.math.randomisutil;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();

        int randomInt = random.nextInt();
        System.out.println("randomInt: "+ randomInt);

        double randomDouble = random.nextDouble(); // 0.0d ~ 1.0d
        System.out.println("randomDouble: "+ randomDouble);


        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean: " + randomBoolean);

        int boundInt = random.nextInt(10); // 0 ~ 9 까지 출력
        System.out.println("0 ~ 9 : " + boundInt);

        // 1부터 특정범위의 수
        int boundInt2 = random.nextInt(10) + 1; // 1~10
        System.out.println("1 ~ 10: " + boundInt2);


        // seed의 값이 같으면 계속 동일한 랜덤값이 나온다. (seed 값으로 계산을 하기 때문)
        Random random1 = new Random(1);

        int randomInt1 = random1.nextInt();
        System.out.println("randomInt: "+ randomInt1);

        double randomDouble1 = random1.nextDouble(); // 0.0d ~ 1.0d
        System.out.println("randomDouble: "+ randomDouble1);


        boolean randomBoolean1 = random1.nextBoolean();
        System.out.println("randomBoolean: " + randomBoolean1);

        int boundInt2_1 = random1.nextInt(10); // 0 ~ 9 까지 출력
        System.out.println("0 ~ 9 : " + boundInt2_1);

        // 1부터 특정범위의 수
        int boundInt2_2 = random1.nextInt(10) + 1; // 1~10
        System.out.println("1 ~ 10: " + boundInt2_2);


    }
}
