package grammer.method.example;

public class Example1 {

    public static void main(String[] args) {

        Account yourAccount = new Account("You", 1000000L);

        yourAccount.deposit(10000);
        yourAccount.withdraw(50000);
        yourAccount.withdraw(2000000000);
    }


     static class Account{

        String name;
        long balance;


        public Account(String name, long initialDeposit){
            this.name = name;
            balance = initialDeposit;
        }

        
        // 입금
        public void deposit(long depositAmount){
            balance += depositAmount;
            System.out.println("현재 입금하신 금액: "+ depositAmount);
            System.out.println("현재 총 잔액: "+ balance);
        }

         public void withdraw(long withdrawAmount){
            if(balance < withdrawAmount){
                System.out.println("잔액이 부족합니다.");
                System.out.println("현재 총 잔액: "+ balance);
                return;
            }
            balance-= withdrawAmount;
            System.out.println("현재 출금하신 금액: "+ withdrawAmount);
            System.out.println("현재 총 잔액: "+ balance);
         }

    }

}
