package com.mysql.jdbc.DQL;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//查询学生总数
public class DQLTest {
    /**
     * mysql> SELECT count(id) FROM t_student;
     +-----------+
     | count(id) |
     +-----------+
     |         1 |
     +-----------+
     1 row in set
     *
     */
    @Test
    public void testDQL() throws Exception {
        String sql = "SELECT count(id) FROM t_student";
    //1 加载注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2 获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","1234");
        //3创建语句对象
        Statement st = conn.createStatement();
        //4执行sql          !!!!!此处不同
        ResultSet rs = st.executeQuery(sql);
//        rs.getLong(INT)类型 表示列 从第一列开始 不是0开始
        // rs.getLong(String)类型 表示列名  可以用别名
if(rs.next()){
    long total = rs.getLong(1);
    System.out.println(total);
    //        rs.getLong("count(id)");
//        rs.getLong("count");//别名 写在sql中
}

        //释放资源
        st.close();
        conn.close();
    }
}
