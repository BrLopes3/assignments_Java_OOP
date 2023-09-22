package client;
import bus.Operation;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //object of class scanner
		
		Operation mathOperation = new Operation(); //object mathOperation from class Operation
		
		
		double result1, result2, result3, result4, result5;
		
		
		
		System.out.println("\t\t----Calculator (Version 4)----\n");
		
		System.out.print("Enter with the first number: ");
		
		try {
			double number1 = input.nextDouble();
			mathOperation.setOperand1(number1);
			
		}catch(InputMismatchException e) {
			
			System.out.println("Error: Invalid input. The number must be a double.");
			input.close();
			return;
		}
		
		System.out.print("Enter with the second number: ");
		
		try {
			double number2 = input.nextDouble();
			mathOperation.setOperand2(number2);
			
		}catch(InputMismatchException e) {
			
			System.out.println("Error: Invalid input. The number must be a double.");
			input.close();
			return;
		}
		
				
		result1 = mathOperation.add(mathOperation.getOperand1(), mathOperation.getOperand2());
		System.out.print("Addition is: "+result1+"\n");
		
		result2 = mathOperation.sub(mathOperation.getOperand1(), mathOperation.getOperand2());
		System.out.print("Subtraction is: "+result2+"\n");
		
		result3 = mathOperation.mult(mathOperation.getOperand1(), mathOperation.getOperand2());
		System.out.print("Multiplication is: "+result3+"\n");
		
		result4 = mathOperation.div(mathOperation.getOperand1(), mathOperation.getOperand2());
		System.out.print("Division is: "+result4 +"\n");
		
		result5 = mathOperation.mod(mathOperation.getOperand1(), mathOperation.getOperand2());
		System.out.print("Modulus is: "+result5 +"\n");
		
		input.close();
	}

}

