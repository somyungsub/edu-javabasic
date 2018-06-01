package day02;


import java.util.Scanner;

/*
    제어문
    1. if, if ~ else, if ~ else if
    2. switch (정수, 정수식, 문자열 - v1.7이상)
 */
public class Control {

    public static void main(String[] args) {

        /*
            if(조건식) - 조건식 : true 또는 false 반환 -> 비교연산자
         */
        if(true){
            // 실행문
            System.out.println("항상 참 값");
        }

        int a = 10;
        int b = 20;

        if (a == b) {
            System.out.println("a와 b는 같다");
        } else {
            System.out.println("a와 b는 다르다");
        }


        if (a == b) {
            System.out.println("a와 b는 같다");
        } else if (a > b) {
            System.out.println("a는 b보다 크다");
        } else{
            System.out.println("a는 b보다 작다");
        }

        ////////////////////////////////////////////////////
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 :");
        String input = scanner.nextLine();
//        a = 10;
//        b = 10;
        if (a == b && "Hello".equals(input)) {
            System.out.println(input + " World");
        } else if (a == b || "Java".equals(input)) {
            System.out.println("자바에 오신걸 환영합니다!");
        } else {
            System.out.println("input : " + input);
        }


        /*
            switch (정수, 정수식, 문자열, Enum)
         */
        switch (input) {
            case "Java":
                System.out.println("자바입니다");
                System.out.println("자바입니다");
                System.out.println("자바입니다");
                System.out.println("자바입니다");
                break;
            case "Hello":
                break;
            case "ABC":
                break;
            default:
                break;
        }

        /*
            break 를 안하는경우
         */
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






    }
}
