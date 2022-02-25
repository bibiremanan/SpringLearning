package com.ibs.training.spring.Spring_Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;

//	public void setHeart(Heart heart) { Not needed in case when autowired using in this model
//		this.heart = heart;
//	}
	
	public void startPumping(){
		if(heart!=null){
			System.out.println("Name of the animal :"+ heart.getNameOfAnimal()+ "  No of heart present :"+ heart.getNoOfHeart());
			heart.pump();
		}
		else{
			System.out.println("DEAD!!");
		}
		
	}

}