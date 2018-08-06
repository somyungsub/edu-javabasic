package day05.generics.chapter01;

public class Main2 {
    public static void main(String[] args) {
        /*
            클래스로더를 이용
         */
        System.out.println("--------출력1----------");
        Student student = new Student();
        System.out.println(student.getItem());

        System.out.println("--------출력2----------");
        Student<String> student2 = new Student();
        System.out.println(student2.getItem());

        System.out.println("--------출력3----------");
        Student<Integer> student3 = new Student();
        System.out.println(student3.getItem());
    }
}
