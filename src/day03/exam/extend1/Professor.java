package day03.exam.extend1;

/*
    하위클래스 교수
    - 상위클래스 Person을 상속합니다.
    - 상속관계 -> 상위클래스의 멤버변수 및 멤버메서드를 사용할 수 있습니다.
      : 여기서 주의 !! -> 접근지정자 private는 클래스내에서만 접근이 가능하므로 상위클래스가 private라면 접근이 불가능
        따라서... protected나 public 지정자만 하위클래스에서 접근이 가능합니다.
 */

public class Professor extends Person {
    /*
        class1 패키지에서 Professor의 정보 중 공통사항을 상위로 빼고 Professor에만 해당하는 정보를 남겼습니다
        따라서, Professor에 관한 정보만 기술하면 됩니다.
        연구실말고 다른 정보.. 예를들면 수강스케쥴 같은? 또는 전문분야 등등 정보를 기술할 수 있겠죠?
     */
    private String labNumber;   // 연구실

    // 디폴트 생성자
    public Professor() {
        System.out.println("Professor 기본 생성자");
    }

    // 매개변수 생성자 : 인스턴스변수 초기화
    public Professor(String oauthNumber, String name, int age, String labNumber) {
        /*
            super예약어는 상위클래스의 생성자를 호출합니다.
                -> 항상 맨위에 존재해야합니다. 이유는 잠깐 생각해보죠..
                   실행순서가 중요하다고 누누히 말씀드렸습니다.
                   부모가 생성되지도 않았는데 자식이 생성되지는 않겠죠?? 이렇게 상속관계를 맺게 되면 부모객체를 항상 생성하여 연관을 맺게 됩니다,

         */
        super(oauthNumber, name, age);  //  생략시? 에러는 안납니다. 대신 상위의 기본생성자가 호출되겠죠??

        // 여기에서 문제 Person 객체의 기본생성자를 주석처리 한후 바로위의 super도 주석을 합니다. 그러면 에러가 발생하는데 이 이유를 아시겠나요??
        // 이유는 매개변수가 있는 생성자를 기술하게 되면 기본생성자는 자동생성이 안된다고 했습니다. 이원칙이 그래도 적용이됩니다. 그래서 기본생성자는 왠만하면 항상 만드시는게 좋습니다
        this.labNumber = labNumber;
    }

    public String getLabNumber() {
        return labNumber;
    }

    public void setLabNumber(String labNumber) {
        this.labNumber = labNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "Professor{" +
                "labNumber='" + labNumber + '\'' +
                '}';
    }
}
