package day05.exception.chapter02;

/*
    사용자정의 예외
 */
public class BizException extends Exception {

    public BizException(String msg) {
        // 상위클래스 Exception에 내용을 전달합니다.
        super(msg);
    }
}
