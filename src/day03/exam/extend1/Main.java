package day03.exam.extend1;

public class Main {
    public static void main(String[] args)  {
        /*
            class1 패키지의 클래스들을 상속관계로 맺어보기!

            상속  키워드 : extends
            부모  Person (일반적, 상위개념)
            자식  Student, Professor (구체적, 하위개념)
         */

        /*
            각 하위클래스에서 공통화시킨 부분 -> 상위클래스로 이동

            다형성 이란?
             - 이론자료 6장 p.16~20 참조
             - 기본적으로 Type(자료형)을 맞춰주어야하나 상속관계 or 인터페이스(4주차에 진행 될 내용)로 참조할 경우
               포함 관계상 상위클래스타입(Person)은 하위클래스(Student, Professor)를 받을 수 있다.
         */

        System.out.println("---- 각 클래스에 따른 동적바인딩 후 오버라이딩 메서드(toString) 확인 -----");
        System.out.println("---- extend2 패키지에서 자세히 설명. 여기서는 확인만! -----");
        Person person = new Student("1111", "김학생", 23, 4);
        Person person2 = new Professor("1111", "김교수", 23, "G101");
        System.out.println(person);     // 출력 내용은?
        System.out.println(person2);    // 출력 내용은?

        /*
            타입을 맞춰준 예
             - 상속이 없는 경우 기본적인 자바의 자료형 통일 방식
         */
        Student student = new Student("1111", "김학생", 23, 4);
        Professor professor = new Professor("1111", "김교수", 55, "G100");

        System.out.println("---- test함수는 Main 클래스 의 메서드 이며 아래 보시면 있습니다.-----");
        System.out.println("---- 매개변수 넘길 때 다형성 활용 -----");
        test(student);      // 지금은 상속관계이므로 가능
        test(professor);    // 지금은 상속관계이므로 가능

        System.out.println("--- 주석을 풀기전 에러가 나는지, 에러가안난다면 왜 안나는지 내용 예상해보기 ---");
//        day05.test(person);     // 맨위의 => Person person = new Student("1111", "김학생", 23, 4);
//        day05.test(person2);    // 맨위의 => Person person2 = new Professor("1111", "김교수", 23, "G101");

    }

    /*
        상위 instanceof 하위
         - 상위클래스에 담긴 자식클래스가 어떤 것 인지 판별을 하는 예약어
         - day05.test 메서드에 매개변수를 유심히 지켜보시기 바랍니다.
         - 만약 매개변수 타입이 Person이 아닌 Student나 Professor 이었다면 어땠을까요??
           해당 클래스만 받아서 활용해야 하며, Student로 해놓고 Professor을 또 필요로 한다면...
           타입별로 메서드를 다르게 구성해야 하는 경우가 발생 할 수도 있습니다.

           또한 Student, Professor을 여러개 받아서 처리해야한다면...? Student[], Professor[] 선언해서 활용할 수도 있습니다.
           이런경우 하위클래스 갯수가 많아져서 10개 이상 늘어난다면...  그때마다 수정을해야하는 경우가 발생할 수 있습니다.

           이런경우 Person[]에 Student와 Professor.. 이후 다른 하위클래스가 추가된다면... 그 부분까지 해서
           처리할 수도 있고, 때에 따라 방향성을 잡으셔야 합니다.
     */
    private static void test(Person pr) {

        if (pr instanceof Student) {
            Student st = (Student)pr;       // 명시적형변환   -> 용어로는 다운캐스팅이라 합니다
                                            //                  (상위개념이 하위개념으로 반환되어 하위의 정보를 얻어야 할 때)
            System.out.println("이름 : " + st.getName());
            System.out.println("나이 : " + st.getAge());
            System.out.println("학생 학년 : " + st.getGrade());
        } else if (pr instanceof Professor) {
            Professor p = (Professor)pr;    // 명시적 형변환  -> 용어로는 다운캐스팅이라 합니다
            System.out.println("이름 :" + p.getName());
            System.out.println("나이 :" + p.getAge());
            System.out.println("교수 연구실 : " + p.getLabNumber());
        }
    }

    /*
        리팩토링 해보기
         - 위 test메서드에 보시면 중복성 코드가 보입니다.
         - 위 test메서드를 복사 후 아래에 붙여넣기 하신후 위 test메서드는 주석처리하고 변경해봅시다.
         - 맨 아래 내용 확인가능! 꼭 해보시고 확인해보기
     */








































    // 리팩토링 -> 중복코드 통일
//    private static void day05.test(Person pr) {
//
//        // 상위클래스 내용 확인
//        System.out.println("이름 : " + pr.getName());
//        System.out.println("나이 : " + pr.getAge());
//
//        // 하위클래스 별 내용 확인
//        if (pr instanceof Student) {
//            Student st = (Student)pr;       // 명시적형변환   -> 용어로는 다운캐스팅이라 합니다
//                                            //                  (상위개념이 하위개념으로 반환되어 하위의 정보를 얻어야 할 때)
//            System.out.println("학생 학년 : " + st.getGrade());
//        } else if (pr instanceof Professor) {
//            Professor p = (Professor)pr;    // 명시적 형변환  -> 용어로는 다운캐스팅이라 합니다
//            System.out.println("교수 연구실 : " + p.getLabNumber());
//        }
//    }

}
