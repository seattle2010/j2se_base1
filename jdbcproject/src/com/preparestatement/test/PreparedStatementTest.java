package com.preparestatement.test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

//可以这里先写一个statement例子
public class PreparedStatementTest {

    @Test
    public void testSave() throws Exception {
        String sql = "INSERT INTO t_student (name,age) VALUES (?,?)";
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = JdbcUtil.getconn();
            ps = conn.prepareStatement(sql);
            ps.setString(1,"mike");
            ps.setInt(2,18);
            ps.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn,ps,null);
        }
    }

    //=======================================================================
//SQL注入案例   登陆检查
    @Test
    public void testLoginByStatement() throws Exception {
        //String sql = "SELECT *  FROM t_student WHERE name = 'admin' AND age = 12";
        String sql = "SELECT *  FROM t_student WHERE name = '' OR 1=1 OR '' AND age = 11111";
        Connection conn = JdbcUtil.getconn();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        if (rs.next()) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败"); 
        }
JdbcUtil.close(conn,st,rs);
    }

    @Test
    public void test() throws Exception {
        String sql = "SELECT *  FROM t_student WHERE name = ? AND age = ?";

        Connection conn = JdbcUtil.getconn();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,"admin");  //' OR 1=1 OR '
        ps.setInt(2,12);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败");
        }
        JdbcUtil.close(conn,ps,rs);
    }
}


