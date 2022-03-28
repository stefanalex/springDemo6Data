package com.warpit.springdemo6.repo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.warpit.springdemo6.domain.Department;

@DataJpaTest
class DepartmentRepositoryTest {
	
	@Autowired
	private DeparmentRepository deparmentRepository;

	 @Test
	    public void injectedComponentsAreNotNull(){
		        assertThat(deparmentRepository).isNotNull();
	    }
	
	@Test
	void runJpaRepositoryMethods() {
		
		deparmentRepository.save(new Department("Humanities"));
		deparmentRepository.flush();
		
		deparmentRepository.saveAndFlush(new Department("Fine Arts"));
		
		deparmentRepository.save(new Department("Social Science"));
		
		System.out.println("*******Departments*********");
		
		deparmentRepository.findAll().forEach(System.out::println);
	}

}
