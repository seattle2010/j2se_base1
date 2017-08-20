package com.dao2.test.dao.domain;

import com.dao2.test.JdbcUtil;
import com.dao2.test.dao.IStudentDAO;
import com.dao2.test.domain.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements IStudentDAO {

    @Override
    public void save(Student student) {
        String sname = student.getName();
        Integer sage = student.getAge();

//        INSERT INTO t_student4(name,age)VALUES ('XXX',11)
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO t_student4(name,age)VALUES (");
        sql.append("'").append(student.getName()).append("'");
        sql.append(",").append(student.getAge());
        sql.append(")");
        System.out.println(sql); 
        Connection conn = null;
        Statement st = null;
        try {
            //1 加载注册驱动
            //2 创建连接对象
            conn = JdbcUtil.getConn();
            //3 获取语句对象
            st = conn.createStatement();
            //4执行sql语句
            st.executeUpdate(String.valueOf(sql));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn,st,null);
        }
    }

    @Override
    public void delete(Long id) {
String sql = "DELETE FROM t_student WHERE id = "+id;
    }

    @Override
    public void update(Long id,Student student) {
//     UPDATE t_student SET name = 'XX',age = 11 WHERE id = 1
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE t_student SET name = ");
    }

    @Override
    public Student get(Long id) {
        String sql = "SELECT * from t_student4 WHERE id ="+id;
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
        //1 加载注册驱动
        //2 创建连接对象
        conn = JdbcUtil.getConn();
        //3 获取语句对象
            st = conn.createStatement();
            //4执行sql语句
            rs = st.executeQuery(sql);
        if(rs.next()){
        Student stu = new Student();
        stu.setId(rs.getLong("id"));
        stu.setName(rs.getString("name"));
        stu.setAge(rs.getInt("age"));

        return stu;
        }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn,st,rs);
        }
        return null;
    }

    @Override
    public List<Student> list() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * from t_student4";
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            //1 加载注册驱动
            //2 创建连接对象
            conn = JdbcUtil.getConn();
            //3 获取语句对象
            st = conn.createStatement();
            //4执行sql语句
            rs = st.executeQuery(sql);
            while(rs.next()){
                Student stu = new Student();
                stu.setId(rs.getLong("id"));
                stu.setName(rs.getString("name"));
                stu.setAge(rs.getInt("age"));
                list.add(stu);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn,st,rs);
        }
        return list;
    }
    }

