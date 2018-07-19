package day03.exam.class1;

public class Student{
    private String oauthNumber; // 인증번호 (학번)
    private String name;    // 이름
    private int age;        // 나이
    private int grade;      // 학년

    public Student() {
    }
    // 매개변수가 있는 생성자 -> 매개변수는 인스턴스변수 초기화에 대입된다.
    public Student(String oauthNumber, String name, int age, int grade) {
        this.oauthNumber = oauthNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    public String getOauthNumber() {
        return oauthNumber;
    }

    public void setOauthNumber(String oauthNumber) {
        this.oauthNumber = oauthNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "oauthNumber='" + oauthNumber + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
