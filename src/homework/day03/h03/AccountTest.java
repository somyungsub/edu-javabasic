package homework.day03.h03;

public class AccountTest {
    public static void main(String[] args) {
        /*
            고정 금리의 계좌를 생성 하여 현재 잔액을 기준으로 이자를 계산하는 프로그램을 작성 한다.
            사용 데이터
            Account(계좌번호): 441-0290-1203, balance(잔액): 500000원, interestRate(이율): 7.3%
         */

        Account account;
        // account 객체 생성
        account = new Account("441-0290-1203", 500000, 7.3);

        // account 기본 정보 출력
        System.out.println("계좌정보 : " + account.getAccount() + " 현재잔액 : " + account.getBalance());

        // account 에서 600000원 출금
        account.withdraw(600000);   // 출금이 불가능한 내용 출력이됨

        // account 에 20000원 입금
        account.deposit(20000);

        // account 변경 정보 출력
        System.out.println("계좌정보 : " + account.getAccount() + " 현재잔액 : " + account.getBalance());

        // 이자 출력 – 현재 잔고를 기준으로 고객에게 줄 이자 금액을 출력 한다
        System.out.println("이자 : " + account.calculateInterest());

        /*
            정보출력은 Account에서 따로 메서드로 만든다음 활용을 할 수도 있겠죠?
            지금처럼 2번 이상 활용이 예상이 되는 경우가 발생 할 수 있으므로
            모든 기능은 메서드로 활용이 가능하도록 구현을 하는게 좋습니다!
         */
    }
}
