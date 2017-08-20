package com.preparestatement.test.dao.impl;

import com.dao.test.damain.Student;
import com.preparestatement.test.dao.ITeacherDao;
import com.preparestatement.test.domain.Teacher;
import com.refactor.test.JdbcUtil.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeacherDaoImpl implements ITeacherDao {

    @Override
    public void save(Teacher teacher) {
        String sql = "INSERT INTO t_student (name,age) VALUES (?,?)";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
        conn = JdbcUtil.getconn();
        ps = conn.prepareStatement(sql);
        ps.setString(1,teacher.getName());
        ps.setLong(2,teacher.getAge());
        ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn,ps,null);
        }

    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM t_student WHERE id = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = JdbcUtil.getconn();
            ps = conn.prepareStatement(sql);
            ps.setLong(1,id);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void update(Long id, Teacher teacher) {
        String sql = "UPDATE t_student SET name = ? ,age = ? WHERE id = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = JdbcUtil.getconn();
            ps = conn.prepareStatement(sql);
            ps.setLong(3, id);
            ps.setString(1,teacher.getName());
            ps.setLong(2,teacher.getAge());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn,ps,null);
        }
    }

    @Override
    public Student get(Long id) {
        String sql = "SELECT * FROM t_student WHERE  id = ?";
            Connection conn = null;
            PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = JdbcUtil.getconn();
            ps = conn.prepareStatement(sql);
            ps.setLong(1,id);
            rs = ps.executeQuery();
            if(rs.next()){
//                long sid = rs.getLong("id");
//                String sname = rs.getString("name");
//                int sage = rs.getInt("age");
//                System.out.println(sid+","+sname+","+sage);
                Student student = new Student();
                student.setId(rs.getLong("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                return student;
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Teacher> list() {
        List<Teacher> list = new ArrayList<>();
        String sql = "SELECT * FROM t_student";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = JdbcUtil.getconn();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Teacher teacher = new Teacher();
                teacher.setId(rs.getLong("id"));
                teacher.setName(rs.getString("name"));
                teacher.setAge(rs.getInt("age"));

                list.add(teacher);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
