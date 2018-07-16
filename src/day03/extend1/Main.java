package day03.extend1;

public class Main {
    public static void main(String[] args)  {
        /*
            class1 패키지의 클래스들을 상속관계로 맺어보기!

            상속  키워드 : extends
            부모  Person (일반, 상위개념)
            자식  Student, Professor (구체적, 하위개념)
         */

        /*
            각 하위클래스에서 공통화시킨 부분 -> 상위클래스로 이동

            다형성 이란?
             - 기본적으로 Type(자료형)을 맞춰주어야하나 상속관계 or 인터페이스로 참조할 경우(4주차에진행 될 내용)
               상위클래스는 하위클래스를 받을 수 있다.
         */

        // 다형성의 예
        Person person = new Student("1111", "김교수", 23, 4);
        Person person2 = new Professor("1111", "김교수", 23, "G10101");

        // 타입을 맞춰준 예 -> 상속이 없는 경우 기본적인 방식
        Person person1 = new Person("1111", "김교수", 25);
        Student student = new Student("1111", "김교수", 23, 4);
        Professor professor = new Professor("1111", "김교수", 55, "G100");
//        test(person1, student, professor);
//        test(student, student, professor);
//        test(professor, student, professor);

        test(student);
        test(professor);
//        System.out.println(student);
//        System.out.println(professor);
//
//        student.getName();
//        professor.getName();
//        System.out.println(person1);
    }


    // 부모 instanceof 자식 -> 자식클래스가 무엇인지 판별이 가능합니다.
    private static void test(Person pr) {
        System.out.println(pr.getAge());
        if (pr instanceof Student) {
            Student st = (Student)pr;
            System.out.println("학생입니다" + st.getGrade());
            System.out.println("학생입니다" + ((Student)pr).getGrade());
        } else if (pr instanceof Professor) {
            Professor p = (Professor)pr;
            System.out.println("교수입니다" + p.getLabNumber());
        }
    }


//    private static void test(Student pr) {
//        System.out.println(pr.getAge());
//    }
//    private static void test(Professor pr) {
//        System.out.println(pr.getAge());
//    }
}
