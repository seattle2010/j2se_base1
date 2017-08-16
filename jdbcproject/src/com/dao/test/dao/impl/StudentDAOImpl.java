package com.dao.test.dao.impl;

import com.dao.test.damain.Student;
import com.dao.test.dao.IStudentDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class StudentDAOImpl implements IStudentDAO{
    @Override
    public void save(Student student) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Long id, Student newstudent) {

    }

    @Override
    public Student get(Long id) {
        String sql = "select * from t_student where id = "+id;
        //1:加载注册驱动
        //2 获取连接对象

        //3 创建语句对象

        //4 执行SQL

        //5 释放资源
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "1234");
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                Student stu = new Student();
                stu.setId(rs.getLong("id"));
                stu.setName(rs.getString("name"));
                stu.setAge(rs.getInt("age"));


//                long sid = rs.getLong("id");
//                String sname = rs.getString("name");
//                Integer sage = rs.getInt("age");
//                System.out.println(sid +"," + sname + "," + sage);

                return stu;
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(rs != null){
                rs.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }finally {
                try{
                    if(st != null){
                    st.close();
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }finally {
                    try{
                        if(conn != null){
                        conn.close();
                        }
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }

        return null;
    }

    @Override
    public List<Student> list() {
        return null;
    }
}
