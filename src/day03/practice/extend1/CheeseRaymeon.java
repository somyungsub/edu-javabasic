package day03.practice.extend1;

public class CheeseRaymeon extends Ramyeon{
    private String item;

    // 데이터 초기화
    public CheeseRaymeon(String name, boolean addItemFlg, String item) {
        super(name, addItemFlg);
        this.item = item;
    }

    @Override
    public void cookRamyeon() {
        super.cookRamyeon();    // 라면 조리하기 시작
        super.addItemRecipe();  // 추가재료 설명

        // 하위클래스 조리 설명
        System.out.println(super.name + "다 끓이고 "+ item + "를 넣어서 조리하기~");    // super키워드 아시겠죠?? 상위를 가리킵니다. 상위의 name변수 이런식으로 해석하듯이 읽으시면 됩니다. 생략해도 무방해요 자동으로 인식합니다.
        //        super.explainRamyeon();   // 공통메서드 추가 구현하여 주석풀어서 실행해보기
        System.out.println("치즈는 국물이 느끼해져요..");
    }
}
