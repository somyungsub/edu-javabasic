package day04.utilclass;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        /*
            Arrays (배열)관련 클래스
            - 아래 메서드들은 자주 활용 되는 편입니다.
            - 이외 메서드들도 많으니 시간되실 떄 한번 찾아보셔서 학습하시기를 권합니다.
         */

        // 정렬 해주는 메서드
        int[] arr1 = {10, 20, 5, 1, -1, 100, 50};
        Arrays.sort(arr1);
        for (int i : arr1) {
            System.out.print(i + " \t");
        }
        System.out.println();

        int[] arr2 = {10, 20, 5, 1, -1, 100, 50};
        Arrays.sort(arr2, 2, arr2.length);  // index로 2부터 arr2의 길이까지 대상으로 정렬
        for (int i : arr2) {
            System.out.print(i + " \t");
        }
        System.out.println();

        // 배열 복사하기!
        int[] arr3 = {10, 20, 5, 1, -1, 100, 50};
        int[] arr3Copy = Arrays.copyOf(arr3, arr3.length);
        for (int i : arr3Copy) {
            System.out.print(i + " \t");
        }
        System.out.println();
        System.out.println("--- arr3Copy의 값 변경 후 원래 배열 arr3과 arr3Copy 비교 ---");
        arr3Copy[0] = 10000;
        for (int i : arr3) {
            System.out.print(i + " \t");
        }
        System.out.println();
        for (int i : arr3Copy) {
            System.out.print(i + " \t");
        }
        System.out.println();
        System.out.println("결과 확인 : 영향을 미치지 않습니다. (깊은복사)");

        // 5개만 복사하기
        int[] arr3Copy2 = Arrays.copyOf(arr3, 5);
        for (int i : arr3Copy2) {
            System.out.print(i + " \t");
        }
        System.out.println();


        // 얉은 복사
        System.out.println("---- 얉은 복사의 예 ----");
        int[] arr4 = arr3;    // arr3 = {10, 20, 5, 1, -1, 100, 50};

        System.out.println("---- 데이터 변경 전 ----");
        for (int i : arr3) {
            System.out.print(i + " \t");
        }
        System.out.println();
        for (int i : arr4) {
            System.out.print(i + " \t");
        }
        System.out.println();

        System.out.println("---- arr4의 데이터 변경 후 -> 출력 예상해보기 (얉은복사) ----");
        arr4[0] = 10000;    // arr4만 데이터 변경
        for (int i : arr3) {
            System.out.print(i + " \t");
        }
        System.out.println();
        for (int i : arr4) {
            System.out.print(i + " \t");
        }
        System.out.println();

        /*
            arr4의 데이터를 변경하면 위에서 Arrays.copyOf로 복사하여 사용한 것과 달리 원래배열 arr3의 데이터까지 변경되는
            상황이 발생 했습니다.

            의도한 바 : arr3의 데이터를 arr4배열에 새로 복사하여  arr3는 그대로 두고, arr4의 데이터만 활용을 하고 싶은데...문제발생

            이런 문제가 발생하는 이유는 arr4=arr3는 주소값을 전달하게 하여 arr3, arr4가 같읕 주소를 참조하고 있기 때문입니다.
            하지만 Arrays.copyOf 메서드는 메서드를 통해 다른 객체를 생성하여 리턴을 해주기 때문에 다른 주소를 참조하고 있습니다.
            따라서, arr4=arr3처럼 대입연산자로 복사를 하는 경우는 복사한게 아니고 같은 주소를 참조하게만 해주는 잘못된 사용 예입니다.
            이런 예를 얉은 복사라하며 복사를 하실 때는 깊은복사(객체를 추가생성하여 다른 주소값을 갖게 함)로 복사하여 사용하셔야합니다.
         */

        System.out.println("---- 주소값 확인해보기 ----");
        System.out.println("arr3 주소 : " + arr3);    // arr3과 arr4가 같음주소를 참조 하고 있음을 알수 있음
        System.out.println("arr4 주소 : " + arr4);    // arr3과 arr4가 같음주소를 참조 하고 있음을 알수 있음
        System.out.println("arr3Copy 주소 : " + arr3Copy);
    }
}
