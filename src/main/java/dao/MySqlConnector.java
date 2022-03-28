package dao;

import Loggers.ILogger;

import java.sql.*;

public class MySqlConnector implements ILogger {

    public static Statement getConnection() throws Exception {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");
            return conn.createStatement();
        }catch (Exception ex){
            log.error("Failed to create Connection.....");
            throw new Exception(ex.getLocalizedMessage());
        }
    }
}
