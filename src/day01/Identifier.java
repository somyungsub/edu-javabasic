package day01;

import java.text.NumberFormat;

public class Identifier {

    public static void main(String[] args) {
        /*
            1. 시스템 정의 식별자
            2. 사용자 정의 식별자
         */

        /*
            byte -> 정수형 1바이트 = 8bit
         */
        byte b1 = 127;
        byte b2 = -128;
        System.out.println(b1);
        /*
            short -> 정수형 2바이트
         */
        short s1 = 10000;
        short s2 = 100;

        // int보다 작은 데이터형간의 연산결과 -> int로 자동변환
//        short s3 = s1 + s2; // 에러 : 자동으로 int로 변경됨
        int s3 = s1 + s2;
        System.out.println("s3 : " + s3);

        /*
            ** int -> 정수형 4바이트 (기본)
         */
        int i1 = 1000000000;
        int i2 = -100000000;

        System.out.println(i1);
        System.out.println(i2);

        /*
            long -> 정수형 8바이트
         */
        long l1 = 1243567890123456789L;
        long l2 = -10L;
        System.out.println(l1);
        System.out.println(l2);

        float fff = l1;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setGroupingUsed(false);
        System.out.println("fff 확인 : "+ nf.format(fff));

        /*
            float -> 실수형 4바이트
         */
        float f1 = 10.234567891012131415161718192021f; // 6자리까지 표현
        float f2 = 10.3f;
        float f3 = 1000000000;
        System.out.println(f1);
        System.out.println(f2);

        /*
            ** double -> 실수형 8바이트 (기본)
         */
        double d1 = 105.1234567891012131415161718192021;    // 14자리 표현
        double d2 = 10.551;
        System.out.println(d1);
        System.out.println(d2);

        /*
            논리형 -> 1bit
         */
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1);
        System.out.println(bool2);

        /*
            문자형 - > 2바이트 / C언어는 1바이트
             - 한글 : 2 바이트
             - 영문 : 1 바이트
             - 유니코드 : 3 바이트
         */
        char c1 = 'a';
        char c2 = 'b';
        char c3 = '남';
        char c4 = '자';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        /*
            char배열 -> 문자열
         */
        char[] chars = new char[100];
        chars = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray();
        System.out.println(chars);
        System.out.println(chars.toString());
        /*
            String 클래스 -> 문자열
             - "" 더블쿼트로 표현
         */
        String ss = "남자";
        String ss2 = "ab";
        System.out.println(ss2.getBytes().length);  // 2
        System.out.println(ss.getBytes().length);   // 6

        /*
            특수문자
         */
        System.out.println("aaa \n" + "qqq\t\t\t\t\t\taaa\t");
        System.out.println("경로 지정 -> "+"C:\\abc\\bin");
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
        System.out.println(0xFF);   // 11111111
        System.out.println(0xf1);   //

        /*
            리터럴과 상수의 차이
             - 리터럴 : 변수의 값이 변하지 않는 데이터(메모리 위치안의 값)를 의미
             - 상수 :  변하지 않는 변수를 의미하며 (메모리 위치) 메모리 값을 변경할 수 없다.

         */
        // "abc" 도 주소가 존재함.
        String ls = "abc";          // "abc" 를 객체 리터럴, ss1는 변수(값이 변하는 데이터)
//        String ls = new String("abc");
        final String fs = "abc";    // "abc"
//        final String fs = ls;    // "abc"

        /*
            == 비교연산자 : 객체의 주소를 비교
            equals 메서드 : 객체의 주소 안의 값을 비교
         */
        System.out.println(fs == "abc");
        System.out.println(fs.equals("abc"));
        System.out.println(fs == ls);
        System.out.println(fs.equals(ls));


        ls = "bbbb";
        System.out.println(fs);
        System.out.println(ls);

        final Test test = new Test();
        test.num = 10;
        System.out.println(test.num);
        test.num = 20;
        System.out.println(test.num);

    }
}
