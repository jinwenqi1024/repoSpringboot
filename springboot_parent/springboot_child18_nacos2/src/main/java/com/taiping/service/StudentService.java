package com.taiping.service;

import com.taiping.entity.Student;

import java.util.List;

/**
 * @Author jinwenqi
 * @Date 10:34 2019/6/28
 * @Project SpringBoot
 * @Description
 **/
public interface StudentService {

    Student save(Student student);

    Student findById(String id);

    List<Student> findAll();
}
