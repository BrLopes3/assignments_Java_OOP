package client;

import bus.Operation;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double result1, result2, result3, result4;
		
		Scanner input = new Scanner(System.in);
		
		double number1 = 0;
		double number2 = 0;
		
		System.out.print("Enter with the first number");
		
		try {
			number1 = input.nextDouble();
		}catch(Exception e) {
			System.out.print("The value need to be a double " + e.getMessage());
			System.exit(0);
		}
		System.out.print("Enter with the second number");
		try {
			number2 = input.nextDouble();
		}catch(Exception e) {
			System.out.print("The value need to be a double " + e.getMessage());
			System.exit(0);
		}
				
		result1 = Operation.add(number1, number2);
		System.out.print("Addition is: "+result1+"\n");
		
		result2 = Operation.sub(number1, number2);
		System.out.print("Subtraction is: "+result2+"\n");
		
		result3 = Operation.mult(number1, number2);
		System.out.print("Multiplication is: "+result3+"\n");
		
		
		result4 = Operation.div(number1, number2);
		System.out.print("Division is: "+result4 +"\n");
		
		
		
		
		

	}

}
