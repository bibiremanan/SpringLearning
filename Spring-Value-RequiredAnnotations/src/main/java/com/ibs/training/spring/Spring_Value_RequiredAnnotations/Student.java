package com.ibs.training.spring.Spring_Value_RequiredAnnotations;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${student.name}")
	private String name;
	@Value("${student.department}")
	private String department;
	@Value("${student.courseName}")
	private String courseName;
	@Value("${student.courseStatus}")
	private String courseStatus;
	public String getName() {
		return name;
	}
	
	
	public void showDetailsInfo(){
		System.out.println("Name of Student: "+ name);
		System.out.println("Department : "+ department);
		System.out.println("Course : "+ courseName);
		System.out.println("CourseStatus : "+courseStatus);
	}
	

}