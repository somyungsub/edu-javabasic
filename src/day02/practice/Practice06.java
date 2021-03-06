package day02.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice06 {

    public static void main(String[] args) {

        /*
            최대 최소 구하기. (15분)

            1. 크기 값 입력
                - 크기값 만큼 1차원 배열생성
            2. 랜덤 수로 데이터 초기화 ( 100 이하 자연수 )
            3. 생성 된 수 출력
            4. 생성 된 수 중 최대 값, 최소 값 구하기

            추가(10분)
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

            // random.nextInt(숫자)를 통해 랜덤수를 발생시킬 수 있게해줍니다.
            numArr[i] = random.nextInt(100) + 1;    // 0~99가 랜덤으로 발생 여기에 +1 하므로 -> 1~100숫자가 랜덤발생
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

        /*
            오름차순정렬하기 -> 가장기본적인 정렬 알고리즘 (선택정렬알고리즘)
             - 선택정렬 : 각 회차별로 가장 작은 값의 위치를 찾아 현재 값과 가장작은 위치의 값과 바꾸면서 정렬해 나가는 정렬입니다
         */
        for (int i = 0; i < numArr.length-1; i++) {
            int idx = i;
            for (int j = i+1; j < numArr.length; j++) {
                if (numArr[idx] >= numArr[j]) {
                    idx = j;
                }
            }
            // 스왑 (위치 바꾸기!)
            int temp = numArr[i];
            numArr[i] = numArr[idx];
            numArr[idx] = temp;
        }

        System.out.println(" ----- 오름차순 정렬 확인 -----");
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
    }
}
