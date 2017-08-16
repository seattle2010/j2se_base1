package com.mysql.jdbc.DDLCatch;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DDLtrycatch {
    @Test
    public void testCreateTable() throws Exception {
        String sql = "CREATE TABLE t_student4(id BIGINT PRIMARY KEY AUTO_INCREMENT,name VARCHAR(20),age INT);";
    //1.加载注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2 获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","1234");
        //3 创建获取语句
        Statement st = conn.createStatement();
        //4 执行sql语句
        st.executeUpdate(sql);
        //5 释放资源
        st.close();
        conn.close();
    }

    @Test
    public void test(){
        String sql = "CREATE TABLE t_student5(id BIGINT PRIMARY KEY AUTO_INCREMENT,name VARCHAR(20),age INT);";
        Connection conn = null;
        Statement st = null;
        try{
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","1234");
         st = conn.createStatement();
            //4 执行sql语句
            st.executeUpdate(sql);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(st !=null){
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
