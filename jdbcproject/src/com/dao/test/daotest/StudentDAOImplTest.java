package com.dao.test.daotest;

import com.dao.test.damain.Student;
import com.dao.test.dao.IStudentDAO;
import com.dao.test.dao.impl.StudentDAOImpl;
import org.junit.Test;

public class StudentDAOImplTest {
    //依赖dao对象
    private IStudentDAO dao = new StudentDAOImpl();
    @Test
    public void save() throws Exception {

    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void get() throws Exception {
        Student stu = dao.get(1L);
        System.out.println(stu);
    }

    @Test
    public void list() throws Exception {
    }

}