package day03.extend1;

public class Main {
    public static void main(String[] args)  {
        /*
            상속  키워드 : extends
            부모  Person (일반, 상위개념)
            자식  Student, Professor (구체적, 하위개념)
         */
        // 공통화시킨 부분
        Student student = new Student("1111", "김교수", 23, 4);
        Professor professor = new Professor("1111", "김교수", 55, "G100");

        student.getAge();

    }
}
