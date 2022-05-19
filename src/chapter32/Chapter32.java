
package chapter32;

import java.sql.*;

public class Chapter32 {

    public static void main(String[] args) 
            throws SQLException, ClassNotFoundException {
        
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL");

    }
    
}
