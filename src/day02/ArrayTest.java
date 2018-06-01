package day02;


/*
    배열
    - 같은 타입의 변수를 여러개 선언하여 다뤄야 하는 경우
    - 프리미티브 타입, 사용자 정의 타입 등 전부 활용
 */
public class ArrayTest {

    public static void main(String[] args) {

        /*
            배열선언
             - 프리미티브 타입은 자동 초기화
             - 객체는 null 초기화 -> 사용시 new연산자로 인스턴스를 생성 해주어야함
         */
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("---------------------");

        String[] s = new String[10];
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        System.out.println("---------------------");

        /*
            선언과 동시에 초기화
         */
        int[] aa1 = new int[]{10, 20};
        int[] aa2 = {10, 20};


        /*
            배열 선언과 동시에 초기화
         */
        int [][] num = { {10 , 20 } , {30 } , { 40 , 50 } };
        System.out.println(num.length);
        System.out.println(num[0].length);
        System.out.println(num[1].length);
        System.out.println(num[2].length);

        String [][] name = { {"홍길동", "이순신"} , {"이순신"}};
        System.out.println(name.length);
        System.out.println(name[0].length);
        System.out.println(name[1].length);


    }

}
