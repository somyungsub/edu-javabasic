package day05.exception.chapter02;

public class BizMain2 {
    public static void main(String[] args) {

        /*
            어떤 클래스를 사용할 때 작성된 메서드(현재는 test메서드)에 throws를 통해 예외를 던지면
            사용하는 쪽에서 예외를 받아서 처리 해줘야합니다.
         */
        Test t = new Test();

        // 여기서는 try ~ catch 문을 사용하여 test호출 시 던진 예외를 받아서 처리함.
        // 여기서 또 throws문을 통해 main메서드를 통해 던질 수 있습니다.
        try {
            t.test(10, 20); // 정상   : 2
            t.test(5, 20);  // 정상   : 4
            t.test(0, 20);  // 예외발생
        } catch (BizException e) {
            e.printStackTrace();    // 여기서 예외발생시 처리 문
        }

    }
}
