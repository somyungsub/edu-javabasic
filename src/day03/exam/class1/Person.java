package day03.exam.class1;

public class Person {
    private String oauthNumber; // 인증번호 (주민번호?, 학번? 교수번호?)
    private String name;    // 이름
    private int age;        // 나이

    // 기본 or 디폴트 생성자
    public Person() {
    }

    // 매개변수가 있는 생성자 -> 매개변수는 인스턴스변수 초기화에 대입된다.
    public Person(String oauthNumber, String name, int age) {
        this.oauthNumber = oauthNumber;
        this.name = name;
        this.age = age;
    }

    /*
       * 캡슐화 *
       멤버변수 접근지정자가 private이므로 외부에서 데이터를 접근하고 활용해야하는 경우 get, set메서드를 만듭니다.
       public으로 지정하면 외부에서 사용해야 할 때 바로 변수에 접근하여 데이터를 받아오고 변경하는게 편할 수 있지만
       이렇게 하는 이유는 외부에서 직접적인 변수에 접근하여 데이터를 변경하면 보안상 or 실수 or 해킹에 의해 데이터가 잘못 들어올 소지가 있기 때문입니다.
       따라서, 대부분 클래스 작성시 멤버변수는 private로 선언하여 내부적으로 처리하고 데이터정보는 생성자나 set메서드를 통해 데이터를 저장하고,
       get메서드로 데이터를 받아서 활용합니다.

       메서드명 네이밍은 카멜케이스 유지 하여 set+변수명 / get+변수명
       - 단축키 : alt + insert  ->  Getter and Setter  ->  변수선택 후 확인(shift+여러개선택) -> 메서드 자동생성
       - 현재는 아래 메서드가 만들어어저 있어서 생성이 안됩니다. 메서드 삭제 후 해보세요!
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

    /*
        오버라이딩!  이론자료 6장 p.14 ~ 15참조
        - 오버라이딩이란 : 상위에서 작성된 메서드를 하위에서 재정의하는 것을 말합니다. 즉 하위에 맞게 재구성하는것을 말합니다
        - toString은 모든클래스의 내부적 최상위 클래스인 Object 클래스의 메서드입니다.
        - toString을 작성하지 않는 경우 -> 이상한숫자(메모리숫자)가 출력되지만, 지금처럼 오버라이딩을 통해 하위클래스에서
          작성을 하면 toString 메서드를 호출시 동적바인딩이 이루어지면서 하위클래스의 toString이 호출되게 됩니다!

        * 상속, 4주차에서 다룰 인터페이스, 추상클래스에서 무조건 나오는 개념으로 중요합니다.
        * 이를 통해 하위 클래스 객체에 따라 메서드를 호출할 수 있게 됩니다.
        *
        * 아래 toString 메서드 주석을 하고 해보시기 바랍니다
        * 단축키 : alt + insert  ->  toString  -> 메서드 자동생성 :
     */

    @Override
    public String toString() {
        return "Person{" +
                "oauthNumber='" + oauthNumber + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
