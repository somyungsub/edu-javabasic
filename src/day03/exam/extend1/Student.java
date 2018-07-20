package day03.exam.extend1;



/*
    하위클래스 Student
    - 설명은 Professor 내용과 동일
 */

public class Student extends Person {
    /*
        Professor과 마찬가지로 학생관련 정보만 기술하시면 됩니다.
        클래스의 분리를 통해 각 객체의 관리 포인트를 찾을 수 있겠나요?
     */
    private int grade;      // 학년, 학년정보 외 학생 정보로 뭐가 있을지 고민해봅시다! 예를들면 전공, 동아리 여부 등등이 있겟죠?

    public Student() {
        System.out.println("Student 기본 생성자");
    }

    public Student(String oauthNumber, String name, int age, int grade) {
        super(oauthNumber, name, age);
        this.grade = grade;
    }


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "grade=" + grade +
                '}';
    }
}
