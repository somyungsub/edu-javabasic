package day05.generics.chapter01;



public class Main {
    public static void main(String[] args) {
        /*
            이론자료 10장. p20 ~ 22 참조 (간단하게 개념정리)
            - 제네릭스 등장은 1.5버전 부터입니다.
            - 자바가 버전업을 하면서 중요한 업데이트를 하는데 이때 문법변화는 무조건 학습을 하셔야 합니다.
            - 1.5의 제네릭스, 1.7에서 제네릭스의 컬렉션 활용 시 타입생략과 몇가지 문법 추가사항들(switch문 문자열 허용...)
              가변인자, Wrapper클래스에서 오토박싱/오토언박싱 개념과 사용, 향상된 for문 (foreach) 등장 등등..
              그리고 1.8의 람다 함수형프로그래밍의 등장. 이런 추가사항들에 의해 프로그래밍 방식도 발전하게 되고,
              소스코드도 점점 간결해지지만 그 만큼 이해하셔야 할 내용도 만만치 않습니다.

              모든 내용을 나열 할 수는 없지만, 점점 문법사항도 추가되고, API활용 할 범위도 넓어지고 있으니, 기본문법 외에
              다루는 범위도 넓히셔야 합니다.

              그중 패러다임 변화 중 가장 핵심인 제네릭스는 상당히 중요합니다. 꼭 아셔야하는 부분이니 여기서는 간단히 살펴보시고
              차후 좀 더 깊게 학습하시기를 권장합니다.
         */

        /*
            1. 제네릭스 클래스
         */
        System.out.println("-----------------------");
        Student student = new Student();    // 생략 -> T가 Object로 내부적으로 정의 됩니다.
        student.setItem(new Object());      // setItem의 매개변수 값을 잘 살펴보시기 바랍니다.
        Object obj = student.getItem();     // getItem의 리턴값을 잘 살펴보시기 바랍니다.
        System.out.println("출력 : " + obj);

        System.out.println("-----------------------");
        Student<String> student2 = new Student<>();         // 타입을 정의하여 객체 생성
        student2.setItem(new String("학생입니다"));  // setItem의 매개변수를 잘 살펴보시기 바랍니다.
        String str = student2.getItem(); // getItem의 리턴 자료형이 String으로 변화된것을 확인하시기 바랍니다.
        System.out.println("출력 : " + str);

        System.out.println("-----------------------");
        Student<Integer> student3 = new Student<>();        // 타입을 정의하여 객체 생성
        student3.setItem(new Integer(20180801));     // setItem의 매개변수를 잘 살펴보시기 바랍니다.
        Integer integer = student3.getItem();               // getItem의 리턴 자료형이 String으로 변화된것을 확인하시기 바랍니다.
        System.out.println("출력 : " + integer);
        System.out.println("이런식으로 클래스에 제네릭스를 사용하여, 클래스의 멤버변수의 값을 사용하는 시점에서 정하여" +
                "전달함으로써 매칭이 자유롭게 이루어집니다. 지금처럼 어떤 정보의 자료형이 동적으로 변해야할 때 유용하게 활용 되겠죠?");
        System.out.println("이렇게 함으로써 Student클래스가 다루는 item변수만 동적으로 자료형을 원하는 형으로 만들 수 있습니다.");


        /*
            1.2. 제네릭스 클래스
             - 타입변수를 여러개 사용 한 경우 (2개이상)
             - 클래스는 상황에 따라 정의하여 구현하시면 됩니다.
         */
        System.out.println("-----------------------");
        Teacher<String, String> teacher = new Teacher<>("영어", "bbb");
        System.out.println("출력K : " + teacher.getKey());
        System.out.println("출력V : " + teacher.getValue());

        System.out.println("-----------------------");
        Teacher<Integer, String> teacher2 = new Teacher<>(1, "bbb55");
        System.out.println("출력K : " + teacher2.getKey());
        System.out.println("출력V : " + teacher2.getValue());

    }
}
