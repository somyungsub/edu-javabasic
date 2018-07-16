package day04.interface1;

import java.util.Scanner;

public class DaoTest {
    public static void main(String[] args) {

        Dao oracleDao = new PostgreDao();

//         OracleDb -> PostgreDb로 변경 요청!!
//        OracleDao oracleDao = new OracleDao();
//        PostgreDao oracleDao = new PostgreDao();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("작업 수행 명령 (종료:Q,q): ");
            String input = scanner.next();
            if ("q".equals(input.toLowerCase())) {
                break;
            }

            if ("insert".equals(input)) {
                oracleDao.insert();
            } else if ("delete".equals(input)) {
                oracleDao.delete();
            } else {
                System.out.println("해당작업이 없습니다~!!");
            }
        }
    }
}
