package com.warpit.springdemo6.repo;

import org.springframework.data.repository.CrudRepository;

import com.warpit.springdemo6.domain.Student;

public interface StudentRepository  extends CrudRepository<Student,Integer>{

}
