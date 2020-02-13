package com.pack1.model;


import org.springframework.beans.factory.annotation.Required;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student{
	private String name;
	private int age;
	public Student()
	{}
	public int getAge() {
		return age;
	}
	
	@Required
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	


}
