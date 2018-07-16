package homework.day02.h2_2;

import java.util.Scanner;

/*
    2-2. 자판기
    - switch, if 분기문 연습
 */
public class Main {
    public static void main(String[] args)
    {

        Scanner num=new Scanner(System.in);
        int coke = 800;
        int orange = 600;
        int americano = 1500;
        int cider = 700;
        int lemonade = 900;

        System.out.println("자판기 Total Menu!!!");
        System.out.println("1.Coke : 800원");
        System.out.println("2.Orange juice : 600원");
        System.out.println("3.Americano : 1500원");
        System.out.println("4.Cider : 700원");
        System.out.println("5.Lemonade : 900원");

        System.out.println("돈 투입 바람!!");
        int num1=num.nextInt();

        if(num1<orange)
        {
            System.out.println("돈부족 재투입바람");
            int num2=num.nextInt();
            num1+=num2;
            System.out.println("투입한돈:"+num1);
        }
        else if(num1>=orange && num1<cider)
        {
            System.out.println("Select 기본메뉴!!!");
            System.out.println("2.Orange juice : 600원");
            System.out.println("투입한돈:"+num1);
        }
        else if(num1>=cider && num1<coke)
        {
            System.out.println("Select 기본메뉴!!!");
            System.out.println("2.Orange juice : 600원");
            System.out.println("4.Cider : 700원");
            System.out.println("투입한돈:"+num1);
        }
        else if(num1>=coke && num1<lemonade)
        {
            System.out.println("Select 기본메뉴!!!");
            System.out.println("1.Coke : 800원");
            System.out.println("2.Orange juice : 600원");
            System.out.println("4.Cider : 700원");
            System.out.println("투입한돈:"+num1);
        }
        else if(num1>=lemonade && num1<americano)
        {
            System.out.println("Select 기본메뉴!!!");
            System.out.println("1.Coke : 800원");
            System.out.println("2.Orange juice : 600원");
            System.out.println("4.Cider : 700원");
            System.out.println("5.Lemonade : 900원");
            System.out.println("투입한돈:"+num1);
        }

        else if(num1>=americano)
        {
            System.out.println("Select 기본메뉴!!!");
            System.out.println("1.Coke : 800원");
            System.out.println("2.Orange juice : 600원");
            System.out.println("3.Americano : 1500원");
            System.out.println("4.Cider : 700원");
            System.out.println("5.Lemonade : 900원");
            System.out.println("투입한돈:"+num1);
        }


        int select=num.nextInt();
        int money = 0;
        switch(select)
        {
            case 1:
                money=800;
                if(num1>=800)
                {
                    int result=num1-money;
                    System.out.println("잔돈은"+result+"원 입니다.");
                }
                else
                {
                    System.out.println("잘못된 입력입니다.");
                    System.out.println("잔돈은"+num1+"원 입니다.");
                }
                break;
            case 2:
                money=600;
                if(num1>=600)
                {
                    int result=num1-money;
                    System.out.println("잔돈은"+result+"원 입니다.");
                }
                else
                {
                    System.out.println("잘못된 입력입니다.");
                    System.out.println("잔돈은"+num1+"원 입니다.");
                }
                break;
            case 3:
                money=1500;
                if(num1>=1500)
                {
                    int result=num1-money;
                    System.out.println("잔돈은"+result+"원 입니다.");
                }
                else
                {
                    System.out.println("잘못된 입력입니다.");
                    System.out.println("잔돈은"+num1+"원 입니다.");
                }
                break;
            case 4:
                money=700;
                if(num1>=700)
                {
                    int result=num1-money;
                    System.out.println("잔돈은"+result+"원 입니다.");
                }
                else
                {
                    System.out.println("잘못된 입력입니다.");
                    System.out.println("잔돈은"+num1+"원 입니다.");
                }
                break;
            case 5:
                money=900;
                if(num1>900)
                {
                    int result=num1-money;
                    System.out.println("잔돈은"+result+"원 입니다.");
                }
                else
                {
                    System.out.println("잘못된 입력입니다.");
                    System.out.println("잔돈은"+num1+"원 입니다.");
                }
                break;
            default:
                System.out.println("잘못 입력하였습니다.");
                break;
        }

    }
}
