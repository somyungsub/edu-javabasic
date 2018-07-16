package day02;

/*
    연산자
    1. 산술연산자
    2. 대입연산자
    3. 비교연산자
    4. 논리연산자
    5. 증감연산자
    6. 3항연산자
 */
public class Operator {
    public static void main(String[] args) {
        /*
            1. 산술연산자
                - 3장 p.5 이론내용 참조
         */
        int a = 10;
        int b = 20;
        System.out.println("---산술연산자----");
        System.out.println("a + b : " + (a + b));       // 더하기
        System.out.println("a + b : " + a + b);         // 출력예상해보기 -> ??    이유 : 문자열에서 + 연산을 이어서 사용하게 되면 데이터를 문자로 인식
        //                              -> a, b는 내부적으로 Integer객체로 변환 된후 toString이 호출됨)

        System.out.println("a + b : " + 10.5 + 20.2);   // 출력예상해보기 -> ??    동일이유
        System.out.println("a + b : " + (10.5 + 20.2)); // + 연산에서는 문자열과 숫자형이 엮일경우 ()를 적절히 사용해주는게 좋습니다!

        System.out.println("a - b : " + (a - b));   // 빼기
        System.out.println("a * b : " + (a * b));   // 곱하기
        System.out.println("a /  b : " + (a / b));  // 나누기  출력예상해보기 -> 10/20 ??
        System.out.println("a % b : " + (a % b));   // 나머지

        // 회색글씨는 툴에서 지원해주는 부분이니 무시하시면됩니다. 회색글씨 original은 메서드에서 정의한 매개변수명을 뜻합니다.
        String s1 = new String("Java를");
        String s2 = new String("자바라~");
        System.out.println("문자열 더하기 : " + s1 + s2); // 출력예상해보기 -> ?? / 산술연산자 + 에 대해 문자열 관점에서 생각해보기!!
        System.out.println("------------");


        /*
            2. 대입연산자
                - 3장 p.6 이론내용 참조
                - 산술연산자와 대입연산자(=)의 조합 활용 가능 (-=, +=, *=, /=, %=) : 조합시에는 연산자끼리 띄워쓰기를 하면 안되고 붙여서 사용해야합니다!
         */

        // 값 할당
        a = 10;
        System.out.println("a = : " + a);       // 10

        // a = a + 15와 동일 : a + 15를 한 후 a에 다시 저장합니다.
        a += 15;
        System.out.println("a += 15 : " + a);   // 25

        // a = a - 10와 동일 : a - 10을 한 후 a에 다시 저장합니다.
        a -= 10;
        System.out.println("a -= 10 : " + a);   // 15

        // a = a * 2 와 동일 : a * 2을 한 후 a에 다시 저장합니다.
        a *= 2;
        System.out.println("a *= 2 : " + a);   // 30

        // a = a / 2 와 동일 : a / 2을 한 후 a에 다시 저장합니다.
        a /= 2;
        System.out.println("a /= 2 : " + a);   // 15

        // a = a % 2 와 동일 : a % 2을 한 후 a에 다시 저장합니다.
        a %= 2;
        System.out.println("a %= 2 : " + a);   // 1

        /*
            =, == 차이
         */
        a = 10;
        b = 20;
        System.out.println("---비교연산자  및 대입연산자 주의사항----");
        System.out.println(a == b);     // 반환값은 -> ??
        System.out.println(a = (b - 5));    // 연산순서 및 출력예상해보기 -> ??
        System.out.println(a);


        /*
            3. 비교연산자
             - 3장 p.7 이론내용 참조
             - true 또는 false 리턴
             - 종류 : >, >=, <, <=, ==, !=
         */
        a = 10;
        b = 20;
        System.out.println("---비교연산자----");
        System.out.println("a > b  : " + (a > b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a < b :" + (a < b));
        System.out.println("a <= b :" + (a <= b));
        System.out.println("a == b : " + (a == b)); // 같다
        System.out.println("a != b : " + (a != b)); // 같지 않다

        // 산술연산과 비교연산 혼합사용 -> 혼합시 연산순서 중요!! 순서가 먼저 진행되어야 할 경우 연산순위가 가장 큰 ()를 쓰는 습관을 갖어야 함!
        System.out.println("a + 10 == b : " + (a + 10 == b));   // 산술연산순서가 더 크므로 순차적으로 진행이 되므로 원하는 결과가 나옵니다! (true)
        System.out.println("a + 10 == b : " + ((a + 10) == b)); // 위와 동일! ()를 통해 순서를 확실히 함. 혼합해서 사용할 경우 연산순서를 다외우기는 쉽지 않으므로 ()를 사용하기를 권장합니다

        /*
            4. 논리연산자
             - 3장 p.8 이론내용 참조
             - 주어진 조건의 항들의 값이 true or false 값을 조합하여 true or false를 반환
                ex) true && true -> true
                ex) true || false -> true

            AND : 한개라도 false가 있으면 false, 전부 true여야 true
            OR  : 한개라도 true가 있으면 true, 전부 false여야 false
            NOT : true -> false로 / false -> true로

            논리연산자의 특징은 조건문에서 중요하고 아주 빈도가 높게 활용 됩니다. 꼭 특징을 숙지하시기 바랍니다.
         */
        // and
        System.out.println("--- 논리연산자 AND 2개 ----");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("--- 논리연산자 AND 2개 이상 예상해보기----");
        System.out.println(true && true && true);
        System.out.println(true && true && false);
        System.out.println(true && false && true);
        System.out.println(true && true && true && false);

        // or
        System.out.println("--- 논리연산자 OR 2개 ----");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("--- 논리연산자 OR 2개 이상 예상해보기 ----");
        System.out.println(true || true || true);
        System.out.println(true || false || true);
        System.out.println(false || true || false);
        System.out.println(false || false || false);

        // not
        System.out.println("--- 논리연산자 NOT ----");
        System.out.println(!true);
        System.out.println(!(true || true));
        System.out.println(!true || !false);
        System.out.println(false || !true);
        System.out.println(false || false);

        // not의 수학적 활용
        a = 10;
        System.out.println(a > 5 && a < 20);        // 5 < a < 20
        System.out.println(!(a > 5 && a < 20));     // a < 5 or a > 20

        /*
            5. 증감연산자 주의사항
             - 3장 p.9 이론내용 참조
             - 전위, 후위에 따라 연산되는 순서가 달라지거, 빈번히 사용 되므로 꼭  숙지하시기 바랍니다.

             전위
              - ++ or --가 변수 앞에 존재 : 변수 값을 먼저 증가 or 감소 시킴

             후위
              - ++ or --가 변수 뒤에 존재 : 다음 문장에서 변수 값을 증가 or 감소 시킴
         */

        a = 10;
        b = 20;
        System.out.println("---증감연산자----");
        System.out.println(a++);    // 후위
        System.out.println(a);
        System.out.println(++b);    // 전위
        System.out.println(b);

        a = 10;
        b = 20;
        System.out.println(a--);    // 후위
        System.out.println(a);
        System.out.println(--b);    // 전위
        System.out.println(b);


        /*
            6. 3항연산자 연습
             - (조건식) ? (참인 경우 실행) : (거짓인 경우 실행)
             - 조건식은 true or false를 반환합니다. 반환되는 논리에 따라 실행되는 문장이 달라집니다.
         */
        a = 10;
        b = 20;
        System.out.println("---3항연산자----");
        System.out.println(a > b
                ? "a는 b보다 크다"
                : "a는 b보다 작다");
        System.out.println(a == b ? "a는 b와 같다" : "a는 b와 같지 않다");
        System.out.println(a < b ? "참" : "거짓");
        System.out.println(a * 12 < b + 100 ? "참" : "거짓");
    }

}
