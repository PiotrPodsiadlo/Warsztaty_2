package example1.dao;

public class GroupDao {
    private static final String CREATE_SOLUTION_QUERY =
            "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
    private static final String READ_SOLUTION_QUERY =
            "SELECT * FROM users where id = ?";
    private static final String UPDATE_SOLUTION_QUERY =
            "UPDATE users SET username = ?, email = ?, password = ? where id = ?";
    private static final String DELETE_SOLUTION_QUERY =
            "DELETE FROM users WHERE id = ?";
    private static final String FIND_ALL_SOLUTIONS_QUERY =
            "SELECT * FROM users";



}
