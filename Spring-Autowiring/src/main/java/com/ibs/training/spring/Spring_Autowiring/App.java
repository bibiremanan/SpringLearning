package com.ibs.training.spring.Spring_Autowiring;

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
	    	Human human = context.getBean("human",Human.class);
	    	human.startPumping();
	    }
}
