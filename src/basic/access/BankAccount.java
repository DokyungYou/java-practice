package basic.access;

public class BankAccount {

    // 잔액을 밖에서 직접 접근못하게 막음
    private long balance;

    public BankAccount() {
    }

    public void deposit(long amount){

        if(validateAmount(amount)){
            balance += amount;
        }else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void withdraw(long amount){

        if(validateAmount(amount) && amount < balance){
            balance -= amount;
        }else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }


    public void showBalance(){
        System.out.println(getBalance());
    }

    private long getBalance(){
        return balance;
    }

    // 내부에서만 쓰는 메서드는 숨김
    private boolean validateAmount(long amount) {
        return amount > 0;
    }

}
