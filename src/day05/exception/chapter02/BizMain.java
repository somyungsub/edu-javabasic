package day05.exception.chapter02;

public class BizMain {
    public static void main(String[] args) throws BizException {
        int a = 0;
        int b = 10;

        /*
            예외던져서 사용하는 쪽에서 try ~ catch
            메서드에는 throws 키워드를 사용하여 해당 예외case 를 던짐
             - 현재는 main메서드에 throws 문이 사용됨
         */
        if (a == 0) {
            throw new BizException("예외 던지기 ! -> 여기에 예외가 발생할 수 있는 정보를 입력 : a가 0 인 경우는 나누면 안됩니다");
        }

        System.out.println("b / a = "+(b / a));
    }
}
