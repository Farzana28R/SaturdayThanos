package com.upskill.java_6;

public class myException extends Exception {
	String a;
	
	public myException(String b){
		a=b;
	}
	
	public String demo(){
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
