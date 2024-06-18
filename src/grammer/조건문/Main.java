package grammer.조건문;

public class Main {
    public static void main (String[] args){
//      1. 조건문 - if
        System.out.println("== if ==");
        int waterTemp = 99;

        if(waterTemp >= 100){
            System.out.println("물이 끓고 있습니다.");
        }else {
            System.out.println("아직 물을 끓이는 중입니다.");
        }

        int score = 80;
        char grade = 0;

        if(score >=90){
            grade = 'A';
        }else if(score >= 90){
            grade = 'B';
        }else if(score >= 70){
            grade='C';
        }else {
            grade='F';
        }
        System.out.println("grade of 80 score: " + grade);


//      2. 조건문 - switch
        System.out.println("== switch ==");

        String selectedFruit = "apple";

        // 조건문이 아닌 값을 넣어야함
        switch(selectedFruit){
            case "banana" :
                System.out.println(selectedFruit +"는 5000원이다.");
                break;
            case "apple" :
                System.out.println(selectedFruit + "는 6000원이다.");
                break;
            case "grape" :
                System.out.println(selectedFruit+"는 떨이판매중이다.");
                break;
            default :
                System.out.println("판매하고 있지 않습니다.");
                break;
        }


//      Q1. number의 값이 홀수인지 짝수인지 판단하는 코드를 작성하세요.
        int number = 5;

        if(number % 2 == 0){
            System.out.println(number+"은 짝수입니다.");
        }else{
            System.out.println(number+"은 홀수입니다.");
        }



//      Q2. 아래 주석은 위의 실습에서 진행한 score에 따라 grade를 출력하는 코드이다.
//        이를 switch 조건문 기반으로 바꿔보세요.
//        int score = 90;
//        char grade = 0;
//        if (score >= 90) {
//            grade = 'A';
//        } else if (score >= 80) {
//            grade = 'B';
//        } else if (score >= 70) {
//            grade = 'C';
//        } else {
//            grade = 'F';
//        }
//        System.out.println("grade = " + grade);

        int score2 = 78;
        char grade2;

        System.out.println(score2/10);

        switch(score2 / 10){
            case (10):

            case (9):
                grade2='A';
                break;
            case (8):
                grade2='B';
                break;
            case(7):
                grade2 ='c';
                break;
            default:
                grade2='f';
                break;
        }
        System.out.println("점수가 " + score2 + "로 학점은 " + grade2 + "입니다!");


    }
}
