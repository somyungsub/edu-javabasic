package day03.exam.class1;

public class Main {
    public static void main(String[] args)  {

        /*
            객체 생성해보기
         */

        System.out.println("-------------Student------------");
        Student s1 = new Student();
        Student s2 = new Student();

        // 결과 예상해보기
        System.out.println(s1);
        System.out.println(s2.toString());
        System.out.println("s1은 toString을 호출 하지 않았지만, 위에 s1과 s2는 동일한 값이 나옵니다. 이유가 무엇일까요??");
        System.out.println("모든 클래스는 Object라는 클래스를 내부적으로 무조건 상속합니다. 이 Object클래스 안에 toString메서드가 있는데" +
                "모든 참조타입 변수자체에 대한 정보를 출력할 때 toString이 내부적으로 호출하게 됩니다");


        System.out.println("-------------Professor------------");
        Professor professor1 = new Professor();
        // 앞의 회색글씨는 intelliJ에서만 제공하는 기능입니다. 매개변수명을 의미합니다.
        Professor professor2 = new Professor("1111", "김교수", 55, "G100");

        // 결과 예상해보기 현재 Professor클래스의 toString은 주석처리되어 있습니다. 과연 어떤 값이 출력 될까요??
        System.out.println("professor1 : " + professor1);
        System.out.println("professor1 toString : " + professor1.toString());
        System.out.println("professor2 : " + professor2);
        System.out.println("professor2 toString : " + professor2.toString());

        /*
            모든클래스의 최상위 클래스
            - 이론자료 6장 p.21 ~ 23
            - Object 클래스
            - Object 클래스는 상속하지 않아도 모든클래스에서 디폴트로 상속되어 있습니다.
         */
        System.out.println("-------------Obejct------------");
        Object obj = new Object();
        System.out.println(obj.hashCode()); // 십진수
        System.out.println(obj.toString()); // hashcode 값이 16진수로 변형되서 나옵니다
        System.out.println(obj);            // toString이 내부적으로 호출됩니다
    }
}
