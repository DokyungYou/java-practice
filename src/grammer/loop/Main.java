package grammer.loop;

public class Main {
    public static void main(String[] args) {

//      1. 반복문 - for
        System.out.println("== for ==");
//      1-1. 기본 사용 방법
        for (int i = 0; i < 5; i++) {
            if (i >= 4)
                System.out.print(i);
            else
                System.out.print(i + ", ");
        }
        System.out.println();


        System.out.println("=====================");

        // 이중 for문 다시 익숙해지자..
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=====================");

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
                // 바로 다음 for문 차례로 넘어간다.
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=====================");

        // brake문은 자신이 속한 반복문을 즉시 탈출
        // 이중 for문이면서 안쪽 for문에 있다면, 안쪽 for만 벗어나는 것임

        // break가 가장 바깥 for문에 있으면 continue와 다르게 아예 반복문 끝남
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (i == 2) {
                    System.out.print("break걸렸다");
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }


//      1-2. for each
        System.out.println("== for each ==");
        int[] nums = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println();

        for (int num : nums) {
            System.out.println(num);
        }


//      2. 반복문 - while
        System.out.println("== while ==");
//      2-1. while
        int i = 0;
        while (i < 5) {
            System.out.print(i++);
        }

        System.out.println();
        System.out.println("==================");

        i = 0;
        while (i < 10) {
            if (i % 2 != 0) {
                i++;
                continue;
            }
            System.out.println(i++);
        }

        System.out.println();
        System.out.println("==================");

        i = 0;
        while (i < 10) {
            if (i % 2 != 0) {
                i++;
                break;
            }
            System.out.println(i++);
        }


//      2-2. do-while
        System.out.println("== do while ==");
        boolean knock = false;
        do {
            System.out.println("knock");
        } while (knock);


//      Q1. 아래와 같은 출력 결과를 반복문과 조건문을 이용하여 출력해보세요.
//      *
//      ***
//      *****
//      *******


        for (int num = 0; num < 8; num++) {
            if (num % 2 == 0) {
                continue;
            }
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


//      Q2. 반복문을 실행할 때마다 물 온도를 1도씩 올리고 100도가 되면 종료한다.
//          추가로, 10도, 20도, ... 10도 간격으로 물 온도를 출력하시오.
        int waterTemperature = 0;


        while (waterTemperature < 100) {
            waterTemperature++;
            if (waterTemperature % 10 == 0) {

                if (waterTemperature == 100) {
                    System.out.print(waterTemperature + "도!!!!");
                } else {
                    System.out.print(waterTemperature + "도,");
                }
            }
        }
        System.out.println();


        System.out.println("====== 누적 합 계산  ======");
        // 누적 합 계산
        /*
        반복문을 사용하여 1부터 MAX까지의 합을 계산하고 출력하시오.
        sum이라는 변수 사용하여 누적 합 표현, i라는 변수를 사용하여 카운트를 수행
        for문, while문 두가지 버전
        */

        int max = 10;
        int sum = 0;

        System.out.println("== for문 ==");
        for (int cnt = 1; cnt <= max; cnt++) {
            System.out.println(cnt + "번 째: " + (sum += cnt));
        }


        // ==========================================================
        System.out.println("== while문 ==");

        sum = 0;
        int count = 1;
        while (count <= max) {
            System.out.println(count + "번 째: " + (sum += count++));
        }


        System.out.println("====== 구구단 출력 ======");
        // 중첩 for문을 사용해서 구구단을 완성해라

        // 2~9단
        // 1~9

        // 세로로 출력하기
        for (int j = 2; j <= 9 ; j++) {
            System.out.printf("\n== %d단 ==\n",j);
            for (int k = 1; k <=9 ; k++) {
                System.out.printf("%d * %d = %2d\n",j,k,(j*k));
            }
        }

        // 가로로 출력하기 
        for (int j = 1; j <= 9 ; j++) {
            for (int k = 2; k <=9 ; k++) {
                System.out.printf("%d * %d = %2d | ", k,j,(k*j));
            }
            System.out.println();
        }

        System.out.println("====== 피라미드 출력 ======");


    }
}
