package day03.exam.basic;

public class Main2 {
    public static void main(String[] args) {
        Test02 test = new Test02();
        /*
             swap테스트를 통해
             매개변수 자료형 타입별 상황을 파악하시기 바랍니다.

             1. 기본타입 변수을 매개변수로 전달 할 경우    ->   데이터만 전송이 되므로 현재 변수 값에 영향을 미치지 않습니다.
             2. 참조타입 변수(주소값이 저장되는) 경우      ->   주소값이 전달되므로 주소값에 저장되어 있는 정보를 활용할 수 있으며, 정보 변경시 현재 위치에서 변수에도 영향을 미치게 됩니다.
                                                                즉, 변경사항 발생시 반영되어 객체에 영향을 미치게 됩니다.
         */
        int a = 10;
        int b = 20;

        // 데이터 swap
        System.out.println("---------기본타입 swap----");
        System.out.println("스왑전 a : " + a); // 출력 예상해보기
        System.out.println("스왑전 b : " + b); // 출력 예상해보기
        Test02.swap(a, b);    // swap -> static 메서드입니다. 어떻게 사용하시는지 감이 오시나요??
        System.out.println("스왑후 a : " + a); // 출력 예상해보기
        System.out.println("스왑후 b : " + b); // 출력 예상해보기

        System.out.println("스왑이 안되는 이유는 " +
                "메서드에 매개변수 전달시 기본타입은 데이터만을 넘기기 때문에 " +
                "메서드에서 스왑작업을한다 해도 매개변수로 넘어온 데이터만을 활용하게 됩니다." +
                "따라서 현재 위치에서 변수 a, b는 데이터만 넘기기만 하고 메서드안의 내용에 의해 영향을 받지 않아 그대로 존재하게 됩니다.");

        /*
            데이터 swap
             - 아래 예제를 보시면 아시겠지만 자바는 이렇게 swap을 하려면
               클래스작성 -> 객체생성 -> 참조변수를 통한 데이터 교환

             - 타언어에 비해 굉장히 복잡해지는 것을 알 수 있습니다. 이럼에도 불구하고 자바를 많이 사용하는 이유는
               객체지향설계에 특화되어 있고, 명시적인 자료형으로 직관적이고 안정성을 추구하기 때문입니다.
         */
        System.out.println("---------참조타입 swap----");
        Test02 t1 = new Test02(10);
        Test02 t2 = new Test02(20);
        System.out.println("스왑전 integer : " + t1.getValue());
        System.out.println("스왑전 integer2 : " + t2.getValue());
        Test02.swap(t1, t2);    // 오버로딩된 static 메서드입니다
        System.out.println("스왑후 integer : " + t1.getValue());
        System.out.println("스왑후 integer2 : " + t2.getValue());

        /*
            배열을 이용한 swap -> 배열도 객체이므로 주소값이 전달됩니다.
         */
        System.out.println("---------참조타입 swap2----");
        int[] arr = {20, 40};   // 선언과 동시에 생성 및 초기화
        System.out.println("스왑전 arr[0] : " + arr[0]);
        System.out.println("스왑전 arr[1] : " + arr[1]);
        Test02.swap(arr);    // 오버로딩된 static 메서드입니다
        System.out.println("스왑후 arr[0] : " + arr[0]);
        System.out.println("스왑후 arr[1] : " + arr[1]);


    }
}
