package jdbc;

import org.junit.Test;

import java.sql.*;

public class JdbcCreatTest {
//    @Test
//    public void test() throws Exception {
////        String sql = "CREATE TABLE t_student3(id BIGINT PRIMARY KEY AUTO_INCREMENT,name VARCHAR(20),age INT);";
//
////        1):加载注册驱动.
//        Class.forName("com.mysql.jdbc.Driver");
//
////        2):获取连接对象.
////                使用jdbc的类,完成对mysql数据库的连接
//        Connection conn = DriverManager.getConnection
// ("jdbc:mysql://localhost:3306/jdbcdemo","root","1234");
////        3):创建/获取语句对象
////        通过连接对象获取对sql语句的执行者对象
//        Statement st = conn.createStatement();
////        4):执行SQL语句
////                使用执行者对象,向数据库执行sql语句,返回处理结果
//        int i = st.executeUpdate(sql);
//        System.out.println(i);
////        5):释放资源
//        st.close();
//        conn.close();
//    }
    @Test
    public void testInsert() {
        String sql = "SELECT count(id) FROM t_student";
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {

            //1. 加载注册驱动  //java的反射机制 获得一个类的所有信息  1.6开始 改成自动加载
//            Class.forName("com.mysql.jdbc.Driver");
            //2 获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///jdbcdemo", "root", "1234");
            //3创建语句对象
            st = conn.createStatement();
            //4 执行SQl语句
            rs = st.executeQuery(sql);
            while (rs.next()) {
                long sid = rs.getLong("id");
                String sname = rs.getString("name");
                int sage = rs.getInt("age");
                System.out.println(sid + "," + sname + "," + sage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //5 释放资源  从java1.6开始自动关闭资源
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
}
