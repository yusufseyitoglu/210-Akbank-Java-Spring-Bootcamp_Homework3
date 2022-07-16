package com.example.banking;

import java.io.Serializable;

import lombok.Getter;

import lombok.Setter;
@Setter //Adding all setter method with annotation. Not coding. When compiling, lombok bring them
@Getter //Adding all getter method with annotation. Not coding. When compiling, lombok bring them

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private int number;
	private String name;
	private String surname;
	private String email;
	private String tc;
	private int balance;
	private String type;
	
	public String toFileFormat( ) {
		return this.number + "," + this.name + "," + this.surname + "," + this.email + "," + this.tc + "," + this.balance + "," + this.type;		
	}


}
