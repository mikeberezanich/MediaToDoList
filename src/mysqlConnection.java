import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mysqlConnection {
    
    public Connection connection(String ip, String databaseName, String user, String pass, String port) throws SQLException{
        
        String url = "jdbc:mysql://" + ip + ":" + port + "/" + databaseName;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        Connection connection = DriverManager.getConnection(url, user, pass);

        return connection;
    }
    
}
