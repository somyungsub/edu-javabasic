package day04.interface2;

/*
    BeanFactory는 현재 TV관련 객체를 생성을 담당하는 클래스입니다.
 */
public class BeanFactory {

    /*
        getBean 메서드는 인풋 값으로 beanName을 받아 판단 한 후 해당 객체를 만들어주는 역할을 합니다.
        - return 타입에 주목해주세요. -> 어떤개념이 활용 된건지 감이 오시나요?? 네 다형성 개념입니다.
          3주차에는 매개변수 받는걸로 다형성 연습을 했었어요. 지금처럼 반환으로도 다형성을 활용 할 수 있습니다.

        *** 추가 내용 ***
        TvUser2에서 getBean 메서드 때문에 문법에러가 발생합니다.
         - 해결책  ->  TvUser2를 실행하실 때 static 지정자로 해주셔야 합니다.
         - 이유는  ->  TvUser2 참조
     */
    public TV getBean(String beanName) {
        /*
            지금은 하위클래스가 SamsungTV, LgTV 2개이지만 애플TV, 구글TV .... 더 필요하다는 요청이 들어오면 ??
            이부분에서는 else if를 추가하여 new 생성자() 를 추가해주면 되겠죠??
         */
        if ("samsung".equals(beanName)) {
            return new SamsungTV();
        } else if ("lg".equals(beanName)) {
            return new LgTV();
        }else if ("apple".equals(beanName)) {
            return new AppleTV();
        } else {
            return null;    // 반환된 객체가 아무것도 없다는 의미입니다. 즉 주소값이 없는 데이터를 넘기게 됩니다.
        }
    }
}
