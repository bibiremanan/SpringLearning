package com.ibs.training.spring.SpringAnnotations;

import org.springframework.stereotype.Component;

@Component

public class MathsTeacher implements Teacher {

	public void teach() {
		System.out.println("My Name is John");
		System.out.println("Iam Your Maths Teacher");

	}

}