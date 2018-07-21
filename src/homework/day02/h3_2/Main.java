package homework.day02.h3_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = scanner.nextInt();


        for (int i = 2; i <= num; i++) {
            int temp = 0;   // j의 위치를 담는 임의 변수
            for (int j = 2; j <= i; j++) {
                // 나누어 떨어지는 j의 값을 확인
                if (i % j == 0) {
                    temp = j;
                    break;
                }
            }

            // 소수 판별 -> i와 j(temp)의 마지막숫자를 판별
            if (i == temp) {
                System.out.println(i + "단 구구단 입니다");
                for (int j = 1; j < 10; j++) {
                    System.out.print(i + "x" + j + "=" + (i * j) + "\t");
                }
                System.out.println();
            }


        }

    }
}
