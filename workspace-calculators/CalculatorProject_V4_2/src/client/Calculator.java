package client;

import bus.Operation;

public class Calculator {

	public static void main(String[] args) {
		
		//first operation
		Operation operation1 = new Operation(); //object operation1
		
		operation1.setOperand1(10.6); //first way to set the numbers using the constructor without arguments
		operation1.setOperand2(5.2);
		
		System.out.println("\t\t----Calculator (Version 4.2)----\n");
		
		System.out.println("Operation 1: "+operation1);
		
		//second operation
		Operation operation2 = new Operation(10.2, 6.3); //object operation2 using the constructor with the arguments
		System.out.println("Operation 2: "+operation2);
	
		//third operation
		Operation operation3 = new Operation(operation2); //object operation3 using the copy constructor 
		
		System.out.println("Operation 3: "+operation3);
		
		
		
		
	}


}

