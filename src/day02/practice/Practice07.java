package day02.practice;

import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        /*
            10분

            입력 ex) 과목입력 : 영어  / 점수 입력 : 100 ...
            출력 ex) 영어 : 100  / 수학 : 85 ...
            1. 합산점수
            2. 평균점수
            3. 랭킹 출력
         */
        Scanner scanner = new Scanner(System.in);
        int size = 3;
        int[] numArr = new int[size];       // 과목점수
        String[] sArr = new String[size];   // 과목

        // 입력작업
        for (int i = 0; i < size; i++) {
            System.out.println((i+1)+"번째 과목을 입력해주세요!");
            sArr[i] = scanner.next();
            System.out.println((i+1)+"번째 점수를 입력해주세요!");
            numArr[i] = scanner.nextInt();
        }

        // 출력
        System.out.println("******* 입력된 내용 출력 *******");
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(sArr[i] + " : " + numArr[i]);
        }

        // 합산점수 출력
        System.out.println("******* 합계 점수 출력 *******");
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        System.out.println(sum);

        // 평균점수 출력
        System.out.println("******* 평균 점수 출력 *******");
        double avg = sum;
        System.out.println(avg/size);
    }
}
