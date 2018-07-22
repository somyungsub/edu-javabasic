package day03.singleton;

/*
    싱글턴 패턴은 주로
    DB커넥션 객체를 연결하여 접근할 때 활용됩니다.
    - DB커넥션이란 데이터베이스연동을 위해 필요한 클래스라고 생각하시면됩니다.


      -> DB커넥션을 통해 DB에접근할 때 마다 객체를 생성(인스턴스화)한다면....??
         메모리가 계속 쌓여서... 서버가 죽게 될 겁니다. GC가 알아서 관리를 해주긴 하지만
         코드상 이런 내용이 있다면 서버가 매번 느려지거나 속도 이슈가 발생하게 되므로 객체생성에 유의를 하셔야합니다.

 */
public class Main {
    public static void main(String args[]){

        /*
            생성자의 생성여부 확인
            - 코드를 보시면 해당 영역에서 new 연산자를 사용하지 않습니다. 이 포인트가 중요합니다.
            - 어떤 클래스의 메서드를 호출하여 객체를 받고 있죠?? 생성을 클래스에 위임(넘기기)을 하여 거기서 생성하는 로직을 구성하고
            - 사용자는 그냥 객체를 받아서 쓰기만 하면 되는 내용입니다.

            이렇게 함으로써 생성영역과 사용영역을 분리하여 관리를 하게 됩니다. 따라서 수정사항이 발생해도 서로 영향을 안미치고
            수정이 가능하게 되겠죠? 예를들어 DBConnection에서 생성하는 내용을 수정해달라하면 거기서만 수정을하면되지
            Main에서 까지 수정할 필요가 없습니다.

            여기서 중요한건 생성자의 호출여부를 잘 파악하시기 바랍니다.
         */
        DBConnection obj1 = DBConnection.getInstance();
        DBConnection obj2 = DBConnection.getInstance(); // 생성자 호출이 일어 날까요??
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
