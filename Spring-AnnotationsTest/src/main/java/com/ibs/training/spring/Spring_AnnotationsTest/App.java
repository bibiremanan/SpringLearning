package com.ibs.training.spring.Spring_AnnotationsTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
	 public static void main( String[] args ) throws Exception
	    {
	        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	        JDBCConnection jdbc = context.getBean("jdbc", JDBCConnection.class);
	        jdbc.display();
	        jdbc.getJDBCConnection();
	       
	    }
}
