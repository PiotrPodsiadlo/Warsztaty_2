package example1.dao;

public class UserDao {

    private final String URL =
            "jdbc:mysql://localhost:3306/project2?useSSL=false&characterEncoding=utf8&serverTimezone=CET";
    private final String USER = "root";
    private final String PASSWORD = "coderslab";

    private static final String CREATE_USER_QUERY =
            "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
    private static final String READ_USER_QUERY =
            "SELECT * FROM users where id = ?";
    private static final String UPDATE_USER_QUERY =
            "UPDATE users SET username = ?, email = ?, password = ? where id = ?";
    private static final String DELETE_USER_QUERY =
            "DELETE FROM users WHERE id = ?";
    private static final String FIND_ALL_USERS_QUERY =
            "SELECT * FROM users";



}
