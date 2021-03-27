/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Home
 */
/*public class Data {
        public static void main(String args[]) {
        try {

            String dbServer = "jdbc:mysql://apontejaj.com:3306/Gisele_2018076?useSSL=false";
            String user = "Gisele_2018076";
            String password = "2018076";
            String query = "INSERT INTO table_name (column1, column2, column3, ...)\n" + "VALUES (value1, value2, value3, ...);";

            // Get a connection to the database
            Connection conn = DriverManager.getConnection(dbServer, user, password);

            // Get a statement from the connection
            Statement stmt = conn.createStatement();

            // Execute the query
            ResultSet rs = stmt.executeQuery(query);

            // Loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString("username") + "\t" + rs.getString("password"));
            }

            // Close the result set, statement and the connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            System.out.println("SQL Exception:");

            // Loop through the SQL Exceptions
            while (se != null) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());

                se = se.getNextException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
}
*/