package day03.exam.extend1;

/*
    하위클래스 교수
    - 상위클래스 Person을 상속합니다.
    - 상속관계 -> 상위클래스의 멤버변수 및 멤버메서드를 사용할 수 있습니다.
      : 여기서 주의 !! -> 접근지정자 private는 클래스내에서만 접근이 가능하므로 접근이 불가능
        따라서... protected나 public 지정자만 접근이 가능합니다.
 */
public class Professor extends Person{
    private String labNumber;   // 연구실


    // 디폴트 생성자
    public Professor() {
    }

    // 매개변수 생성자 : 인스턴스변수 초기화
    public Professor(String oauthNumber, String name, int age, String labNumber) {
        super(oauthNumber, name, age);
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
