package Test;

import java.sql.SQLException;

/**
 * Created by azhilin on 24.01.2017.
 */
public class DAOTestMain {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Logic logic = new Logic();
        logic.execute();
    }

}