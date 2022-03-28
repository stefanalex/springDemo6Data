package com.warpit.springdemo6.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Course offerd at the University
 * @author stefa
 *
 */

@Entity
@Table(name="COURSE")
public class Course {

	 @Id
	 @GeneratedValue
	 private Integer id;
	 
	 @Column
	 private String name;
	 
	 @ManyToOne(cascade=CascadeType.ALL)
	 @JoinColumn
	 private Department department;  //that the course is in 
	 
	/* Specifies a column for joining an entity association or elementcollection.
	 *  If the JoinColumn annotation itself isdefaulted, 
	 *  a single join column is assumed and the default valuesapply. 
	   Example:

	   @ManyToOne
	   @JoinColumn(name="ADDR_ID")
	   public Address getAddress() { return address; }


	   Example: unidirectional one-to-many association using a foreign key mapping
	 
	   // In Customer class
	   @OneToMany
	   @JoinColumn(name="CUST_ID") // join column is in table for Order
	   public Set<Order> getOrders() {return orders;}
*/


	 
	 
	


	protected Course() {
		 
	 }


	public Course(String name, Department department) {
		super();
		this.name = name;
		this.department = department;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", department=" + department + "]";
	}


	
	
	
	
}
