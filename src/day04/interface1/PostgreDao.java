package day04.interface1;

public class PostgreDao implements Dao{
    public void insert() {
        System.out.println("PostgreDao insert~~");
    }

    public void delete() {
        System.out.println("PostgreDao delete~~");
    }
}
