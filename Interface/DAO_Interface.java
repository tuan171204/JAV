package Interface;

import DAO.connectDatabase;

import java.util.ArrayList;

public interface DAO_Interface<T> {
    connectDatabase connDB = new connectDatabase();

    ArrayList<T> getData();

    T getDataById(String id);

    boolean add(T entity);

    boolean update(T entity);

    boolean delete(String id);

    boolean hide(String id);

    boolean checkDuplicate(T entity, String Function);

    String generateID();
}
