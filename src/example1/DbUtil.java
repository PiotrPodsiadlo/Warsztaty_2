package example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

    private static final String URL =
            "jdbc:mysql://localhost:3306/codingschool?useSSL=false&characterEncoding=utf8&serverTimezone=CET";
    private static final String USER = "root";
    private static final String PASSWORD = "coderslab";

    public static Connection getConnection() throws SQLException{
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD );
        return connection;
    }
}
