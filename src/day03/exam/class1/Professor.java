package day03.exam.class1;

public class Professor {

    private String ouathNumber; // 인증번호 (교수번호)
    private String name;        // 이름
    private int age;            // 나이
    private String labNumber;   // 연구실

    // 디폴트 생성자
    public Professor() {
    }

    // 매개변수 생성자 : 인스턴스변수 초기화
    public Professor(String ouathNumber, String name, int age, String labNumber) {
        this.ouathNumber = ouathNumber;
        this.name = name;
        this.age = age;
        this.labNumber = labNumber;
    }


    public String getOuathNumber() {
        return ouathNumber;
    }

    public void setOuathNumber(String ouathNumber) {
        this.ouathNumber = ouathNumber;
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

    public String getLabNumber() {
        return labNumber;
    }

    public void setLabNumber(String labNumber) {
        this.labNumber = labNumber;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "ouathNumber='" + ouathNumber + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", labNumber='" + labNumber + '\'' +
                '}';
    }
}
