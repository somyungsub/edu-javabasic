package exam;

public class  Student {
    private int grade;      // 학년
    private String score;   // 평균학점
    private String name;    // 이름
    private String outhNum; // 학번
    private int age;
    public static String major = "컴공";


    // 생성자 -> 인스턴스변수 초기화 작업
//    public Student(String name) {
//        System.out.println("생성22");
//        this.name = name;   // 이름을 초기화
//    }

//    public Student() {
//        System.out.println("생성1 " + major);
//    }





    public static void setMajor(String majorName) {
        major = majorName;
    }













    public void study(){
        System.out.println("공부중");
    }

    public void eat() {
        System.out.println("밥먹는중");
    }

    // 이름세팅
    public void setName(String name,int age){
        this.age = age;
        this.name = name;
    }

    // 이름반환
    public String getName() {
//        return "이름 : " + name + " , 나이 : " + age;
        return name + " : " + major;
    }

    public String getNameToLowcase() {
        String save = this.name;
        return save.toLowerCase();
    }

    public int getGrade() {
        return grade;
    }
}
