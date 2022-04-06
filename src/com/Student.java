package com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String lastName;
	
	@OneToMany
	private List<Course> courses = new ArrayList<Course>();


	
	public Integer getId() {
		return id;
	}

	private void setId(Integer id) {
		this.id = id;
	}

	public Student(String name, String lastName, List<Course> courses) {
		this.name = name;
		this.lastName = lastName;
		this.courses = courses;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public List<Course> getCourses() {
		return courses;
	}


	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	

}
