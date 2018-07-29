package homework.day03.h02;

public class BookTest {
    public static void main(String[] args) {
        /*
            서로 다른 Book 객체를 생성 하고 각각의 정보를 출력 하는 프로그램을 작성 하시오.
                bookName    bookPrice(원)   bookDiscountRate(%)
                SQLPlus     50000           5.0
                Java 2.0    40000           3.0
                JSP Servlet 60000           6.0
         */
        Book[] books = new Book[3];
        books[0] = new Book("SQLPlus", 50000, 5.0);
        books[1] = new Book("Java 2.0", 40000, 3.0);
        books[2] = new Book("JSP Servlet", 60000, 6.0);

        System.out.println("책이름 \t\t 가격 \t\t 할인율 \t\t 할인후금액");
        System.out.println("----------------------------------------------");
//        for (int i = 0; i < books.length; i++) {
//            Book book = books[i];
//            System.out.println(book.getBookName() + " \t\t" + book.getBookPrice() + "원 \t\t" + book.getBookDiscountRate() +"% \t"+book.getDiscountBookPrice()+"원");
//        }
    }
}
