package com.upskill.java_5;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	
	
	private String name = "Sami";					//write(edit) & Read
	private int ssn = 451236457;					//write only
	private String username = "sami123";			//Read only

	
	//Setter Method - name
	public void setName (String value){				//set the data (write, you can not print, no system.out.println)
		name = value;
	}
	
	//Getter Method - name							// get the date(Read )
	public String getName(){
		return name;
	}
	
	//Setter Method
	public void setSSN (int value){
		ssn = value;
	}
	
	//Getter Method
	public String getUserName(){
		return username;
	}
	
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName ("Sazzad");
		obj.setSSN(26767834);
		System.out.println(obj.getName());
		System.out.println(obj.getUserName());
		
		

	}

}
