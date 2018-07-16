package day02;


import java.util.Scanner;

/*
    제어문 (분기문 or 조건문 or 비교문) - 4장 p.11 내용참조

    2. switch (정수, 정수식, 문자열 - v1.7이상)
        - 가독성은 좋지만, 특정 지정만 가능함, 범위지정이 불가능
 */
public class Control2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // 콘솔입력을 받아주는 클래스 (사용자 입력가능)
        System.out.println("문자열입력 테스트");
        System.out.print("문자열 입력 :");
        String input = scanner.next();

        /*
            switch (정수, 정수식, 문자열, Enum)
            - break문을 사용해야 해당 case 영역을 실행하고 빠져나옵니다.
            - break문을 만난경우 해당 영역을 빠져나오라는 의미입니다. (switch와 반복문에서 활용되며 빠져나오는범위는 switch와 반복문 영역에 해당됩니다)
         */
        switch (input) {
            case "Java":
                System.out.println("자바입니다");
                System.out.println("자바입니다");
                System.out.println("자바입니다");
                System.out.println("자바입니다");
                break;
            case "Hello":
                System.out.println("Hello를 입력했습니다!! " + input);
                break;
            case "ABC":
                System.out.println("ABC를 입력했습니다!! " + input);
                break;
            default:
                System.out.println("case에 정의 안한 값을 입력했습니다!! default는 앞의 case에 해당하는 값 외 나머지에 해당합니다! 보통은 예외처리 할 때 활용되기도 합니다! 입력값 : " + input);
                break;
        }

        /*
            break 를 안하는경우
            - break문을 만날 때까지 실행됩니다!
            ex) input : a -> 출력예상해보기
            ex) input : b -> 출력예상해보기
            ex) input : A -> ??
            ex) input : B -> ??
            ex) input : 위 4개 이외
         */
        System.out.print("문자열 입력2 :");
        input = scanner.next();
        switch (input) {
            case "a":
                System.out.println("a");
            case "b":
                System.out.println("b");
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
        }

        // 정수
        System.out.println("정수입력 테스트!");
        int num = scanner.nextInt();
        switch (num) {  // num 대신 정수식 가능 num-10, num*2 등등... (정수식은 결국 계산된 정수 값을 반환하기 떄문입니다.)
            case 50:
                System.out.println("F");
                break;
            case 60:
                System.out.println("D");
                break;
        }
    }
}
