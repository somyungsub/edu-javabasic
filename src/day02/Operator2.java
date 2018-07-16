package day02;

/*
    많이 활용되지는 않는 연산자 (3장 p.4참조)
    1. 쉬프트연산자
      - 코드 분석시, 직관적이지 않고, 다른 연산자로 대체가 가능하기도 하기 때문.

    2. 비트연산자
      - 거의 사용되지 않습니다.
 */
public class Operator2 {
    public static void main(String[] args) {

        /*
            1. 쉬프트연산자
             - 비트를 왼쪽 or 오른쪽으로 이동시키는 연산자를 말합니다.
         */
        int a = 20;
        int b = 30;
        // 이동후 비어 있는 비트는 0으로 채움
        System.out.println("--- 왼쪽 쉬프트 연산자 ---");
        System.out.println(a << 1);
        System.out.println(a << 2);
        System.out.println(a << 3);

        // 이동후 비어 있는 비트는 음수 경우 1로, 양수 0으로 채움
        System.out.println("--- 오른쪽 쉬프트 연산자 ---");
        System.out.println(a >> 1);
        System.out.println(a >> 2);
        System.out.println(a >> 3);

        // 이동후 비어 있는 비트는 음양 상관 없이 0으로 채움
        System.out.println("--- 오른쪽 쉬프트 연산자 ---");
        System.out.println(a >>> 1);
        System.out.println(a >>> 2);
        System.out.println(a >>> 3);


        /*
            2. 비트연산자
             - &, |, ^, ~
             - 데이터가 이진수로 표현이 될 때 비트에 적용이 되는 연산입니다.
         */
        String s1 = new String("안녕");
        String s2 = new String("하세요");
        a = 12;     // 1100
        b = 15;     // 1111
        System.out.println("--- 비트연산자 ---");
        System.out.println("아래 주석문은 앞의 비트가 생략되고 맨뒤의 4비트만 표시했습니다. 실제로는 a는 000000~~~~~~1100 이에요");
        System.out.println(a & b);  // 1100
        System.out.println(a | b);  // 1111
        System.out.println(a ^ b);  // 0011
        System.out.println(~a);     // 11111..... 0011 -> 음수인 이유는??
        System.out.println(~b);     // 11111..... 0000 -> 음수인 이유는??

        // 음수인 이유? 참고 : https://ko.wikipedia.org/wiki/2%EC%9D%98_%EB%B3%B4%EC%88%98 (ctrl + 왼쪽마우스 : 페이지이동)
        System.out.println("컴퓨터과학의 내용 중 2의보수라는 내용을 아셔야합니다. 해당과정에서는 설명하기가 힘든점 양해바랍니다. 간단히 설명하면 뺄셈을 빠르게 계산하기 위한 컴퓨터세계의 방식이라 이해하시면 됩니다.");
        System.out.println("기본적으로 컴퓨터는 뺄셈이 없습니다. 모든 연산이 덧셈계산이에요. 더하기 밖에 할줄 모릅니다. 빼기를 빠르게 덧셈계산하기 나온 방식이 2의보수 체계입니다. 해당내용은 전공과목 내용 중 컴퓨터구조론 쪽을 공부하셔야 하며 비트연산 관련해서는 디지털논리회로를 보셔야합니다.");
    }
}
