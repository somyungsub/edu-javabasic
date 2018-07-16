package homework.day02.h3_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("1.왼쪽직삼각형 2.왼쪽역삼각형 3.오른쪽직삼각형 4.오른쪽역삼각형 5.피라미드 6.역피라미드 7.오른쪽피라미드 8.왼쪽피라미드 9.다이아몬드 10.나비");
        int select = num.nextInt();
        int i = 0, j = 0, k = 0, num1 = 0;
        switch (select) {
            case 1:
                System.out.print("라인 수를 입력하세요:");
                num1 = num.nextInt();
                for (i = 0; i <= num1; i++) {
                    for (j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                System.out.print("라인 수를 입력하세요:");
                num1 = num.nextInt();
                for (i = 1; i <= num1; i++) {
                    for (j = num1; j >= i; j--) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                System.out.print("라인 수를 입력하세요:");
                num1 = num.nextInt();
                for (i = 1; i <= num1; i++) {
                    for (j = i; j < num1; j++)
                        System.out.print(" ");
                    for (j = 1; j <= i; j++)
                        System.out.print("*");
                    System.out.print("\n");
                }
                break;
            case 4:
                System.out.print("라인 수를 입력하세요:");
                num1 = num.nextInt();
                for (i = 1; i <= num1; i++) {
                    for (j = 1; j < i; j++)
                        System.out.print(" ");
                    for (j = num1; j >= i; j--)
                        System.out.print("*");
                    System.out.print("\n");
                }
                break;
            case 5:
                System.out.print("라인 수를 입력하세요:");
                num1 = num.nextInt();
                for (i = 1; i <= num1; i++) {
                    for (j = i; j < num1; j++)
                        System.out.print(" ");
                    for (j = 1; j < 2 * i; j++)
                        System.out.print("*");
                    System.out.print("\n");
                }
                break;
            case 6:
                System.out.print("라인 수를 입력하세요:");
                num1 = num.nextInt();
                for (i = 1; i <= num1; i++) {
                    for (j = 1; j < i; j++)
                        System.out.print(" ");
                    for (j = 2 * num1; j >= 2 * i; j--)
                        System.out.print("*");
                    System.out.print("\n");
                }
                break;

            case 7:
                System.out.print("라인 수를 입력하세요(홀수만):");
                num1 = num.nextInt();
                for (i = 0; i < num1; i++) {
                    if (i <= num1 / 2) {
                        for (j = 0; j <= i; j++)
                            System.out.print("*");
                    } else {
                        for (j = i; j < num1; j++)
                            System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 8:
                System.out.print("라인 수를 입력하세요(홀수만):");
                num1 = num.nextInt();
                for (i = 0; i < num1; i++) {
                    if (i <= num1 / 2) {
                        for (j = num1 / 2; j > i; j--)
                            System.out.print(" ");
                        for (j = 0; j <= i; j++)
                            System.out.print("*");
                    } else {
                        for (j = num1 / 2; j < i; j++)
                            System.out.print(" ");
                        for (j = i; j < num1; j++)
                            System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 9:
                System.out.print("라인 수를 입력하세요(홀수만):");
                num1 = num.nextInt();
                for (i = 0; i < num1; i++) {
                    if (i <= num1 / 2) {
                        for (j = i; j < num1 / 2; j++)
                            System.out.print(" ");
                        for (j = 0; j <= 2 * i; j++)
                            System.out.print("*");
                    } else {
                        for (j = num1 / 2; j < i; j++)
                            System.out.print(" ");
                        for (j = 2 * num1 - 1; j > 2 * i; j--)
                            System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 10:
                System.out.print("라인 수를 입력하세요(홀수만):");
                num1 = num.nextInt();
                for (i = 0; i < num1; i++) {
                    if (i <= num1 / 2) {
                        for (j = 0; j <= i; j++)
                            System.out.print("*");
                        for (j = num1; j > 2 * (i + 1); j--)
                            System.out.print(" ");
                        if (i < num1 / 2) {
                            for (j = 0; j <= i; j++)
                                System.out.print("*");
                        } else {
                            for (j = 0; j < i; j++)
                                System.out.print("*");
                        }
                    } else {
                        for (j = i; j < num1; j++)
                            System.out.print("*");
                        for (j = num1; j < 2 * i; j++)
                            System.out.print(" ");
                        for (j = i; j < num1; j++)
                            System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;

        }

    }
}
