package homework.day03.h02;

public class Book {
    private String bookName;
    private int bookPrice;
    private double bookDiscountRate;

    public Book() {
    }

    public Book(String bookName, int bookPrice, double bookDiscountRate) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookDiscountRate = bookDiscountRate;
    }

    // 인하된 책 가격
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public double getBookDiscountRate() {
        return bookDiscountRate;
    }

    public void getDiscountBookPrice(double bookDiscountRate) {
        this.bookDiscountRate = bookDiscountRate;
    }
}
