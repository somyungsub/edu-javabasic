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

            - 핵심내용은 디커플링
              : 기반이되는 개념은 다형성, 오버라이딩, 동적바인딩 입니다.
              : 이해하는데 다소 어려울 수 있지만, 간단히 중간 모듈이(인터페이스) 있어서
                사용할 때 사용에 따라 내용을 다르게 전달.

              사용자 <-> 인터페이스 <-> 모듈 의 아키텍쳐(구조)를 취해 중간에서 사용자와 핵심모듈의 다리역할을 해줍니다.
              이렇게 인터페이스를 매개로 객체간의 관계를 맺음으로써 수정사항이 발생시 수정에 대한 영향을 최소화 해줍니다.
              즉 모듈을 수정해달라하면 앞단의 사용자는 수정이 필요없고, 모듈만 수정해주면 됩니다. 이런방식을 취함으로써
              객체 간의 관계를 정확히하고 유지보수성을 높여 수정 및 코드의 간결성을 지향하게 되는 것 입니다.
         */

        /*
            인터페이스를 통해 작업된 내용
            - Dao 인터페이스(상위개념)를 통해 하위클래스에 따라 받아 나머지 로직을 그대로 수행을 함

            아키구조 : 사용자(DaoTest) <-> 인터페이스(Dao) <->모듈 (OracleDao, PostgreDao, ... )
         */
        Dao dao = new PostgreDao();

        /*
            아래는 인터페이스 없이 직접 생성하고 호출하여 작업하게 됩니다.
            위와 아래를 통해 다형성을 적용했을 때와 안했을 때 차이를 느끼셔야합니다.

            아키구조 : 사용자(DaoTest) <-> 모듈 (OracleDao, PostgreDao, ... )
         */
//         OracleDb -> PostgreDb로 변경 요청!!
//        OracleDao dao = new OracleDao();    // OracleDao 를 통한 작업
//        PostgreDao dao = new PostgreDao();  // PostgreDao를 통한 작업



        /*
            현재는 OracleDao를 사용하는 곳이 DaoTest 한군데이지만... 만약에 OracleDao를 사용하는데가 100군데라고 칩시다.
            OraclDao를 MysqlDao로 수정해달라느 요청이 왔을때... OracleDao를 생성하는 위치를 전부 바꿔야 겠죠..?
            그러면 적어도 100군데를 수정해야합니다.
            하지만 Dao인터페이스를 사용 하고 사용시점에 따라
         */




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
