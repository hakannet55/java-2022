package models.db;

public class DataBaseConfModel {
    public String dbUrl;
    public String dbUser;
    public  String dbUserPass;


    public DataBaseConfModel(String url, String user, String pass) {
        this.dbUrl = url;
        this.dbUser = user;
        this.dbUserPass = pass;
    }
}
