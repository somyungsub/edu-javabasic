package homework.day03.h05;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        /*
            프로그램 실행 시 eclipse argument로 5~10까지의 정수형 데이터를 입력 받는다.
            5~10 이외의 정수형이 입력되면 “다시 입력하세요”라고 출력 한다.
            입력 받은 정수 값을 Calc class의 calculate()함수를 이용하여 1부터 입력 받은 숫자까지
            짝수만 더하는 프로그램을 작성 한다.
         */
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("입력 : ");
            int num = scanner.nextInt();
            if (num < 5 || num > 10) {
                System.out.println("다시 입력하세요!");
                continue;
            }
            System.out.println("결과 : " + new Calc().calculate(num));  // 메서드 체인을 이용하여 소스를 간결하게 함
            break;
        }
    }
}
