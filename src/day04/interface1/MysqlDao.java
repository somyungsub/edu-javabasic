package day04.interface1;

public class MysqlDao implements Dao {

    @Override
    public void insert() {
        System.out.println("MysqlDao insert~~");
    }

    @Override
    public void delete() {
        System.out.println("MysqlDao delete~~");
    }
}
