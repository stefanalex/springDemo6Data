package com.warpit.springdemo6.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * encapsulates and individual's first and last name.
 * 
 * Specifies a class whose instances are stored as an intrinsicpart of an owning entity and share the identity of the entity.
 * Each of the persistent properties or fields of the embeddedobject is mapped to the database table for the entity.
 * Note that the Transient annotation may be used todesignate the non-persistent state of an embeddable class.
  * 
 * @author stefa
 *
 */

@Embeddable
public class Person {

	@Column
	private String firstName;
	
	@Column
	private String lastName;

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	protected Person() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	
	
	
}
