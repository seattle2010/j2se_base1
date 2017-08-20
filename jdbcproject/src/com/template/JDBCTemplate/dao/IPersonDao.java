package com.template.JDBCTemplate.dao;

import com.template.JDBCTemplate.domain.Person;

import java.util.List;

public interface IPersonDao {
    public void save(Person person);

    public void delete(Long id);

    public void update(Long id,Person person);

    public Person get(Long id);

    public List<Person> list();
}
