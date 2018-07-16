package day01;

/*
    자료형
    - Java는 다른 언어와는 달리 타입을 엄격하게 다루는 언어업니다.
      따라서 자료형이 어떤게 있는지 꼭 알아두시고 상황에 맞게 활용하실 줄 알아야합니다.

    - 다음 예문들을 통해서 이론자료와 함께 어떻게 쓰이는지 확인해보시기 바랍니다.
 */
public class Identifier {

    public static void main(String[] args) {

        /*
            데이터타입(자료형)은 그 타입별로 바이트크기가 정해져 있습니다.
            그 바이트 범위만큼 표현을 하여 활용해야하고 그 범위를 벗어나면 에러가 납니다.
            기본적으로 Tool에서 잡아주긴 하지만 잘못 사용하게 될 경우 시스템오류가 발생 할 수 있으므로
            꼭 숙지하시고, 이론자료를 참고해주세요!
         */
        /*
            byte -> 정수형 1바이트 = 8bit
         */
        byte b1 = 127;
        byte b2 = -128;
        byte b3 = 'a';
//        byte b4 = 128;    // 에러 범위 벗어남
        System.out.println("byte b1 : " + b1);
        System.out.println("byte b2 : " + b2);
        System.out.println("byte b3 : " + b3);  // 출력 예상해보기 -> ??

        /*
            short -> 정수형 2바이트
         */
        short s1 = 10000;
        short s2 = 100;
        short s3 = 'a';

//        short s33 = s1 + s2;  // 에러 : 자동으로 int로 내부적으로 변경되어 반환이 됨 -> 주석풀어보시면 확인가능
                                // int보다 작은 데이터형간의 연산결과 -> int로 자동변환
        int s4 = s1 + s2;

        System.out.println("short s1 : " + s1);
        System.out.println("short s2 : " + s2);
        System.out.println("short s3 : " + s3);     // 출력 예상해보기 -> ??
        System.out.println("short s4 : " + s4);

        /*
            int -> 정수형 4바이트
            - Java에서 정수형은 int가 기본이며 기본적으로 정수형은 int자료형을 사용합니다.
         */
        int i1 = 1000000000;
        int i2 = -1000000000;

        System.out.println("int i1 : " + i1);
        System.out.println("int i2 : " + i2);

        /*
            long -> 정수형 8바이트
            - L을표기하는 이유 : long형임을 명시
         */
        long l1 = 1243567890123456789L;
        long l2 = -10L;
        long l3 = 10;   // long이 int보다 크므로 int형인 10을 받을 수 있다. 따라서 L을 표기안하고 사용해도 가능

        System.out.println("long l1 : " + l1);
        System.out.println("long l2 : " + l2);
        System.out.println("long l3 : " + l3);

        /*
            float -> 실수형 4바이트
            - f를 표기하는 이유 : flaot형임을 명시
         */
        float f1 = 10.234567891012131415161718192021f; // 소수점 6자리까지 표현
        float f2 = 10.3f;

        /*
            아래 변수f3은 f를 표기안하면 에러가 납니다
            -> 이유 생각해보기
            힌트! f를 표기안하면 기본실수형인 double로 인지합니다. (이론자료 2장.p16 참조)
         */
//        float f3 = 10.5;
        System.out.println("float f1 : " + f1);     // 10.2345678에서 반올림 -> 10.234568
        System.out.println("float f2 : " + f2);


        /*
            double -> 실수형 8바이트 (기본)
            - Java에서 실수형 기본 타입
            - 실수형은 double 자료형을 기본으로 사용합니다.
         */
        double d1 = 105.1234567891012131415161718192021;    // 14자리 표현
        double d2 = 10.551;
        System.out.println("double d1 : " + d1);
        System.out.println("double d2 : " + d2);

        /*
            논리형 -> 1bit
         */
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("bool1 : " + bool1);
        System.out.println("bool2 : " + bool2);

        /*
            문자형 - > 2바이트 / C언어는 1바이트
             - 문자형 char은 한문자만을 표현하고 할당합니다.
             - 한글 : 2 바이트
             - 영문 : 1 바이트
         */
        char c1 = 'a';
        char c2 = 'b';
        char c3 = '남';
        char c4 = '자';
//        char c5 = '자 '; // 에러 : 한문자 이상할당 (공백도 문자입니다)
//        char c6 = "자";  // 에러 : 표현법오류 - ""는 문자열표기법입니다. 문자형인 char형에는 ''(홑따옴표)로 표기해야합니다
        System.out.println("char c1 : " + c1);
        System.out.println("char c2 : " + c2);
        System.out.println("char c3 : " + c3);
        System.out.println("char c4 : " + c4);

        /*
            아스키코드
            - 아스키코드란 : 간단히 부호(문자)체계를 정의한 1바이트 코드라 보시면됩니다
            - 참고 https://namu.wiki/w/%EC%95%84%EC%8A%A4%ED%82%A4%20%EC%BD%94%EB%93%9C - (ctrl + 왼쪽마우스클릭)
              : 그림에서는 DEC(10진수)와 Char(문자)부분을 봐주시고 나머지 내용은 한번 읽어보시면 도움되십니다.

            프로그래밍에서는 char형을 int형으로 / int형을 char형으로 변환이 가능.
             - 아스키코드 체계 때문.
            ex) 'a'는 십진수로 97에 정의되어 있음 : int형 표기시 97로 출력이 됨
            ex) 십진수 97는 'a'로 표기가능

            * 참고    : (자료형)값 표기는 형변환이라는 개념입니다. 이론자료 (2장 p.18~19 참조)
            * 형변환  : 데이터타입을 기본적으로 일치시켜야하는 Java에서 자료형을 일치시키지 않고 변환시켜서 활용을 할 수 있는 작업을 말합니다. - 이론자료 (2장 p.16~19) 참조
         */
        char c5 = 'a';
        int c6 = 97;
        System.out.println("아스키 c5 char형1 : " + c5);
        System.out.println("아스키 c5 char형2 : " + (int)c1);   // char -> int 형변환  출력 예상해보기 -> ??
        System.out.println("아스키 c6 int형1 : " + c6);
        System.out.println("아스키 c5 int형2 : " + (char)c6);   // int -> char 형변환  출력 예상해보기 -> ??

        /*
            char배열 -> 문자열
            - 배열은 2주차에 배울 내용이라 참고만 해주세요
         */
        char[] chars = new char[100];
        chars = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray();  // 문자열(String)을 문자배열로 변환해주는 메서드
        System.out.println("chars 열: " + chars);              // 문자열 출력 : aaa...
        System.out.println("chars 주소: " + chars.toString());   // 객체의 주소값 (Object의 toString호출 - 상속에서 자세히)
        /*
            String 클래스 -> 문자열
             - 기본적으로 Java에서 문자열 관련 활용할 때는 String타입을 활용합니다.
             - 문자열은 "" 더블쿼트로 표현
         */
        String ss = "남자";
        String ss2 = "ab";
//        String ss3 = 'aa';    // 에러 : 표기오류
        System.out.println("문자열 String ss  : " + ss);
        System.out.println("문자열 String ss2 : " + ss2);

        /*
            escape 문자 표기
            - 이론자료 2장 p.9 참조
            - 역슬러쉬는 (\) - 엔터키 위 달러표시
            - \\, \n, \t가 자주 쓰이는 편입니다
         */
        System.out.println("aaa \n" + "qqq\t\t\t\t\t\taaa\t");
        System.out.println("경로 지정 -> " + "C:\\abc\\bin");
        System.out.println("\\(역슬러쉬)는 그문자 그대로를 표현하기 위함");
        System.out.println("\"는 데이터\"\'");

        /*
            진수 표현
             - 10진수 : 1234
             - 8진수  : 030   [0(영)으로 시작]
             - 16진수 : 0xFA  [0(영)x로 시작]
         */
        System.out.println(1234);
        System.out.println(030);    // 24 (10진수로 변환)
        System.out.println(0xFF);   // 11111111 - 255
        System.out.println(0xf1);   // 소문자표기 가능241

        /*
            리터럴과 상수의 차이
             - 리터럴 : 데이터(메모리 위치안의 값)를 의미
             - 상수 :  변하지 않는 변수를 의미하며 (메모리 위치) 메모리 값을 변경할 수 없다. - final키워드

         */

        // "abc" 도 주소가 존재함.
        String ls = "abc";          // "abc" 를 객체 리터럴
        String ls2 = new String("abc");
        final String fs = "abc";    // "abc"
        final String fs2 = ls;      // "abc"

        /*
            == 비교연산자 : 객체의 주소를 비교
            equals 메서드 : 객체의 주소 안의 값을 비교
         */
        System.out.println("상수 리터럴1 : " + (ls == "abc"));
        System.out.println("상수 리터럴2 : " + (fs == "abc"));
        System.out.println("상수 리터럴3 : " + fs.equals("abc"));
        System.out.println("상수 리터럴4 : " + (fs == ls));
        System.out.println("상수 리터럴5 : " + fs.equals(ls));

        System.out.println("상수 리터럴1 : " + (ls == ls2));
        System.out.println("상수 리터럴2 : " + (ls.equals(ls2)));
        System.out.println("상수 리터럴3 : " + (fs == fs2));
        System.out.println("상수 리터럴4 : " + (fs == ls2));

    }
}
