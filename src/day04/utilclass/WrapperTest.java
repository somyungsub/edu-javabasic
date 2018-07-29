package day04.utilclass;

import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;


public class WrapperTest {
    public static void main(String[] args) {
        /*
            Wrapper 클래스 관련
            - Wrapper 클래스란 자바에서 지원하는 기본 자료형 8가지 (Byte, Short, char, int, long, float, double, boolean)
              를 클래스화(객체) 시켜 놓은 클래스들 이라고 보시면 됩니다.
            - 이론자료 8장 p.10 ~ 12 참조
         */

        /*
            아래 처럼 상호간 데이터 처리가 가능

            byte -> Byte클래스로 / Byte클래스 -> byte로 상호 교환이 가능함
            이렇게 Wrapper 클래스가 있는 이유는 Java는 모든 자료형을 Object(객체)로 가지고 놀기 때문입니다.
            다양한 클래스들이 존재하고있고, 이런 기본타입 자료형은 클래스가 아니기 때문에 다루기 쉽지 않은 부분을
            Wrapper클래스를 통해 다뤄야 할 때가 있기 때문에 있다고 보시면 됩니다.

            ex) 제네닉스는 5주차에 있지만 제네닉스는 객체만 받는데 int형 처럼 기본타입은 지정을 할 수 없습니다. 대신 Integer로 대체가 가능합니다.
         */

        byte b = 10;
        Byte byteClass = new Byte(b);   // 오토박싱 (기본형 -> 클래스 형변환)    이론자료 8장 p.12참조

        Byte byteClass2 = b;
        byte b2 = byteClass;            // 오토언박싱 (클래스 -> 기본형 형변환)

        System.out.println("Byte 클래스 : " + byteClass);
        System.out.println("Byte 클래스2 : " + byteClass2);
        System.out.println("Byte 클래스3 : " + (byteClass2 - byteClass));
        System.out.println("byte 기본자료형 : " + b);
        System.out.println("byte 기본자료형2 : " + b2);
        System.out.println("byte 기본자료형3 : " + (b2 - b));

        // 각 Wrapper 클래스 메서드 활용하기
        System.out.println("-- 다른 타입으로 변경하는 메서드 --");
        System.out.println(byteClass.byteValue());
        System.out.println(byteClass.intValue());
        System.out.println(byteClass.longValue());
        System.out.println(byteClass.doubleValue());
        System.out.println(byteClass.floatValue());


        System.out.println("static 메서드 활용");
        System.out.println(Integer.parseInt("10")); // int 반환       문자열을 숫자로 바꿔서 계산해야하거나 로직처리를 해야할때 많이 쓰임
        System.out.println(Integer.valueOf("10"));      // Integer 반환

        System.out.println(Double.parseDouble("10.22"));
        System.out.println(Double.valueOf("10.25"));

        System.out.println("--- 최대최소 ---");
        System.out.println(Double.max(10.2, 20)); // 숫자 2개만 비교 할 경우 활용 가능
        System.out.println(Double.min(10.01, 20));

        System.out.println(Integer.max(10, 20));

        // Character 클래스는 주로 문자열과 알고리즘을 구현해야할 때 가끔 쓰일 수 있으니 알아둡시다.
        System.out.println("---- Character 클래스 ----");
        System.out.println("숫자판단 메서드 : " + Character.isDigit('c'));
        System.out.println("숫자판단 메서드 : " + Character.isDigit('1'));
        System.out.println("알파벳판단 메서드 : " + Character.isAlphabetic('a'));
        System.out.println("알파벳판단 메서드 : " + Character.isAlphabetic('1'));
        System.out.println("대문자판단 메서드 : " + Character.isUpperCase('c'));
        System.out.println("대문자판단 메서드 : " + Character.isUpperCase('C'));
    }
}
