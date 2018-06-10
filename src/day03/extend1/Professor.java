package day03.extend1;

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
