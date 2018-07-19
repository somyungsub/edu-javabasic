package day03.exam.extend1;

/*
    상위클래스
    -> 하위클래스의 공통 부분을 찾아 만듬
 */
public class Person {
    private String oauthNumber; // 인증번호 (학번)
    private String name;    // 이름
    private int age;        // 나이

    public Person() {
    }

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