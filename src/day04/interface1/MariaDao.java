package day04.interface1;

public class MariaDao implements Dao {
    @Override
    public void insert() {
        System.out.println("구현");

    }

    @Override
    public void delete() {
        System.out.println("구현2");
    }
}
