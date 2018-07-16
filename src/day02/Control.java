package day02;


import java.util.Scanner;

/*
    제어문 (분기문 or 조건문 or 비교문) - 이론자료 4장 p.8 ~ 10 참조

    1. if, if ~ else, if ~ else if
        - 가장 보편적이고, 특정부분 및 범위 지정 가능
 */
public class Control {

    public static void main(String[] args) {

        /*
            if(조건식) - 조건식 : true 또는 false 반환
            - 비교연산자, 논리연산자, 산술연산자 등 다양한 연산자가 조건식에 활용될수 있으며 최종적으로 반환되는
            true or false 값을 통해 실행이되고 안되고가 결정 됩니다.
         */

        // 조건식에는 true or false의 논리값이 들어갑니다.
        System.out.println("--- if만 활용 ---");
        if(true){
            System.out.println("항상 참 값");
            System.out.println();
        }

        if (false) {
            System.out.println("조건식이 거짓(false) 이므로 실행이 안됩니다!");
        }

        int a = 10;
        int b = 20;

        // 참인경우 (비교연산자활용)
        /*
            if ~ else구문
             - A 아니면 B
         */
        System.out.println("--- if ~ else 활용 ---");
        if (a > b){     // a가 b보다 크다면 다음 아래 문장을 실행
            // 문장에서 중괄호 {}는 블럭(영역)을 나타내며 단락이라고 생각하시면 됩니다.
            // 블럭은 실행이 이루어지는 범위를 뜻합니다. 스코프(범위)라고도 하며, 범위에 따라 실행이 어디까지 이루어져야하는지 정할 수 있습니다.
            System.out.println("a가 b보다 큽니다!! a = " + a + b);
        }
        else{           // 위 조건식 a > b 조건의 나머지 -> 즉 a <= b 인경우에 해당
            System.out.println("a가 b보다 크지 않습니다!! 즉 작거나 같습니다  b =  " + b);
        }

        // a=10
        // b=20
        if (a == b) {   // a와 b가 같습니다
            System.out.println("a와 b는 같다");
        } else {        // 나머지 경우는 -> ??
            System.out.println("a와 b는 다르다");
        }

        /*
            if ~ else if ~ else 구문
            - 위 문장은 A 아니면 B 즉 2가지경우로만 분류를 했습니다. 하지만 실제로는 더 많은 분기처리가 가능할 수 있습니다.
              그때 활용 되는 문장이 else if 문입니다.
         */
        System.out.println("--- if ~ else if ~ else 활용 ---");
        if (a == b) {
            System.out.println("a와 b는 같다");
        } else if (a > b) {     // 바로 위 문장에서 중간에 한번더 조건처리를 해줍니다.
            System.out.println("a는 b보다 크다");
        } else{     // 이것의 조건식은 -> ??
            System.out.println("a는 b보다 작다");
        }

        /*
            Scanner 클래스
            - 콘솔입력을 받아 반환해주는 역할을 주로 하는 표준 입력 클래스입니다.
            - 이 클래스를 활용하여 다양한 확인 작업 or 간단한 프로그래밍도 가능합니다.
         */
        System.out.println("--- 비교연산자와 논리연산자를 함께 활용 ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("두숫자를 입력해주세요 : ");
        a = scanner.nextInt();  // 입력된 값을 int형으로 변경하여 반환해줍니다. int형식이 아닌 다른 값을 입력한 경우 에러가 납니다. ex) 10.5, a, ab ...
        b = scanner.nextInt();


        System.out.print("문자열 입력 :");
        String input = scanner.next();  // 입력한 값을 문자열형식으로 변경하여 반환해줍니다.

        // 비교연산자와 논리연산자를 함께 활용
        if (a == b && "Hello".equals(input)) {
            System.out.println(input + " World");
        } else if (a == b || "Java".equals(input)) {
            System.out.println("자바에 오신걸 환영합니다!");
        } else {
            System.out.println("input : " + input);
        }


        // 비교연산자, 산술연산자, 논리연산자 활용
        if (a - 10 == b && (a > 10 || b > 10)) {
            System.out.println("a-10과 b가 같고, a가 10보다 크거나 b가 10보다 크다");
            System.out.println("먼저 조건판단이 필요한 경우는 ()를 통해 순서 제어를 합니다");
            System.out.println("기본적인 판단 순서는 왼쪽에서 오른쪽으로 조건판단을 하지만 ()인 경우는 먼저 판단을 하게 됩니다!");
        } else if ((a < 0 || b > 0) && (a - 10 <= b && b + a > 50)) {
            System.out.println("조건은 상황에 따라 만들기 나릅니다!");
        } else {
            System.out.println("위 2가지 외 나머지 전부를 여기에 기술합니다. 보통은 허용되지 않는 값을 처리할 때 쓰기도하고 정말 그외 나머지를 필요로할때 쓰기도 합니다!!");
        }

    }
}
