package example1.dao;

public class GroupDao {
    private static final String CREATE_GROUP_QUERY =
            "INSERT INTO user_groups(name) VALUES (?)";
    private static final String READ_GROUP_QUERY =
            "SELECT * FROM user_groups where id = ?";
    private static final String UPDATE_GROUP_QUERY =
            "UPDATE user_groups SET name = ?, where id = ?";
    private static final String DELETE_SOLUTION_QUERY =
            "DELETE FROM user_groups WHERE id = ?";
    private static final String FIND_ALL_SOLUTIONS_QUERY =
            "SELECT * FROM user_groups";



}
