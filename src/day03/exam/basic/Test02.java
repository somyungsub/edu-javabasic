package day03.exam.basic;

public class Test02 {
    private int value;

    public Test02() {

    }

    public Test02(int value) {
        this.value = value;
    }


    /*
        swap이란 두데이터의 위치를 바꾸는 것을 말합니다
        - ex) 매개변수 a는 10, b는 20이 들어왔다면 a는 20, b는 10으로 변경이 되어야합니다.
     */
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    /*
        객체는 참조변수 이므로 변수에는 주소값이 저장되며 저장된 주소값을 통해 접근하게 됩니다!
     */
    public static void swap(Test02 t1, Test02 t2) {
        int temp = t1.value;
        t1.value = t2.value;
        t2.value = temp;

    }

    /*
        데이터가 2개 들어온다고 제한!
        배열도 객체이므로 주소값을 받습니다.
     */
    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    public int getValue() {
        return this.value;
    }
}
