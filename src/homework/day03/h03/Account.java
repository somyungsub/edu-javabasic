package homework.day03.h03;

public class Account {
    private String account;
    private int balance;
    private double interestRate;

    public Account() {
    }

    public Account(String account, int balance, double interestRate) {
        this.account = account;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // 현재 잔액을 기준으로 이자를 계산 한다
    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    // 입금을 통해 잔액정보를 증가 시킨다
    public void deposit(int money) {
        balance += money;
    }

    /*
        출금을 통해 잔액정보를 감소 시킨다
        단, 출금을 통해 잔액이 0보다 작으면
        “출금 할 수 없습니다.”를 출력한다.
     */
    public void withdraw(int money) {
        int result = balance - money;    // 출금한 결과 금액 임시 로컬변수 지역변수는 적절히 사용하시면 됩니다.

        // 출금이 불가능한 경우
        if (result < 0) {
            System.out.println("출금 할 수 없습니다.");
            return;
        }

        balance = result;   // 출금 가능한 경우 잔액은 result 값이 됩니다.
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
