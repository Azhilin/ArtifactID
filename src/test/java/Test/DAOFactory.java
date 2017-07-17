package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by azhilin on 24.01.2017.
 */
public class DAOFactory {
    Connection connection = null;
    private static DAOFactory instance;
    private UserDAO userDAO;
    private DAOFactory(Connection conn) {
        this.connection = conn;
    }

    public static DAOFactory getInstance() throws ClassNotFoundException, SQLException {
        if (instance == null) {
            Class.forName("org.postgresql.Driver");
            //new org.postgresql.Driver();
            String url = "jdbc:postgresql://127.0.0.1/my_first_db";
            Connection con = DriverManager.getConnection(url, "postgres", "password");
            instance = new DAOFactory(con);
        }
        return instance;
    }

    public UserDAO getUserDAO() {
        if(userDAO == null) {
            userDAO = new UserDAOImpl(connection);
        }
        return userDAO;
    }

}
