package business;

import core.utils;
import database.IBaseDatabase;
import database.SqlDataBase;

import java.sql.SQLException;
import java.util.List;

public class ServiceManager {

    public void ServiceManager() {

    }

    public void start(IBaseDatabase db) throws SQLException {
        utils.print("ServiceManager::");

        db.list();

        // db.add("test-2");

        List<String> list = db.listGet();
        utils.print(String.valueOf(list.size()));
        System.out.println(list);

    }
}
