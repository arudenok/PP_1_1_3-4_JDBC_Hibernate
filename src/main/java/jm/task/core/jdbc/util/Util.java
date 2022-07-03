package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String NAME = "root";
    private static final String PAS = "++++";
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static Connection connection;

    public static Connection getConnection() {
        try {
//            Connection connection = DriverManager.getConnection(URL, NAME, PAS);
//                System.out.println("успешно");
            return DriverManager.getConnection(URL, NAME, PAS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection closeConnection() {
        try {
            getConnection().close();
//            System.out.println("закрыто");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

}
