package com.warpit.springdemo6.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Department of study at the University
 * @author stefa
 *
 *Specifies a many-valued association with one-to-many multiplicity.
 * 
 * If the collection is defined using generics to specify the  element type,
 * the associated target entity type need not be specified; otherwise the target entity class must be specified.
 * If the relationship is bidirectional, the  <code> mappedBy</code> element must be used to specify the relationship field or
 * property of the entity that is the owner of the relationship.
 *
 * <p> The <code>OneToMany</code> annotation may be used within an embeddable class
 * contained within an entity class to specify a relationship to a
 * collection of entities. If the relationship is bidirectional, the
 * <code> mappedBy</code> element must be used to specify the relationship field or
 * property of the entity that is the owner of the relationship.
 *
 * When the collection is a <code>java.util.Map</code>, the <code>cascade</code> 
 * element and the <code>orphanRemoval</code> element apply to the map value.
 *
 */
@Entity
@Table(name="DEPARTMENT")
public class Department {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	
	@Column
	private String name;
	
	@OneToMany(mappedBy="department",fetch=FetchType.EAGER ,cascade=CascadeType.ALL)
	private List<Course> courses = new ArrayList<>();  //list of courses that are in the Department

	public Department(String name) {
		super();
		this.name = name;
	}
	
	
	protected Department() {
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", courses=" + courses + "]";
	}


	
	

}
