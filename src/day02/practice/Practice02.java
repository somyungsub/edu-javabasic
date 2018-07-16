package day02.practice;

import java.util.Scanner;

public class Practice02 {

    public static void main(String[] args) {

        /*
            구구단 출력하기. (10분)
            1. 단수 (ex. 1, 2, ... n단) 입력
            2. 출력 수 입력
            3. 해당 단수까지 각 단수에 대한 출력수를 출력.

            ex) 5 5 입력시
            1 x 1 = 1, 1 x 2 = 2 ... , 1 x 5 = 5,
            2 x 1 = 2, 2 x 2 = 4 ... , 2 x 5 = 10,
            3 x 1 = 3, 3 x 2 = 6 ... , 3 x 5 = 15,
            4 x 1 = 4, 4 x 2 = 8 ... , 4 x 5 = 20,
            5 x 1 = 5, 5 x 2 = 10 ... , 5 x 5 = 25,
        */
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.print("단수 및 출력 수  입력 [Ex) 5 5, 종료 0 0] :  ");
            int dan = scanner.nextInt();
            int line = scanner.nextInt();
            // dan == 0, line == 0 -> 무한루프 탈출














            // 로직 구현
            if (dan == 0 && line == 0) {
                break;
            }
            for (int i = 1; i <= dan; i++) {
                for (int j = 1; j <= line; j++) {
                    System.out.print(i + " x " + j + " = " + (i * j) + ",\t");
                }
                System.out.println();
            }
        }

        System.out.println("프로그램을 종료합니다!!");
    }
}
