package com.ibs.training.spring.SpringAnnotations;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	public void teach() {
		System.out.println("My Name is Dheepa");
		System.out.println("I will teach you Science");

	}

}