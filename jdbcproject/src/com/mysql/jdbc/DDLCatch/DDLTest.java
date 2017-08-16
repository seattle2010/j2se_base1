package com.mysql.jdbc.DDLCatch;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DDLTest {
    @Test
    public void testCreateTable() throws Exception {
        String sql = "CREATE TABLE t_student3(id BIGINT PRIMARY KEY AUTO_INCREMENT,name VARCHAR(20),age INT);";
        //1 加载注册驱动
        //Class.forName("com.mysql.jdbc.Driver");
        //2 获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","1234");
        //3 创建语句对象
        Statement st = conn.createStatement();
        //4执行sql语句
        int rows = st.executeUpdate(sql);
        System.out.println(rows);
        //5 释放资源
//        st.close();
//        conn.close();
    }
}
