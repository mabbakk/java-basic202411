package chap2_1.exception;

public class LoginInvalidException extends Exception {
    // Exception을 상속 받으면 새 에러를 지정,생성할 수 있다.

    // 생성자 2개

    // 기본 생성자 : 에러 메시지가 딱히 없는 경우
    public LoginInvalidException() {
    }

    // 에러메시지를 등록하는 생성자
    public LoginInvalidException(String message) {
        super(message);
    }

}
