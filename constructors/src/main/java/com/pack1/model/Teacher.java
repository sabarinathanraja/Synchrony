package com.pack1.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Teacher {
	@Autowired
	@Qualifier("a1")
	private Student student;
	
	private String teacherName;
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public Teacher(){}

	public Teacher(Student student, String teacherName) {
		super();
		this.student = student;
		this.teacherName = teacherName;
	}
	
	public void display(){
		System.out.println(student.getName());
	}
	@PostConstruct
	public void init(){
		System.out.println("Init method");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("destroy method");
	}
}
