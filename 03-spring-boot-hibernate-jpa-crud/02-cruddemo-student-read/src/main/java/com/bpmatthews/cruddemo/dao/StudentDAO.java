package com.bpmatthews.cruddemo.dao;

import com.bpmatthews.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

}
