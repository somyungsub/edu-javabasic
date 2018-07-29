package homework.day03.cafe;

public class Cafe {
    private Coffee[] coffeeList;    // 커피배열
    private int index;              // 커피의 위치포인터 -> index

    public Cafe() {
        /*
            int형인 index는 초기화를 안할 경우 0으로 자동 초기화가 되며, 객체는 null 입니다. 배열도 객체이므로 현재는 null이므로
            반드시 초기화하는 습관을 갖으시기 바랍니다.
         */
        this.coffeeList = new Coffee[3]; // 현재는 3이라고 정했지만 매개변수로 size를 받는게 좋습니다.
        this.index = 0; // int형은 자동0으로 초기화가 되지만 항상 초기화하는 습관을 갖으셔야합니다.
    }

    public void setCoffee(Coffee coffee) {
        if (index >= 3) {
            System.out.println("더 이상 저장 할 수 없습니다");
            return;
        }

        coffeeList[index++] = coffee;
    }

    public int totalPrice() {
        int sumTotalPrice = 0;

        // foreach (향상된 for문) 기억나시나요? 까먹으셨으면 여기서 한번 더 복습하겠습니다. 순차탐색을 할 경우 자주 쓰입니다.
        for (Coffee coffee : coffeeList) {
            sumTotalPrice += coffee.getPrice();
        }

        return sumTotalPrice;
    }

    public Coffee[] getCoffeeList() {
        return coffeeList;
    }
}
