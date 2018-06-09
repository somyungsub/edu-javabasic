package day03.extend1;

public class Person {
    private String ouathNumber; // 인증번호 (교수번호)
    private String name;        // 이름
    private int age;            // 나이

    public Person(String ouathNumber, String name, int age) {
        this.ouathNumber = ouathNumber;
        this.name = name;
        this.age = age;
    }

    /*
        공통 메서드
     */
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
}
