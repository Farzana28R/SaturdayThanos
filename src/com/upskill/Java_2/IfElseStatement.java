  package com.upskill.Java_2;

public class IfElseStatement {

	static int age = 101 ;
	
	public static void main(String[] args) {
		age();
	}
	public static void age (){
		if (age<30){
			System.out.println("you are children");
		}
		else if(age>13 && age<18){
			
		}
		
		else if(age>60){
			System.out.println ("you are senior");
			
			//nested If else
			if (age>100){
				System.out.println("you are hero");
			}
		}
		else {
			System.out.println(" you are adult");
		}
		
	}

	}


