package ch08.Dao;

public class OracleDao implements DataAccessObject{
    @Override
    public void select() {
        System.out.println("DB에서 검색");
    }

    @Override
    public void update() {
        System.out.println("DB에서 수정");
    }

    @Override
    public void delete() {
        System.out.println("DB에서 삭제");
    }

    @Override
    public void run() {


    }

    @Override
    public void insert() {
        System.out.println("DB에서 삽입");

    }
}
