package day02;

/*
    연산자
    1. 산술연산자
    2. 비교연산자
    3. 대입연산자
    4. 증감연산자
    5. 논리연산자
    6. 3항연산자
 */
public class Operator {
    public static void main(String[] args) {
        /*
            산술연산자
         */
        int a = 10;
        int b = 20;
        System.out.println("---산술연산자----");
        System.out.println("a + b : " + a + b);    // 문자로 인식 -> a, b는 내부적으로 Integer로 변환 된후 toString이 호출됨
        System.out.println("a + b : " + (a + b));
        System.out.println("a - b : " + (a - b));
        System.out.println("a * b : " + (a * b));
        System.out.println("a /  b : " + (a / b));
        System.out.println("a % b : " + (a % b));
        System.out.println("------------");

        /*
            비교연산자
            -> true 또는 false 리턴
         */
        a = 10;
        b = 20;
        System.out.println("---비교연산자----");
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        /*
            증감연산자 주의사항 -> 전위, 후위
         */
        a = 10;
        b = 20;
        System.out.println("---증감연산자----");
        System.out.println(a++);    // 후위
        System.out.println(a);
        System.out.println(++b);    // 전위
        System.out.println(b);

        /*
            논리연산자
         */
        // and
        System.out.println("---논리연산자----");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);

        /*
            =, == 비교
         */
        a = 10;
        b = 20;
        System.out.println("---연산자 비교 및 대입 주의사항----");
        System.out.println(a == b);
        System.out.println(a=(b-5));
        System.out.println(a);

        /*
            3항연산자 연습
             - (조건식) ? (참인경우 실행) : (거짓인경우 실행)
         */
        a = 10;
        b = 20;
        System.out.println("---3항연산자----");
        System.out.println(a > b ? "a는 b보다 크다" : "a는 b보다 작다");
        System.out.println(a == b ? "a는 b와 같다" : "a는 b와 같지 않다");
        System.out.println(a < b ? "참" : "거짓");
    }

}
