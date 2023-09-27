package client;

import java.util.Scanner;

import bus.Operation;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println(" ");
		System.out.println("\t\t----Calculator (Version 4.3)----\n");
		//first operation
		Operation operation1 = new Operation(); //object operation1
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter with the first number: ");
		
		double number1 = input.nextDouble();
		
		System.out.print("Enter with the first number: ");
		
		double number2 = input.nextDouble();
		
		
		operation1.setOperand1(number1); 
		operation1.setOperand2(number2);
		
		
		System.out.println("Numbers to calculate: "+operation1);
		
		operation1.printMenu();
		
		int option;
		do{
			option = input.nextInt();
			operation1.choseOption(option);
			
		}while(option !=6);
				
		
		
	}


}

