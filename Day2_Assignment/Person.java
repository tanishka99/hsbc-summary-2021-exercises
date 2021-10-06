package com.day2;

public class Person {
	String name;
	String gender;
	String emailId;
	long phone;
	
	Person( String name, String gender){ //initializes name and gender
		super();
		this.name=name;
		this.gender=gender;
	}
	Person( String name, String gender,String emailId){ //initializes name and gender
		super();
		this.name=name;
		this.gender=gender;
		this.emailId=emailId;
	}
	Person( String name, String gender, String emailId, long phone){ //initializes name and gender
		super();
		this.name=name;
		this.gender=gender;
		this.emailId=emailId;
		this.phone=phone;
	}

	

}
