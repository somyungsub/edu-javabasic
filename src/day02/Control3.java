package day02;


import java.util.Scanner;

public class Control3 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);   // 콘솔입력을 받아주는 클래스 (사용자 입력가능)
        System.out.print("문자열 입력 :");
        String input = scanner.nextLine();
        /*
            중첩 분기분
            - 분기문안에 또 분기문을 넣어서 제어할 수 있습니다. 2중 3중 4중 ... 가능합니다. 코딩 및 처리하기 나름입니다
         */
        int a = 10;
        int b = 20;
        if ("Hello".equals(input)) {
            if (a == b) {
                System.out.println("Hello 이면서 a와 b는 같다");
            } else {
                System.out.println("Hello 이지만 a와 b는 다르다");
            }
        } else {
            System.out.println("Hello가 아닙니다!");
        }
    }
}
