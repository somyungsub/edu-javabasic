package day04.interface1;

public class OracleDao implements Dao{

    public void insert() {
        System.out.println("OracleDao insert~~");
    }

    public void delete() {
        System.out.println("OracleDao delete~~");
    }
}
