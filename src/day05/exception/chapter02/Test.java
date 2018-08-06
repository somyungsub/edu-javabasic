package day05.exception.chapter02;

public class Test {

    // 예외를 발생시켜 사용자정의로 잡아서 처리하는 중
    public void test(int a, int b) throws BizException {
        if (a == 0) {
            // 프로그래머가 여기에서 버그나 에러가 발생 할 것 같은 경우 예상해서 작성
            throw new BizException("a가 0 인 경우 나눌 수 없습니다!");
        }
        System.out.println("정상출력 : " + (b / a));
    }
}
