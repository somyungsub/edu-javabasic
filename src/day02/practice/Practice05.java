package day02.practice;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        /*
            소수판단하기
            ex) 100 입력 -> 100안에 있는 수중 소수인 수만 출력
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요->");
        int num1 = scanner.nextInt();




















        // 로직구현
        for (int i = 2; i <= num1; i++) {

            int temp = 0;
            for (int j = 2; j <= i; j++) {

                // 나누어서 떨어지는지를 판단하는 부분
                if (i % j == 0) {
                    temp = j;
                    break;
                }
            }

            // 자기자신과 맞는지를 판별 -> 최종 소수 판단
            if (temp == i) {
                System.out.println(temp);
            }

        }
    }
}
