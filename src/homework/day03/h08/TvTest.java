package homework.day03.h08;

public class TvTest {
    public static void main(String[] args) {
        Tv tvArray[] = new Tv[3];
        tvArray[0] = new Tv("INFINIA", 1500000, "LED TV");
        tvArray[1] = new Tv("XCANVAS", 1000000, "LCD TV");
        tvArray[2] = new Tv("CINEMA", 2000000, "3D TV");

        // 정보출력
        for (int i = 0; i < tvArray.length; i++) {
            System.out.println(tvArray[i].toString());
        }

        // 가격이 가장 비싼 제품, 가격이 가장 저렴한 제품
        Tv minPriceTv = tvArray[0];
        Tv maxPriceTv = tvArray[0];

        for (int i = 0; i < tvArray.length; i++) {
            Tv tv = tvArray[i];
            if (minPriceTv.getPrice() > tv.getPrice()) {
                minPriceTv = tv;
            }

            if (maxPriceTv.getPrice() < tv.getPrice()) {
                maxPriceTv = tv;
            }
        }

        System.out.println("가격이 가장 비싼 제품 : " + maxPriceTv.getName());
        System.out.println("가격이 가장 저렴한 제품 : " + minPriceTv.getName());
    }
}
