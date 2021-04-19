
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 40757
 */
public class DatabaseClient {
    private static DatabaseClient single_instance = null;
    Connection conn = null;
    
    private DatabaseClient() throws SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        try {
            conn = DriverManager.getConnection(url, "STUDENT", "STUDENT");
        } catch (SQLException e) {
            System.err.println("Cannot connect to DB: " + e);
        } finally {
            if (conn != null) {
                System.out.println("Connected!");
                //conn.close();
            }
        }
    }
    
    public Connection getConnection() {
        return conn;
    }
    
     public static DatabaseClient getInstance() throws SQLException
    {
        if (single_instance == null)
            single_instance = new DatabaseClient();
  
        return single_instance;
    }
}
