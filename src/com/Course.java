package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Course {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	private String name;
	
	@OneToOne
	private Teacher teacher;

	

	public Course(String name, Teacher teacher) {
		this.name = name;
		this.teacher = teacher;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	

}
