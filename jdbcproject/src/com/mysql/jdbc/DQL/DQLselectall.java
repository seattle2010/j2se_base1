package com.mysql.jdbc.DQL;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//查询id为1的学生信息

/**
 * mysql> select * from t_student where id = 2;
 +----+------+-----+
 | id | name | age |
 +----+------+-----+
 |  2 | tom  |  18 |
 +----+------+-----+
 1 row in set
 */
public class DQLselectall {
    @Test
    public void testQueryAll() throws Exception {
        String sql = "select * from t_student where id = 2";

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","1234");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        if(rs.next()){
            long sid = rs.getLong("id");//列名字
            String sname = rs.getString("name");
            int sage = rs.getInt("age");
            System.out.println(sid+","+sname+","+sage);

        }
    }
    
    @Test
    public void testQueryNext() throws Exception {
        
    
    }
}
