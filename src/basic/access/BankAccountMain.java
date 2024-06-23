package basic.access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.showBalance();
        bankAccount.withdraw(10000000);



        bankAccount.deposit(Integer.MAX_VALUE); // 내 통장잔고였으면 좋겠고..
        bankAccount.showBalance();

    }
}
