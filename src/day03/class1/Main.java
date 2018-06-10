package day03.class1;

/*
    학교 관련 객체 만들어보기
 */
public class Main {
    public static void main(String[] args)  {

        /*
            객체 생성
         */
        Professor professor1 = new Professor();
        Professor professor2 = new Professor("1111", "김교수", 55, "G100");
        System.out.println(professor1);
        System.out.println(professor2);
//        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s2.toString());
        /*
            모든클래스의 최상위 클래스
            - Object 클래스
            - Object 클래스는 생략이 되며, 디폴트로 모든 클래스에 상속되어 있음
         */
        Object obj = new Object();
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        System.out.println(obj);
//        Object obj2 = new Object();
//        System.out.println(obj2.hashCode());

    }
}
