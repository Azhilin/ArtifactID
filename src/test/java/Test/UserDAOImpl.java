package Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 * Created by azhilin on 24.01.2017.
 */
public class UserDAOImpl implements UserDAO {
    Connection connection;
    final String sql = "SELECT * FROM my_users WHERE id = ?";

    public UserDAOImpl(Connection connection) {
        super();
        this.connection = connection;
    }

    public UserDTO getUserByID(int id) throws SQLException {
        UserDTO user = null;
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1 , id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            user = new UserDTO(resultSet.getInt(id), resultSet.getString("name"), resultSet.getString("surname"));

        }
        return user;
    }

}
