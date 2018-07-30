package day05.exception;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
            이론 9장 전체 참조
            Exception(예외)의 핵심은 비정상종료(에러 or 버그성코드에 의한)를 알려주기 위해 Java에서
            지원하는 시스템이라 보시면 됩니다.

            - 예외의 종류에 따라 '이런 예외가 발생했으니 이거와 관련된 내용에 문제가 없는지 한번 조사해봐' 라고
              시스템이 프로그래머에게 알려주는 것이라 생각하시면 됩니다.

           이 개념을 숙지하시고 앞으로 찾아올 예외에 대해 대비하시면 될 것같습니다.
         */

        /*
            사용법 : try ~ catch ~ finally문을 사용해서 정상 흐름 실행영역(try)과 예외가 발생되면 실행되는영역(catch) 두영역을 분리하여
                     작성을 하시면 되고, finally는 생략 가능하지만, 예외가 발생해도 꼭 실행이 되어야 하는 경우 영역을 두어 작성합니다.

            자주 보시게 될 베스트 예외
             1. NullPointerException
              - 참조변수가 null 이거나 객체가 null 인데, 이변수와 객체를 참조하여 메서드를 실행하거나 어떤 작업을 하려고 하면
                예외가 발생하게 됩니다.

             2. ArrayIndexOutOfBoundsException
              - 보통 배열과 관련해서 size보다 큰 인덱스로 접근하려고 할때 발생합니다.
              - 예를들어 int[] a = new int[10]; 에 대해 0 ~ 9의 인덱스 접근만허용하기 때문에 a[10]등 10이상에 접근하면 발생합니다.

         */

        // 정상실행 흐름을 작성 하되, 여기에서 예외가 발생(버그나, 오류등) 할 수 있기 때문에 이처럼 try ~ catch문을 사용합니다.
        try {
            String s = new String("안녕하십니까");
            System.out.println(s.concat("안녕").concat("하세요"));
            System.out.println("변수s는 new 연산자를 통해 객체를 생성하여 Heap 메모리에서 주소 값을 가지고 있습니다");
            String s2 = null;
            s2.concat("aaa");   // 코드상에는 문법적 에러가 없으나  null객체를 참조하여 메서드를 이용하려고 하기때문에 시스템적 버그입니다. -> 예외발생대상
            System.out.println(s2.toString());
        } catch (Exception e) {
            System.out.println("----- 예외 실행 ------");
            // ex) Exception e = new NullPointerException (다형성)
            System.out.println("Exception은 예외에서 최상위라고 보시면 됩니다.");
            System.out.println("다형성 개념에 의해 Exception은 발생되는 모든 예외를 받을 수 있음을 의미합니다.");

            System.out.println("예외가 발생되면 Exception e로 매개변수를 받게 되며 매개변수 e로 이것저것 출력을 할 수 있습니다");

            // 대부분 이 메서드를 많이 사용하며 모든 에러 상황을 추적해줄 수 있도록 누적하여 콘솔에 출력해줍니다.
            e.printStackTrace();
        }
        finally {
            System.out.println("---- finally 문 ----");
            System.out.println("finally 문은 예외가 발생해도 실행되고 예외가 발생안되도 실행됩니다.");
            System.out.println("즉 예외와 상관없이 무조건 실행이 필요한 경우에 여기서 코드작성을 하면됩니다");
            System.out.println("또한 지금 문장은 필수가 아니고 선택이기 때문에 주석처리를 하셔도 문법적 에러가 발생하지 않습니다!");
        }




    }
}
