/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fees_management_system;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ankul
 */
public class DBConnection {
    public static Connection getmysqlConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fees_management_system","root","2868");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
