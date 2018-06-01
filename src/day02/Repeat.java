package day02;

/*
    반복문
     - 같은 내용 or 비슷한 내용 or 같은 로직을 여러번 처리해야하는 경우

    1. for (제일 많이 쓰임)
     - 초기값, 조건식, 증감식 등 같이 사용

    2. while (조건에 맞게 실행)
     - 조건식만 포함
     - 무한루프시에 많이 씀

    3. do ~ while (잘 안쓰임)
     - 일단 1번 실행 후 조건에 맞으면 실행

 */
public class Repeat {
    public static void main(String[] args) {
        /*
            for 문
         */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("--------------------------");
        for (int i = 10; i > 0 ; i--) {
            System.out.println(i);
        }

        /*
            while 문
         */
        System.out.println("--------------------------");
        int j = 0;
        while (j < 10) {
            j++;
            System.out.println("j = "+j);
        }

        /*
            일단 한번 실행!
             - 주의 : 마지막에 ;이 붙음
         */
        System.out.println("--------------------------");
        int k = 0;
        do {
            System.out.println("실행 : " + k);
            k++;
        } while (k < 1);

        /*
            중첩 반복문
         */
        System.out.println("--------------------------");
        for (int i = 1; i < 10; i++) {
            for (int m = 1; m < 10; m++) {
                System.out.print(i + " x " + m + " = " + (i * m)+" ");
            }
            System.out.println();
        }
    }
}
