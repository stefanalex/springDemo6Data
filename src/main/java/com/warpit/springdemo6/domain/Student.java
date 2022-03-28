package com.warpit.springdemo6.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {

	@Id
	@GeneratedValue
	private Integer studentId;
	
	@Column
	private boolean fullTime;
	
	@Column
	private Integer age;
	
	@Embedded
	private Person attendee;   //person that has First and Last name of the student
	
	
	@OneToMany
	private List<Course> courses = new ArrayList<>();



	protected Student() {
		
	}

	public Student(Person attendee, boolean fullTime, int age) {
		this.fullTime = fullTime;
		this.age = age;
		this.attendee = attendee;
		
		courses = new ArrayList<>();
	}

	public boolean isFullTime() {
		return fullTime;
	}

	public void setFullTime(boolean fullTime) {
		this.fullTime = fullTime;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Person getAttendee() {
		return attendee;
	}

	public void setAttendee(Person attendee) {
		this.attendee = attendee;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fullTime=" + fullTime + ", age=" + age + ", attendee=" + attendee
				+ ", courses=" + courses + "]";
	}
	
	
	
	
}
