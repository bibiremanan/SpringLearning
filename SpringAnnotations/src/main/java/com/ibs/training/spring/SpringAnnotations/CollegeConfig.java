package com.ibs.training.spring.SpringAnnotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="package com.ibs.training.Spring_common_annotations")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {
	
/*	@Bean
	public Teacher teacherBean(){
		return new MathTeacher();
	}
	
	@Bean
	public Principle principleBean(){
		return new Principle();
	}
	
	@Bean
	public College collegeBean(){
		College college = new College();
		college.setPrinciple(principleBean());
		college.setTeacher(teacherBean());
		return college;
	}*/

}