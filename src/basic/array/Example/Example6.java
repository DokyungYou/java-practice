package basic.array.Example;

import java.util.Scanner;

public class Example6 {
    // 사용자로부터 학생의 국어, 수학, 영어 점수를 입력받고, 각 학생의 총점과 평균 계산
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] subjects = {"국어", "수학", "영어"};


        System.out.print("학생 수를 입력하시오 :");
        int studentNum = scanner.nextInt();

        int[][] scores = new int[studentNum][subjects.length];

        // 입력 받기
        for (int i = 0; i < scores.length; i++) {
            System.out.println("== " + i+1 + "번째 학생 == ");

            for (int j = 0; j < scores[i].length ; j++) {
                System.out.printf("%d번 학생의 %s 점수: ", i, subjects[j]);
                scores[i][j] = scanner.nextInt();
            }
        }

        // 계산
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;

            System.out.println("== " + i+1 + "번째 학생 == ");
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            System.out.printf("%d번 학생의 총점: %d , 평균: %4.2f \n", i , sum, ((double)sum / subjects.length) );
        }


        
        scanner.close();
    }
}
