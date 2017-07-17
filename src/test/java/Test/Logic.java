package Test;

import java.sql.SQLException;

/**
 * Created by azhilin on 24.01.2017.
 */
public class Logic {

    public void execute() throws ClassNotFoundException, SQLException {
        int id = 1;
        DAOFactory factory = DAOFactory.getInstance();

        UserDAO userDAO = factory.getUserDAO();
        UserDTO user = userDAO.getUserByID(id);
        System.out.println(user.getName());

    }

}
