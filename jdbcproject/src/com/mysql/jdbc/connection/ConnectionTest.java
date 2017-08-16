package com.mysql.jdbc.connection;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

//获取jdbc连接对象
public class ConnectionTest {
    @Test
    public void test1() throws Exception {
//    1加载注册驱动
        Class.forName("com.mysql.jdbc.Driver");
//        2获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","1234");
        Thread.sleep(1000);
    }
}
