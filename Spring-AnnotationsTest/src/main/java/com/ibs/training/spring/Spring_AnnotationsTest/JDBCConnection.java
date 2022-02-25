package com.ibs.training.spring.Spring_AnnotationsTest;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {
	
	@Value("${postgres.url}")
	private String url;
	@Value("${postgres.username}")
	private String userName;
	@Value("${postgres.password}")
	private String password;
	@Value("${postgres.driver}")
	private String driver;
	
	public void display(){
		System.out.println(userName+" "+ url +" "+ password + " "+driver );
	}
	
	public void getJDBCConnection() throws Exception{
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,userName,password);
		System.out.println("Connection Successfull : "+ con);
	}
}
