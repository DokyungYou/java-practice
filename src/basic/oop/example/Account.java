package basic.oop.example;

public class Account {

    private int balance;


    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if(balance > amount){
            balance -= amount;
        }else{
            System.out.println("잔액부족!");
            showBalance();
        }

    }

    void showBalance(){
        System.out.println("현재 잔액: "+ balance);
    }

}
