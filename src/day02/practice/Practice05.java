package day02.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice05 {

    public static void main(String[] args) {

        /*
            최대 최소 구하기. (15분), 추가(20분)

            1. 크기 값 입력
                - 크기값 만큼 1차원 배열생성
            2. 랜덤 수로 데이터 초기화 ( 500 이하 자연수 )
            3. 생성 된 수 출력
            4. 생성 된 수 중 최대 값, 최소 값 구하기

            5. 오름차순 정렬 (추가예제)
        */

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print(" 크기 값 입력 : ");
        int num = scanner.nextInt();

        // 로직 구현































        int[] numArr = new int[num];    // 입력된 수 만큼 배열 크기 생성

        // 데이터 초기화
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = random.nextInt(100) + 1;
        }

        // 생성된 데이터 출력
        System.out.println(" ----- 생성된 수 ----- ");
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
        System.out.println();

        // 최대 최소 구하기
        int max = 0;
        int min = 100;

        for (int i = 0; i < numArr.length; i++) {
            if (max < numArr[i]) {
                max = numArr[i];
            }
            if (min > numArr[i]) {
                min = numArr[i];
            }
        }
        System.out.println("최소 : " + min + ", 최대 : " + max);

        // 오름정렬
        for (int i = 0; i < numArr.length; i++) {
            for (int j = i; j < numArr.length; j++) {
                if (numArr[i] > numArr[j]) {
                    // 스왑
                    int temp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = temp;
                }
            }
        }
        System.out.println(" ----- 오름차순 정렬 -----");
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
    }
}
