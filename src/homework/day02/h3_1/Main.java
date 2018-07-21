package homework.day02.h3_1;

import java.util.Scanner;

/*
    약수, 최대공약수, 최소공배수 구하기
    - for문(반복문)을 이용하여 약수 판단
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
            1. 약수 구하기
         */
        System.out.println("숫자 입력 바람!!");
        int num = scanner.nextInt();    // 숫자입력 받기
        System.out.print("약수는 : ");
        for (int i = 1; i <=num; i++) {
            /*
                약수 : 나머지가 0인 수
                입력 받은 숫자 num을 1~num 까지 순차적으로 나누어 나머지가 0인경우 판단
              */
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }

        /*
            2. 최소공배수, 최대공약수 구하기
         */
        int gcd = 0;    // 최대공약수
        int lcm = 0;    // 최소공배수
        System.out.println("\n두가지 숫자의 최대공약수, 최소공배수 구하기");
        System.out.print("첫번째 숫자 입력: ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 숫자 입력: ");
        int num2 = scanner.nextInt();

        int temp1 = num1 > num2 ? num1 : num2;  // 큰수
        int temp2 = num1 > num2 ? num2 : num1;  // 작은수

        // 유클리드 호제법 : 최대공약수
        while (temp2 > 0) {
            gcd = temp1;
            temp1 = temp2;
            temp2 = gcd % temp2;
        }
        gcd = temp1;
        lcm = num1 * num2 / gcd; // 최소공배수

        System.out.println("최대공약수 : " + gcd);
        System.out.println("최소공배수 : " + lcm);


    }
}
