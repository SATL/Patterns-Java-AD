/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpoolpattern;

import objectpoolpattern.pool.JDBCConnectionPool;
import java.sql.Connection;

/**
 *
 * @author eslem
 */
public class ObjectPoolPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306", "daw",
                "root", "");

        //creo 4 conexiones
        Connection con = pool.get();
        
        Connection con2 = pool.get();
        
        pool.close(con2);
        Connection con5 = pool.get();

        pool.close(con);
    }

}
