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

        Person person = new Student("1111", "김교수", 23, 4);
        Person person2 = new Professor("1111", "김교수", 23, "G10101");

        // 타입을 맞춰준 예 -> 상속이 없는 경우 기본적인 자바의 자료형 통일 방식
        Person person1 = new Person("1111", "김교수", 25);
        Student student = new Student("1111", "김교수", 23, 4);
        Professor professor = new Professor("1111", "김교수", 55, "G100");

        System.out.println("---- 다형성 활용 -----");
        test(student);
        test(professor);
//        System.out.println(student);
//        System.out.println(professor);
//
//        student.getName();
//        professor.getName();
//        System.out.println(person1);
    }

    /*
        상위 instanceof 하위
         - 상위클래스에 담긴 자식클래스가 어떤 것 인지 판별을 하는 예약어
         - test 메서드에 매개변수를 유심히 지켜보시기 바랍니다.
         - 만약 매개변수 타입이 Person이 아닌 Student나 Professor 이었다면 어땠을까요??
           해당 클래스만 받아서 활용해야 하며, Student로 해놓고 Professor을 또 필요로 한다면...
           타입별로 메서드를 다르게 구성해야 하는 경우가 발생 할 수도 있습니다.

           또한 Student, Professor을 여러개 받아서 처리해야한다면...? Student[], Professor[] 선언해서 활용할 수도 있습니다.
           이런경우 하위클래스 갯수가 많아져서 10개 이상 늘어난다면...  그때마다 수정을해야하는 경우가 발생할 수 있습니다.

           이런경우 Person[]에 Student와 Professor.. 이후 다른 하위클래스가 추가된다면... 그 부분까지 해서
           처리할 수도 있고, 때에 따라 방향성을 잡으셔야 합니다.


     */
    private static void test(Person pr) {
        System.out.println(pr.getAge());
        if (pr instanceof Student) {
            Student st = (Student)pr;       // 명시적형변환   -> 용어로는 다운캐스팅이라 합니다
                                            //                  (상위개념이 하위개념으로 반환되어 하위의 정보를 얻어야 할 때)
            System.out.println("학생입니다 " + st.getGrade());
        } else if (pr instanceof Professor) {
            Professor p = (Professor)pr;    // 명시적 형변환  -> 용어로는 다운캐스팅이라 합니다
            System.out.println("교수입니다 " + p.getLabNumber());
        }
    }


//    private static void test(Student pr) {
//        System.out.println(pr.getAge());
//    }
//    private static void test(Professor pr) {
//        System.out.println(pr.getAge());
//    }
}
