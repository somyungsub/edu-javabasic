package day03.practice.basic;

public class Subject {
    private String subjectName; // 과목
    private int score;       // 점수

    public Subject(String subjectName, int score) {
        this.subjectName = subjectName;
        this.score = score;
    }
    // getter and setter 메서드 ( private변수에 대해 데이터를 저장하고, 반환할 수 있도록함 )
    public String getSubjectName() {
        return subjectName;
    }
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
