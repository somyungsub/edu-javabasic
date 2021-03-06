package homework.day03.cafe;

public class Coffee {
    private String name;    // 커피이름
    private int price;      // 커피가격

    public Coffee() {
    }

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "\t\t" + price;
    }
}
