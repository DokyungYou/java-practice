package basic.oop.example;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.withdraw(1000);
        account.deposit(Integer.MAX_VALUE);
        account.showBalance();
        System.out.println("난 부자다!!");

    }
}
