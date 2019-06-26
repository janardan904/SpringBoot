package com.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
