package database;

import com.mysql.jdbc.Connection;
import core.utils;
import models.db.DataBaseConfModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SqlDataBase implements IBaseDatabase {
    DataBaseConfModel conf;
    Connection con;
    Statement state;

    public SqlDataBase(DataBaseConfModel conf) throws SQLException {
        this.conf = conf;
        this.init();
    }

    @Override
    public void init() throws SQLException {
        // DB initialize
        utils.print("db.init");
        this.con = (Connection) DriverManager.getConnection(this.conf.dbUrl, this.conf.dbUser, this.conf.dbUserPass);
        this.state = con.createStatement();
    }

    @Override
    public void add(String name) throws SQLException {
        utils.print("db.add");
        PreparedStatement prepareStatement = this.con.prepareStatement("INSERT INTO person (name) VALUES ('"+ name +"')");
        prepareStatement.execute();
        // resultSet.next();
    }

    @Override
    public void list() throws SQLException {
        utils.print("db.list");
        ResultSet resultSet = this.state.executeQuery("select * from person");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("id") + "-" + resultSet.getString("name"));
        }
    }

    @Override
    public void remove() {

    }

    @Override
    public List<String> listGet() throws SQLException {
        List<String> result= new ArrayList<>();

        ResultSet resultSet = this.state.executeQuery("select * from person");
        while (resultSet.next()) {
            result.add( resultSet.getString("id") + "-" + resultSet.getString("name"));
        }
        return result;
    }
}
