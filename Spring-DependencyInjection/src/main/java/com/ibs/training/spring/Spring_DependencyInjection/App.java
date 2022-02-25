package com.ibs.training.spring.Spring_DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
	 public static void main( String[] args )
	    {
	        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	        Airtel airtelService = context.getBean("airtel", Airtel.class);
	        airtelService.activateService();
	    }
}
