package day03.exam.class1;

public class Person {
    private String oauthNumber; // 인증번호 (학번)
    private String name;    // 이름
    private int age;        // 나이

    // 디폴트 생성자
    public Person() {
    }

    // 매개변수가 있는 생성자 -> 매개변수는 인스턴스변수 초기화에 대입된다.
    public Person(String oauthNumber, String name, int age) {
        this.oauthNumber = oauthNumber;
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "oauthNumber='" + oauthNumber + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
