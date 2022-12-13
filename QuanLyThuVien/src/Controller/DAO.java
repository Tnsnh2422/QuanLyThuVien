/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
                    + "databaseName=QuanLySV;"
                    + "username=sa;password=123");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
   // đổ dữ liệu từ SQl vào list Thu viên
}
