package com.ibs.training.spring.Spring_Value_RequiredAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//    	System.out.println("beans.xml file is loaded");
    	Student student = context.getBean("stud", Student.class);
    	student.showDetailsInfo();
    }
}
