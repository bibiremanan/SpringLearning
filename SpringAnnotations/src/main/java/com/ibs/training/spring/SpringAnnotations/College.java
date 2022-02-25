package com.ibs.training.spring.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	@Value("${college.name}")
	private String collegeName;

	@Autowired
	private Principal principal;
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;



	public void test() {
		principal.showDetails();
		teacher.teach();
		System.out.println("College Name is: " + collegeName);
		System.out.println("Testing Fine..!");

	}

}