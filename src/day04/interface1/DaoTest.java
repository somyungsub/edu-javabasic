package day04.interface1;

import java.util.Scanner;

public class DaoTest {
    public static void main(String[] args) {
        /*
            인터페이스
            - 이론자료 7장 p.8~13를 통해 기본개념을 숙지해주세요.
            - 추상클래스와 비슷하지만 차이점이 있습니다.
              추상클래스 : 클래스 기능 + 추상메서드, 다중상속 불가능
              인터페이스 : 추상메서드 집합, 다중 참조(다중 상속) 가능
         */

        /*
            인터페이스를 통해 작업된 내용
            - Dao 인터페이스(상위개념)를 통해 하위클래스에 따라 받아 나머지 로직을 그대로 수행을 함

            아키구조 : 사용자(DaoTest) <-> 인터페이스(Dao) <->모듈 (OracleDao, PostgreDao, ... )
         */
        Dao dao = new PostgreDao();

        /*
            아래는 인터페이스 없이 직접 생성하고 호출하여 작업하게 됩니다.
            인터페이스를 통한 다형성을 적용한 예입니다.
            아키구조 : 사용자(DaoTest) <-> 모듈 (OracleDao, PostgreDao, ... )
         */
//         OracleDb -> PostgreDb로 변경 요청!!
//        OracleDao dao = new OracleDao();    // OracleDao 를 통한 작업
//        PostgreDao dao = new PostgreDao();  // PostgreDao를 통한 작업


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("작업 수행 명령 (종료:Q,q): ");
            String input = scanner.next();
            if ("q".equals(input.toLowerCase())) {
                break;
            }

            if ("insert".equals(input)) {
                dao.insert();   // 인터페이스를 이용할 경우 -> 어떤개념이 적용될까요?? 동적바인딩 입니다!
            } else if ("delete".equals(input)) {
                dao.delete();   // 인터페이스를 이용할 경우 -> 어떤개념이 적용될까요?? 동적바인딩 입니다!
            } else {
                System.out.println("해당작업이 없습니다~!!");
            }
        }
    }
}
