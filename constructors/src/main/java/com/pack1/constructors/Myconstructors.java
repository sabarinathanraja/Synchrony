package com.pack1.constructors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pack1.model.Teacher;


public class Myconstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context=new FileSystemXmlApplicationContext("conbean.xml");
		//context.getBean(arg0)
		Teacher e=(Teacher)context.getBean("a2");
		//e.setTeacherName("Mak");
		e.display();
		System.out.println(e.getStudent().getAge());
		System.out.println(e.getStudent().getName());
		System.out.println(e.getTeacherName());
		context.close();

	}

}
