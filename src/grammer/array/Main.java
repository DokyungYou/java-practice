package grammer.array;

public class Main {
    public static void main(String[] args){

        // 1. 일차원 배열
        System.out.println("== 일차원 배열 ==");
        int[] arr = {1,2,3};

        // for i
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //for each
        for (int num : arr){
            System.out.println(num);
        }



        // 2. 이차원 배열
        System.out.println("== 이차원 배열 ==");

//        int[][] arr2 = {{1,3,4},{2,3,4,5}};

        int[][] arr2 = new int[2][];
        arr2[0] = new int[3];
        arr2[1] = new int[4];

        arr2[0] = new int[]{1,3,4};
        arr2[1] = new int[]{2,3,4,5};

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int[] numArr :arr2){
            for(int num :numArr){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        



//      Q1. 아래와 같이 3x3 행렬이 2차원 배열로 초기화 되어있다.
//          모든 원소를 1로 변경하고, 대각 원소는 10으로 변경하시오.
        int [][] testArray1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < testArray1.length; i++) {
            for (int j = 0; j < testArray1[i].length; j++) {

                testArray1[i][j] = 1;
                if(i == j){
                    testArray1[i][j] = 10;
                }

            }
        }

        for (int i = 0; i < testArray1.length; i++) {
            for (int j = 0; j < testArray1[i].length; j++) {
                System.out.print(testArray1[i][j] + " ");
            }
            System.out.println();
        }
        
        
        
    }
}
