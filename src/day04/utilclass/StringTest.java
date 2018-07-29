package day04.utilclass;

import java.math.BigDecimal;

public class StringTest {
    public static void main(String[] args) {
        /*
            String 클래스 관련 메서드 예제
            - 문자열 처리는 중요하고 많이 다뤄지는 내용이므로 이거 외에도 다른 메서드를 스스로 공부해보시길 권합니다.
            - 아래는 자주 쓰이는 메서드들 입니다.
         */
        String str = new String("ABCDEFGA");
        System.out.println("문자열 길이 : " + str.length());
        System.out.println("문자열 일치여부 : " + "abcdefg".equals(str));  // ==
        System.out.println("문자열 대소문자 무시하고 일치여부 : " + "abcdefg".equalsIgnoreCase(str));

        System.out.println("substirng : " + str.substring(3));     // 3번째부터 ~ 끝까지
        System.out.println("substirng : " + str.substring(3,5));   // 3 ~ 5번째
        System.out.println("substirng : " + str.substring(0,5));   // 0 ~ 5번째
        System.out.println("substirng : " + str.substring(0, str.length()));    // 0 ~ 끝까지

        System.out.println("replace " + str.replace("A","X"));      // A문자열을 X문자열로 바꿔서 반환
        System.out.println("replace " + str.replace("ABC","XYZ"));  // ABC문자열을 XYZ문자열로 바꿔서 반환
        System.out.println("replace " + str);  // 원래 문자열 str은 영향 안받음

        System.out.println("소문자를 대문자로 : " + "abcd".toUpperCase());
        System.out.println("대문자를 소문자로 : " + str.toLowerCase());


        System.out.println("문자열에서 문자 뽑기 : " + str.charAt(0));   // 매개변수 : 인덱스 -> 문자열중 해당 index에 속하는 문자 반환
        System.out.println("문자열에서 문자 뽑기 : " + str.charAt(1));   // 매개변수 : 인덱스 -> 문자열중 해당 index에 속하는 문자 반환
        System.out.println("문자열에서 문자 뽑기 : " + str.charAt(2));   // 매개변수 : 인덱스 -> 문자열중 해당 index에 속하는 문자 반환

        System.out.println("문자열에서 양끝 공백제거 " + "   aaaa    ".trim());
        System.out.println("문자열에서 양끝 공백제거 " + "   aaaa".trim());
        System.out.println("문자열에서 양끝 공백제거 " + "aaaa    ".trim());
        System.out.println("문자열에서 양끝 공백제거 " + "   aa  aa    ".trim());

        int a =10;
        int b =20;
        System.out.println("문자열 붙이기 " + str.concat("HIJK").concat("LMNOP"));
        System.out.println("문자열 붙이기 " + str.concat(str).concat(str).concat(String.valueOf(a+b)));
        System.out.println(str);    // 원래문자열에는 영향을 미치지 않음

        System.out.println("문자열 포함 확인  " + str.contains("ABC"));    // A문자열.contains(B문자열)  ->  A문자열 중 B문자열을 포함하는가? -> true or false
        System.out.println("문자열 포함 확인  " + str.contains("AX"));     // 포함관계상 앞에오는 A문자열이 큰 범위에 있어야 가능
        System.out.println("문자열 포함 확인  " + str.contains("ABCDEFG"));


        System.out.println("다른 데이터 타입을 문자열로 반환 " + String.valueOf(10));
        System.out.println("다른 데이터 타입을 문자열로 반환 " + String.valueOf(10.2));
        System.out.println("다른 데이터 타입을 문자열로 반환 " + String.valueOf('c'));
        System.out.println("다른 데이터 타입을 문자열로 반환 " + String.valueOf(true));
        System.out.println("다른 데이터 타입을 문자열로 반환 " + String.valueOf(true) + "ABC");

        System.out.println("------ split -------");
        String[] arr = "ABC,DEF,asd,GGG".split(","); // 문자열을 구분자로 짤라서 배열로 반환
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
