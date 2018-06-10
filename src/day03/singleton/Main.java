package day03.singleton;

/*
    싱글턴 패턴은 주로
    DB커넥션 객체를 연결하여 접근할 때 활용됩니다.
    - DB커넥션이란 데이터베이스연동을 위해 필요한 클래스라고 생각하시면됩니다.


      -> DB커넥션을 통해 DB에접근할 때 마다 객체를 생성(인스턴스화)한다면....??

 */
public class Main {
    public static void main(String args[]){

        // 생성자의 생성여부 확인
        DBConection obj1 = DBConection.getInstance();
        DBConection obj2 = DBConection.getInstance();
        System.out.println(obj1);

        // 주소 값이 같은지 확인 == 비교연산자는 내부적으로 Object클래스의 toString()호출 -> hashCode() 메서드를 통해 값 비교를 함
        if (obj1 == obj2) {
            System.out.println("obj1 == obj2");
        } else {
            System.out.println("obj1 != obj2");
        }

        System.out.println("end");
    }
}
