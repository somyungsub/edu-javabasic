package day02;


/*
    배열
    - 같은 타입의 변수를 여러개 선언하여 다뤄야 하는 경우
    - 프리미티브 타입, 사용자 정의 타입 등 전부 활용 가능
 */
public class ArrayTest {

    public static void main(String[] args) {

        /*
            배열선언
             - 프리미티브 타입은 자동 초기화 ( int는 0, double은 0.0, char은 null)
             - 객체는 null 초기화 -> 사용시 new연산자로 인스턴스를 생성 해주어야함
         */
        System.out.println("--- 정수형 배열 ---");
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("---------------------");

        System.out.println("--- 실수형 배열 ---");
        double[] d = new double[10];
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
        System.out.println("---------------------");

        System.out.println("--- 문자열 배열 ---");
        String[] s = new String[10];
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        System.out.println("---------------------");

        System.out.println("--- 문자 배열 == 문자열 ---");
        char[] c = new char[10];
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);        // 문자는 null인 경우 공백처럼 보여집니다.
            System.out.println((int)c[i]);   // 여기에서 형변환 이유는?? 눈에 안보이는데이터를 아스키 코드값으로 데이터를 확인하려는 목적입니다.
        }
        System.out.println("---------------------");
        /*
            선언과 동시에 초기화 - 2가지 방식
         */
        int[] aa1 = new int[]{10, 20};
        int[] aa2 = {10, 20, 30, 40, 50, 60};
        /*
            foreach문
             - 배열과 반복문을 혼합할 떄 자주 쓰이는
                for (int i = 0; i<배열사이즈; i++) 변형
             - 초기식, 조건식, 증감식이 내부적으로 for (int i = 0; i<배열사이즈; i++) 을 취하며 순서대로 하나씩 뽑아서 사용하게 됩니다.
             - 순서대로 데이터를 배열에서 뽑아내기 떄문에 순차탐색에 자주 활용 됩니다.
             - 아직 익숙하지 않다면 일단은 기본적으로 초기식, 조건식, 증감식을 활용하여 익숙해지신 다음에 foreach문을 사용해보시기 바랍니다!
         */
        System.out.println("---- foreach 확인 ----");
        for (int i : aa1) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int aa : aa2) {
            System.out.print(aa + "\t");
        }


    }

}
