package homework.day02.h2_1;

import java.util.Random;
import java.util.Scanner;

/*
    2-1. 가위바위보 게임
    - switch, if 분기문 연습
 */
public class Main {
    public static void main(String[] args) {
        while (true){
            Random rand=new Random();
            Scanner num=new Scanner(System.in);

            System.out.println("가위바위보 Game!!!");
            System.out.println("주먹=0, 가위=1, 보=2");
            System.out.print("입력: ");

            int num1 = num.nextInt();
            int rand1 = rand.nextInt(3);

            switch(num1) {
                case 0:
                    System.out.println("내가 낸것 : 주먹");
                    break;
                case 1:
                    System.out.println("내가 낸것 : 가위");
                    break;
                case 2:
                    System.out.println("내가 낸것 : 보");
                    break;
                default:
                    System.out.println("잘못 입력하였습니다.");
                    return;
            }

            switch(rand1) {
                case 0:
                    System.out.println("computer : 주먹");
                    break;
                case 1:
                    System.out.println("computer : 가위");
                    break;
                case 2:
                    System.out.println("computer : 보");
                    break;
            }

            if (num1 == rand1) {
                System.out.println("비김!!!");
            } else if (num1 == 0 && rand1 == 1) {
                System.out.println("이김!!!");
            } else if (num1 == 1 && rand1 == 2) {
                System.out.println("이김!!!");
            } else if (num1 == 2 && rand1 == 0) {
                System.out.println("이김!!!");
            } else {
                System.out.println("졌음!!!");
            }

        }
    }
}
