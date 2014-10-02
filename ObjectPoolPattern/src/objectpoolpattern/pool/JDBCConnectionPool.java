/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpoolpattern.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author eslem
 */
public class JDBCConnectionPool extends ObjectPool<Connection> {

    private String driver;
    private String url;
    private String user;
    private String dataBase;
    private String passwd;

    public JDBCConnectionPool(String driver, String url, String database, String usr, String passwd) {
        super();
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }
        this.driver = driver;
        this.url = url;
        this.user = usr;
        this.dataBase = "/" + database;
        this.passwd = passwd;
    }

    @Override
    protected Connection create() {
        try {
            return (DriverManager.getConnection(url + dataBase, user, passwd));
        } catch (SQLException e) {
            throw new RuntimeException(e.toString());
        }
    }

    @Override
    public boolean validate(Connection conection) {
        try {
            return (!((Connection) conection).isClosed());
        } catch (SQLException e) {
            throw new RuntimeException(e.toString());
        }
    }

    @Override
    public void expire(Connection connection) {
        try {
            ((Connection) connection).close();
        } catch (SQLException e) {
            throw new RuntimeException(e.toString());
        }
    }

}
