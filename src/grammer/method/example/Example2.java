package grammer.method.example;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account yourAccount = new Account();


        while (true){
            System.out.println("1.입금 | 2.출금 | 3.잔액확인 | 4.종료 ");
            int selectedOption = scanner.nextInt();

            if(selectedOption == 1){
                System.out.print("입금하실 금액을 입력해주세요: ");
                yourAccount.deposit(scanner.nextLong());

            }else if(selectedOption == 2){
                System.out.print("출금하실 금액을 입력해주세요: ");
                yourAccount.withdraw(scanner.nextLong());

            }else if(selectedOption == 3){
                System.out.println("현재 잔액: "+ yourAccount.checkBalance());

            }else if(selectedOption == 4){
                System.out.println("시스템 종료");
                break;

            }else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }


        scanner.close();
    }


}

 class Account{


    long balance= 0;


    void deposit(long depositAmount){
        balance+=depositAmount;
        System.out.println(depositAmount+"원을 입금했습니다. | 현재 잔액: "+balance);
    }

     void withdraw(long withdrawAmount){

        if(balance < withdrawAmount) {
            System.out.println(withdrawAmount+"원 출금 실패 | 현재잔액: " + balance);
        }else {
            balance-= withdrawAmount;
            System.out.println(withdrawAmount+"원 출금 | 현재잔액: " + balance);
        }

     }

     long checkBalance(){
        return balance;
     }

}
