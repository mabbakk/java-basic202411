package chap1_3;

public class BankAccount {
    // 속성 정의
    // 계좌번호
    String accountNumber;

    // 계좌 소유자
    String owner;

    // 잔고
    String balance;


    // 입출금 여부
    boolean money;


    void deposit() {
        if(!money) {
            System.out.println("입금이 완료되었습니다.");
            return;
        }
        money = false;
        System.out.println("잔액이 부족합니다.");
    }
}
