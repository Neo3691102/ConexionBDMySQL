package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {
    public MysqlConnection() throws ClassNotFoundException {
        //Class.forName("com.mysql.jdbc.Driver");
    }

    public Connection getConnection(String url, String user, String password) throws SQLException {
        return  DriverManager.getConnection(url, user, password);
    }
}
