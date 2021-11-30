package JDBC;

/*Write a java program that establishes a connection to mysql  database successfully. If the connection is successful,
 it should display a message “Connection Established successfully”. In case, it is not able to do so due to any exception,
  it should display the message “Connection could  not be established “. If there is an exception, it should also display
   the description of the exception.
 */

import java.sql.*;

public class Q15 {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/list", "root", "");
            System.out.println("Connection established successfully");
        }
        catch (Exception e){
            System.out.println("Connection could not be established");
        }
        finally {
            if(con != null){
                con.close();
            }
        }
    }
}