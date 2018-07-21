package homework.day02.h4_2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("크기를 입력하세요: ");
        int num = scanner.nextInt();
        int[][] arr = new int[num][num];
        int sum = 0;
        int temp;

        // 데이터 초기화 1 ~ num * num
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++)
                arr[j][i] = ++sum;  // 초기화 할 때 세로로 데이터를 순서대로 넣었습니다.
        }

        // 들어간 내용 주석풀어서 확인해보기
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num; j++) {
//                System.out.print(arr[i][j] + "\t");   // 출력할 때는 순서대로 i부터 시작
//            }
//            System.out.println();
//        }

        // 알고리즘 구현
        for (int i = 0; i < num; i++) { // i는 번째의 순서를 나타내게 끔 구현
            for (int j = 0; j < num / 2; j++) {
                // 마찬가지로 절반만 스왑하면 되므로 조건식은 num/2
                if (i % 2 == 1) {
                    temp = arr[j][i];   // j가 행이되고 i가 열이 됩니다.
                    arr[j][i] = arr[num - j - 1][i];
                    arr[num - j - 1][i] = temp;
                }
            }
        }

        // 재 배열된 내용 출력
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++)
                System.out.printf(arr[i][j] + "\t");
            System.out.print("\n");
        }
    }
}
