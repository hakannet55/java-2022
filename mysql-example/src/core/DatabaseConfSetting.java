package core;

import models.db.DataBaseConfModel;

public class DatabaseConfSetting {
    public DataBaseConfModel getDbConf() {
        String dbPath = "jdbc:mysql://localhost:3306/sample";
        String userName = "root";
        String userPass = "";
        return new DataBaseConfModel(dbPath, userName, userPass);
    }
}
