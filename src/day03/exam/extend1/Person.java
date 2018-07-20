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
        System.out.println("Person 상위클래스 기본생성자");
    }

    public Person(String oauthNumber, String name, int age) {
        System.out.println("Person 상위클래스 매개변수가 있는 생성자");
        this.oauthNumber = oauthNumber;
        this.name = name;
        this.age = age;
    }

    /*
        멤버변수 oauthNumber / name / age 는 공통으로 활용할 수 있는 정보입니다.
         - 하위에서 이렇게 공통적으로 뽑아낼 수 있는 데이터를 상위에 기술하여 활용하면 나중에 유지보수나 수정시 상위클래스만 수정을하면
           하위클래스에 공통으로 적용이됩니다.

           ex) 만약 하위클래스가 더 많고, 지금 멤버변수가 각각 기술되어 있다고 합시다. 수정요청으로 name을 삭제하라는 요청이들어오면
               수 많은 하위클래스를 전부 찾아서 삭제해야겠죠?? 하지만 이렇게 상속관계를 맺어서 공통부분을 상위에 기술한다면? 상위클래스만 삭제하면 될 겁니다
     */
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
