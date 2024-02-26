package ch08.Dao;

public class MySqlDao implements DataAccessObject{
    @Override
    public void select() {
        System.out.println("MuSql에서 검색");
    }

    @Override
    public void update() {
        System.out.println("MuSql에서 수정");
    }

    @Override
    public void delete() {
        System.out.println("MuSql에서 삭제");
    }

    @Override
    public void run() {


    }

    @Override
    public void insert() {
        System.out.println("MuSql에서 삽입");

    }
}
