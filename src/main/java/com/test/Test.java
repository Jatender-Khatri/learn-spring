package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext context;

	public static void main(String args[])
	{
		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student s = (Student)context.getBean("student");
		s.display();
		s.run();
		System.out.println(s.toString());
	}
}
