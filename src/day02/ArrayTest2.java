package day02;


public class ArrayTest2 {

    public static void main(String[] args) {
        /*
            2차원 배열
         */
        int[][] a = new int[5][];   // 5행 선언 및 각행의 열크기는 미확정
        int[][] b = new int[5][5];  // 행크기 == 열크기 배열이 자주 쓰이는 편입니다.

        /*
            아래 반복문 실행시 에러가 납니다.
            - 열크기가 안정해졌으므로 열크기를 생성해주고 사용해야합니다.
            - 왜그런지 생각해보기
         */
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.println("i : "+ i + ", j : " + j);
//            }
//        }

        // 다음과 같이 a배열은 열크기를 정해주어야 합니다
        a[0] = new int[5];


        /*
            하지만 이문장도 에러가 납니다. 이유는??
            - 아래 두 출력 문장이 힌트입니다. 주석 푼 후 실행해보시기 바랍니다
         */
//        System.out.println("확인 : " + a[0].length);
//        System.out.println(a[1].length);
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.println("i : "+ i + ", j : " + j);
//            }
//        }



        // 다음과 같이 모든행의 열을 생성해 주어야 에러가 안납니다
        a[0] = new int[55];
        a[1] = new int[3];
        a[2] = new int[1];
        a[3] = new int[6];
        a[4] = new int[10];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("i : "+ i + ", j : " + j);
            }
        }

         /*
            2차원 배열 선언과 동시에 초기화
         */
        int[][] num = {{10, 20}, {30}, {40, 50}, {10,10,10,1010,10}};
        System.out.println("전체행 길이 : " + num.length);
        System.out.println("1행 열 길이 : " + num[0].length);
        System.out.println("2행 열 길이 : " + num[1].length);
        System.out.println("3행 열 길이 : " + num[2].length);

        String[][] name = {{"홍길동", "이순신"}, {"이순신"}};
        System.out.println(name.length);
        System.out.println(name[0].length);
        System.out.println(name[1].length);

        System.out.println("---- 2차원 배열 접근시 중요한 점 ---");
        System.out.println("아래 출력문을 보시면 전부 이상한 숫자가 나옵니다.. 이유를 생각해보시기 바랍니다");
        System.out.println(num);
        System.out.println(num[0]);
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println("----------------------");
        System.out.println(name);
        System.out.println(name[0]);
        System.out.println(name[1]);
    }

}
