package day02.practice;

import java.util.Scanner;

public class Practice01 {

    public static void main(String[] args) {

        /*
            간단한 계산기 만들기.
             1. 두수와 산술연산자를 입력.

             2. 입력된 산술연산자 더하기(+), 빼기(-), 곱하기(*), 나누기(/), 나머지(%)
                : 산술연산자는 +, -, *, /, % 로 제한

             3. 두수와 산술 연산자에 따라 결과값을 출력.
        */
        System.out.println("두수와 연산자를 입력해줏요. (Ex : 5 5 +, 10 2 -)");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double result = 0;
        String oper = scanner.next();
        /*
            연산자에 따른 처리로직을 구현하세요. (총 10분)
            1. if문
            2. switch 문
         */


























        if ("+".equals(oper)) {
            result = num1 + num2;
        }
        else if("-".equals(oper)) {
            result = num1 - num2;
        }
        else if("*".equals(oper)) {
            result = num1 * num2;
        }
        else if("/".equals(oper)) {
            result = num1 / num2;
        }
        else if("%".equals(oper)) {
            result = num1 % num2;
        }
        else {
            System.out.println("연산자를 잘못 입력하였습니다.");
        }
        System.out.println("결과값 : " + result);
    }
}
