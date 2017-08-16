package com.dao.test.dao;

import com.dao.test.damain.Student;

import java.util.List;

/**
 * 保存学生对象的crud操作
 */
public interface IStudentDAO {
    /**
     * 保存学生对象
     * @param student 学生对象
     */
    void save(Student student);

    /**
     * 删除指定学生对象
     * @param id 被删除的学生主键
     */
    void delete(Long id);

    /**
     * 修改指定id的学生对象信息
     * @param id 被修改学生对象的主键
     * @param newstudent 新的学生对象信息
     */
    void update(Long id ,Student newstudent);

    /**
     * 查询指定id的学生对象
     * @param id 指定的id
     * @return 如果存在该id 则返回该id对应的学生对象 否则返回null
     */
    Student get(Long id);

    /**
     *  查询所有学生对象
     * @return 所有的学生对象,如果没有学生 则返回空集
     */
    List<Student> list();
}
