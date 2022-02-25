package com.ibs.training.spring.SpringAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Principal {
	
	public void showDetails(){
		System.out.println("My name is James");
		System.out.println("I am Your Principle.You should obey me");
	}

}