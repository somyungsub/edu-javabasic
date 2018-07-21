package homework.day02.h4_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("크기를 입력하세요: ");
        int num = scanner.nextInt();
        int[][] arr = new int[num][num];
        int sum = 0;
        int temp = 0;

        // 숫자 초기화 1 ~ num * num 까지
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++)
                arr[i][j] = ++sum;
        }

        // 알고리즘 구현
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num / 2; j++) {

                // i는 0부터 시작하게 끔 했으므로 짝수행을 역순으로 재 배치 하기
                if (i % 2 == 1) {
                    // 스왑 -> 절반까지만 하면 되므로 j의 반복문 조건식은 num/2
                    temp = arr[i][j];
                    arr[i][j] = arr[i][num - j - 1];    // 인덱스는 0부터 시작하므로 -1 해줘야 에러가 발생하지 않음
                    arr[i][num - j - 1] = temp;
                }
            }
        }

        // 재 배열된 내용출력
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
