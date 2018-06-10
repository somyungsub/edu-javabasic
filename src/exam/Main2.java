package exam;

public class Main2 {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        System.out.println(Student.major);
        Student.setMajor("소프트공학");

        System.out.println(student.getName());
        System.out.println(student2.getName());
        System.out.println(student3.getName());

//        student.study();
//        student.eat();
//
//        System.out.println(student);
//
//        student.setName("소명섭", 31);
//        student2.setName("변해균님", 40);
//        student3.setName("정용수님",28);
//
//        System.out.println(student.getName());
//        System.out.println(student2.getName());
//        System.out.println(student3.getName());


    }
}

