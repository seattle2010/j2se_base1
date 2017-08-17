package com.dao2.test.daotest;

import com.dao2.test.dao.IStudentDAO;
import com.dao2.test.dao.domain.StudentDAOImpl;
import com.dao2.test.domain.Student;
import org.junit.Test;

import java.util.List;

public class IStudentDAOTest {
    IStudentDAO dao = new StudentDAOImpl();
    @Test
    public void save() throws Exception {
        Student student = new Student();
        student.setName("mark");
        student.setAge(12);
        dao.save(student);
    }

    @Test
    public void delete() throws Exception {
        dao.delete(5L);
    }

    @Test
    public void update() throws Exception {
        Student student = new Student();
        student.setName("june");
        student.setAge(12);
        dao.update(4L,student);
    }

    @Test
    public void get() throws Exception {
        Student stu = dao.get(1L);
        System.out.println(stu);
    }

    @Test
    public void list() throws Exception {
        List<Student> list = dao.list();
        for(Student ele:list){
            System.out.println(ele);
        }
    }

}