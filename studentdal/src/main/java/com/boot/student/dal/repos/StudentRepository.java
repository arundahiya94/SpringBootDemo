package com.boot.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.boot.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
