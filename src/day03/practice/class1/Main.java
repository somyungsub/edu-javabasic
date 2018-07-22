package day03.practice.class1;

import java.util.Scanner;

/*
    도형관련 객체 만들어보기
 */
public class Main {
    public static void main(String[] args) {
        /*
            연습해보기! (상속x)
            1. Rectangle 과 Triangle 객체를 생성하여
            2. 각 객체의 가로 세로의 길이를 입력받고 넓이 구하기.
            3. 가로세로의 길이는 Point 클래스에 정의하여 Rectangle과 Triangle 클래스에서 has a 관계(집합관계)를 맺어 활용합니다.
         */

        Scanner scanner = new Scanner(System.in);





        //  로직구현
        while (true) {
            System.out.print("1. 삼각형\t2. 사각형\t 이외(종료) : ");
            String select = scanner.next();

            // contains 메서드는 String 클래스의 메서드 입니다.
            // 내용은  A문자열.contains(B문자열)  -> B문자열이 A문자열에 포함되어 있으면 true 아니면 false
            if (!"1,2".contains(select)) {
                System.out.println("잘못 입력하여 프로그램을 종료합니다.");
                break;
            }

            System.out.print("가로 세로 입력 EX(10 20).. :  "); // 공백을 구분하여 x, y에 순차적으로 들어가집니다.
            Point point = new Point(scanner.nextInt(), scanner.nextInt());  // x, y 입력 받은 Point 클래스

            // 선택별 분기처리 -> 지금 같이 어떤 시점만 체크 할 때는 switch로도 가능
            if ("1".equals(select)) {
                // 삼각형  -> 메서드 체인을 이용 (이렇게 간단히 사용할 경우 활용 가능)
                System.out.println("삼각형의 넓이 : " + new Triangle(point).area());  // 객체 생성후 바로 area메서드 호출

            } else if ("2".equals(select)) {
                // 사각형  -> 일반적인 방식(1.선언 2.생성 및 초기화 3.사용)
                Rectangle rectangle = new Rectangle(point);
                System.out.println("사각형의 넓이 : " + rectangle.area());
            }
        }

    }
}
