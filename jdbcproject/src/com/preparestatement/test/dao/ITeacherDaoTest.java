package com.preparestatement.test.dao;

import com.preparestatement.test.dao.impl.TeacherDaoImpl;
import com.preparestatement.test.domain.Teacher;
import org.junit.Test;

import java.util.List;

public class ITeacherDaoTest {
    ITeacherDao dao = new TeacherDaoImpl();
    @Test
    public void save() throws Exception {
        Teacher teacher = new Teacher();
        teacher.setName("alex");
        teacher.setAge(12);
        dao.save(teacher);
    }
    @Test
    public void delete() throws Exception {
        dao.delete(4L);

    }

    @Test
    public void update() throws Exception {
        Teacher teacher = new Teacher();
        long id = 2L;
        teacher.setName("fukui");
        teacher.setAge(10);
        dao.update(id,teacher);
    }

    @Test
    public void get() throws Exception {
        Long id = 1L;
        System.out.println(dao.get(id));

    }

    @Test
    public void list() throws Exception {
        List<Teacher> alllist = dao.list();
for(Teacher ele:alllist){
    System.out.println(ele);
}
    }

}