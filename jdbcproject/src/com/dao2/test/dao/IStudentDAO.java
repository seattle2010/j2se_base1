package com.dao2.test.dao;

import com.dao2.test.domain.Student;

import java.util.List;

public interface IStudentDAO {
    void save(Student student);

    void delete(Long id);

    void update(Long id,Student student);

    Student get(Long id);

    List<Student> list();

}
