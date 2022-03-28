package com.warpit.springdemo6.repo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.warpit.springdemo6.domain.Person;
import com.warpit.springdemo6.domain.Student;

@DataJpaTest
class StudentRepositoryTest {

	@Autowired
	StudentRepository studentRepository;
	
	@Test
	void simpleStudentCrudExample() {
		boolean fullTime = true;
		studentRepository.save(new Student(new Person("jane","doe"),fullTime,20));
		studentRepository.save(new Student(new Person("john","doe"),fullTime,22));
		studentRepository.save(new Student(new Person("mike","smith"),fullTime,18));
		
		System.out.println("******Original Students********");
		studentRepository.findAll().forEach(System.out::println);
	}

}
