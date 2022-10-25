package database;

import java.sql.SQLException;
import java.util.List;

public interface IBaseDatabase {
    void init() throws SQLException;

    void add(String name) throws SQLException;

    void list() throws SQLException;
    void remove();

    List<String> listGet() throws SQLException;
}
