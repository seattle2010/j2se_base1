package com.mysql.jdbc.DML;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//增删改操作
public class DMLTest {
    @Test
    public void testInsert() throws Exception {
        String sql = "INSERT INTO t_student (name,age)VALUES('tom',18)";
        //1 加载注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2获取连接对象
        Connection conn = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/jdbcdemo","root","1234");
        //3 创建语句对象
        Statement st = conn.createStatement();
        //4 执行sql
        int rows = st.executeUpdate(sql);
        System.out.println(rows);
        //5 关闭资源
        st.close();
        conn.close();
    }

    @Test
    public void testUpdate() throws Exception {
        String sql = "UPDATE t_student SET name = 'jack',age = 14 WHERE id = 1";
        //1 加载注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","1234");
        //3 创建语句对象
        Statement st = conn.createStatement();
        //4 执行sql
        int rows = st.executeUpdate(sql);
        System.out.println(rows);
        //5 关闭资源
        st.close();
        conn.close();
    }

    @Test
    public void testDelete() throws Exception {
        String sql = "DELETE FROM t_student WHERE id = 1";
        //1 加载注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","1234");
        //3 创建语句对象
        Statement st = conn.createStatement();
        //4 执行sql
        int rows = st.executeUpdate(sql);
        System.out.println(rows);
        //5 关闭资源
        st.close();
        conn.close();

    }


}
