package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String NAME = "root";
    private static final String PAS = "++++";
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    Connection connection = null;

    public static Connection getConnection() {
        try {
//            Connection connection = DriverManager.getConnection(URL, NAME, PAS);
//                System.out.println("успешно");
                return DriverManager.getConnection(URL, NAME, PAS);
            } catch(SQLException e){
                throw new RuntimeException(e);
            }
        }
    }
