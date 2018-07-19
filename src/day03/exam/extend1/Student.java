package day03.exam.extend1;



/*
    하위클래스 학생
    - 설명은 Professor 내용과 동일
 */

public class Student extends Person{
    private int grade;      // 학년

    public Student() {
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
