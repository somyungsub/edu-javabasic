package homework.day02.h4_1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("크기를 입력하세요: ");
        int num1 = num.nextInt();
        int[] arr = new int[num1];

        System.out.println("배열생성중!!");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(50) + 1;
            while (true) {

                int count = 0;
                for (int j = 0; j <= i; j++) {

                    // 같은 값이 있으면 랜덤으로 재 생성하여 할당
                    if (arr[i] == arr[j] && i != j) {
                        arr[i] = rand.nextInt(50) + 1;
                    }
                }

                for (int j = 0; j < i; j++) {
                    // 중복된 값이 있는지 체크
                    if (arr[i] == arr[j])
                        count++;
                }

                // 중복된 값이 없는 경우 while문 (무한루프) 탈출
                if (count == 0)
                    break;
            }
        }
        System.out.println("생성완료");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

        System.out.println("\n최대값 최소값 구하기");

        // 초기화
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            // 최댓값 순환하면서 max에 최댓값을 저장   -> 최종적으로 가장 큰값이 저장됨
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            // 최솟값 순환하면서 min에 최솟값을 저장   -> 최종적으로 가장 작은값이 저장됨
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print("\n최솟값 : " + min + "  최댓값 : " + max);
    }
}
