package day02.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice04 {

    public static void main(String[] args) {

        /*
            Up & Down 게임 (15분)

            1. 1~100 인 숫자 하나를 랜덤 생성.
            2. 숫자를 입력하여 맞추기.
               - 입력 숫자가 랜덤생성 숫자보다 높을 경우 Down, 그 반대는 Up

            3. 5회 제한이며, 10회 틀렸을시 프로그램 종료.
        */
        System.out.println("랜덤 수 생성 중...");
        Random random = new Random();               // 랜덤 수 발생
        Scanner scanner = new Scanner(System.in);   // 입력받기
        int randomNum = random.nextInt(100) + 1;    // 랜덤 수 생성

        // 로직 구현































        int failNum = 0;
        while (true) {
            System.out.print("수 입력 : ");
            int answer = scanner.nextInt();



            // 생성 수 > 입력 수
            if (randomNum > answer) {
                System.out.println("Up!!");
                failNum++;
            } else {
                // 생성 수 == 입력수
                if (answer == randomNum) {
                    System.out.println("정답입니다!!!");
                    System.out.print("Next(y/n)??");

                    if ("y".equals(scanner.next().trim().toLowerCase())) {

                        // 초기화 작업
                        randomNum = random.nextInt(100) + 1;    // 랜덤 수 생성
                        failNum = 0;
                        continue;
                    } else {
                        break;
                    }
                }
                // 생성 수 < 입력수
                else {
                    System.out.println("Down");
                    failNum++;
                }
            }

            if (failNum >= 10) {
                break;
            }
        }

        System.out.println("프로그램 종료!!");

    }
}
