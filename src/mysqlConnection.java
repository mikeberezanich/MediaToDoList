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
 * @author mike
 */
public class mysqlConnection {
    
    public Connection connection(String ip, String databaseName, String user, String pass, String port) throws SQLException{
        
//        String url = "jdbc:mysql://hoolahanphotography.com:3306/mediatodolist";
//        String username = "mediauser";
//        String password = "mediapass";
        String url = "jdbc:mysql://" + ip + ":" + port + "/" + databaseName;
        
        Connection connection = DriverManager.getConnection(url, user, pass);

        return connection;
    }
    
}
