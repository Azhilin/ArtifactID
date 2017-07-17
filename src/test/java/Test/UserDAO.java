package Test;

import java.sql.SQLException;

/**
 * Created by azhilin on 24.01.2017.
 */
public interface UserDAO {
    UserDTO getUserByID(int id) throws SQLException;

}
