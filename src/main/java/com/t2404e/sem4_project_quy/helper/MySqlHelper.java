package com.t2404e.sem4_project_quy.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlHelper {
    private static final String DATABASE_HOST = "jdbc:mysql://localhost:3306/";
    private static final String DATABASE_NAME = "player_evaluation";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "";
    private static Connection connection;

    public static Connection getConnection() {
        if(connection == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection =
                        DriverManager.getConnection(
                                DATABASE_HOST + DATABASE_NAME,
                                DATABASE_USERNAME,
                                DATABASE_PASSWORD);
                System.out.println("Mở kết nối thành công đến mysql.");
            } catch (SQLException | ClassNotFoundException e) {
                System.err.println(e.getMessage());
                System.err.println("Không thể kết nối database.");
            }
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            System.err.println("Không thể đóng kết nối đến database.");
        }
    }
}
