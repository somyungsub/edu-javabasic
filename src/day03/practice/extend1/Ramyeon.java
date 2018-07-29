package day03.practice.extend1;

public class Ramyeon {
    protected String name;          // protected 입니다. 하위에서도 접근을 허용하며, 하위에서 name까지 활용해야하는경우
    private boolean addItemFlg;     // 상위클래스에서만 데이터를 활용하기 위해 private로 선언.

    // 데이터 초기화
    public Ramyeon(String name, boolean addItemFlg) {
        this.name = name;
        this.addItemFlg = addItemFlg;
    }

    // 오버라이드 하기 - 보통은 추상클래스와 인터페이스를 배우셔서 활용을하게 되지만 여기에서는 일단 공통메서드로도 활용해보도록하죠.
    public void cookRamyeon() {
        System.out.println("라면 조리하기 시작!!");
    }


    // 추가재료 선택 여부에 따른 레시피 설명    - 하위에서 공통 활용 (protected 지정자를 썼습니다. 이 의미는 상속관계까지만 접근을 허용하는 것 입니다.)
    protected void addItemRecipe() {
        if (addItemFlg) {
            System.out.println("추가재료를 선택했습니다!! 파와 계란도 넣어서 맛있게 먹어야지~");
        } else {
            System.out.println("추가재료를 선택하지 않았습니다!! 안그래도 칼로리 높은데 안 넣어야지~");
        }
    }

    // 추가예제 - explainRamyeon 공통메서드로 구현해보기





















    // 공통메서드로 하위클래스에서 호출하여 활용
    protected void explainRamyeon() {
        if ("신라면".equals(name)) {
            System.out.println("신라면은 맵습니다....추가재료를 넣으면 괜찮아 질겁니다.");

            // 추가재료에 따른 추가 내용 처리
            if (addItemFlg) {
                System.out.println("추가재료를 넣으셨네요! 추가재료를 넣어서 덜 매워졌습니다.");
            }
        } else if ("안성탕면".equals(this.name)) {  // this 키워드는 자기자신의 객체를 가르킵니다.
            System.out.println("안성탕면은 무난합니다.");
        } else if ("삼양라면".equals(name)) {
            System.out.println("삼양라면은 무난합니다. 제가 제일 좋아하는 라면입니다!");
            if (addItemFlg) {
                System.out.println("역시 추가재료는 필수! 무조건 넣어서 먹어야해요");
            } else {
                System.out.println("삼양라면은 추가재료를 무조건 넣어주셔야 맛있습니다!! 꼭 넣어 드셔보세요");
            }
        }

    }
}
