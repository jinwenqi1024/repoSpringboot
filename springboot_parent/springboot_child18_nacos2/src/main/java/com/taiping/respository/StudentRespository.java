package com.taiping.respository;

import com.taiping.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author jinwenqi
 * @Date 10:32 2019/6/28
 * @Project SpringBoot
 * @Description
 **/
public interface StudentRespository extends JpaRepository<Student, String> {

    Student findById(String id);
}
