package com.preparestatement.test.dao;

import com.dao.test.damain.Student;
import com.preparestatement.test.domain.Teacher;

import java.util.List;

public interface ITeacherDao {
    void save(Teacher teacher);

    void delete(Long id);

    void update(Long id, Teacher teacher);

    Student get(Long id);

    List<Teacher> list();
}
