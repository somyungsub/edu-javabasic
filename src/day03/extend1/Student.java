package day03.extend1;

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
