package day02.practice;

import java.util.Scanner;

public class Practice03 {

    public static void main(String[] args) {

        /*
            학점출력 (5분)
            1. 점수를 입력 받아 학점 출력하기

            2. 100 ~ 90   : A
               89 ~ 80    : B
               79 ~ 70    : C
               69 ~ 60    : D
               60미만     : F

            3. 100초과 or 0미만(음수) 입력한 경우 프로그램 종료
        */

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("점수를 입력하세요 : ");
            int score = scanner.nextInt();












            // 로직 구현


            // 100 초과 0 미만인 수가 들어올 경우 반복문을 탈출하여 프로그램 종료
            if (score > 100 || score < 0) {
                break;
            }



            if (score >= 90 && score <= 100) {
                System.out.println("A학점 입니다.");
            }
            else if (score >= 80 && score < 90) {
                System.out.println("B학점 입니다.");
            }
            else if (score >= 70 && score < 80) {
                System.out.println("C학점 입니다.");
            } else if (score >= 60 && score < 70) {
                System.out.println("D학점 입니다.");
            } else {
                System.out.println("F학점 입니다.");
            }

        }

        System.out.println("프로그램을 종료 합니다.");
    }
}
