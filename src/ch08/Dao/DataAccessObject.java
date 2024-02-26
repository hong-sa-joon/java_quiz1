package ch08.Dao;

public interface DataAccessObject {

    void run();

    void select();
    void update();
    void delete();
    void insert();
}
