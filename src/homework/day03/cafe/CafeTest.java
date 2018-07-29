package homework.day03.cafe;

public class CafeTest {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.setCoffee(new Coffee("Americano", 4000));
        cafe.setCoffee(new Coffee("Cafelatte", 5000));
        cafe.setCoffee(new Coffee("Macchiato", 6000));

        for (Coffee coffee: cafe.getCoffeeList()) {
            System.out.println(coffee.toString());
        }

        System.out.println("Coffee 가격의 합 : " + cafe.totalPrice() + "원");
    }
}
