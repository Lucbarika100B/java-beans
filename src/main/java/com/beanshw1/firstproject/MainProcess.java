package com.beanshw1.firstproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.beanshmw1.firstproject.entities.Employee;


public class MainProcess {
	
	public static void main(String args[]) {
		
		ApplicationContext context = new 
				FileSystemXmlApplicationContext("src/main/resources/beans.xml");
		
		Employee emp1 = context.getBean("emp1", Employee.class);
		Employee emp2 = context.getBean("emp2", Employee.class); 
		Employee emp3 = context.getBean("emp3", Employee.class);
		
		
		System.out.println(emp1); 
		System.out.println(emp2);
		System.out.println(emp3);
		
		
		
	}

}
