import business.ServiceManager;
import core.DatabaseConfSetting;
import core.utils;
import database.IBaseDatabase;
import database.SqlDataBase;
import models.db.DataBaseConfModel;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // start main method
        utils.print("main::");

        IBaseDatabase db = new SqlDataBase(new DatabaseConfSetting().getDbConf());

        new ServiceManager().start(db);

    }
}