package com.Page.controller;

import java.sql.*;

public class JdbcUtil {
    private static String driverClassName = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql:///jdbcdemo";
    private static String user = "root";
    private static String password = "1234";

    static {
        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConn() {

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection conn, Statement st,ResultSet rs) {
        try {
            if(rs != null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

            try {
                if(st != null){
                st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    if(conn != null){
                    conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
