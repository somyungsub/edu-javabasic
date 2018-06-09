package day03.extend1;

public class Student extends Person{
    private int grade; // 학년

    public Student(String ouathNumber, String name, int age, int grade) {
        super(ouathNumber, name, age);  // 상위클래스 생성자 호출
        this.grade = grade;
    }
}
