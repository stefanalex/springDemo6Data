package com.warpit.springdemo6.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warpit.springdemo6.domain.Department;

/**
 * all features of CrudRepository plus
 * void flush()
 * Deparment saveAndFlush(Department department)
 * void deleteInBatch(Iterable<Department> iterable);
 * void deleteAllInBatch()
 * 
 * 
 * Benefits :
 *  No need to access EntityManagerFactory 
 *  
 *  @PersistenceUnit
 *  EntityManagerFactory emf;
 *  
 *  
 *  Differentiate from other data repositories
 * 
 * 
 * 
 * 
 * 
 * @author stefa
 *
 */
public interface DeparmentRepository extends JpaRepository<Department,String>{

}
