package day03.extend1;

public class Professor extends Person{
    private String labNumber;   // 연구실
    public Professor(String ouathNumber, String name, int age, String labNumber) {
        super(ouathNumber, name, age);
        this.labNumber = labNumber;
    }
}
