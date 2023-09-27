package bus;
import java.util.InputMismatchException;

public class Operation {
	
	
		//private attributes
		private double operand1;
		private double operand2;
		
		//============================
		
		//Constructors
		
		public Operation() { //constructor without arguments
			this.operand1 = 0;
			this.operand2 = 0;
		}
		
	/*	public Operation(double operand1, double operand2) {
			
			this.operand1 = operand1;
			this.operand2 = operand2;	
		}
		
		//copy constructor ??????????????????????????????????
		public Operation(Operation operation) {
			this.operand1 = operation.operand1;
			this.operand2 = operation.operand2;
		}
		*/
		
		//============================
		
		
		//methods to set the operands
		public void setOperand1(double operand1) {
			try {
					this.operand1 = operand1;
					
			}catch(InputMismatchException e) {
				
				System.out.println("Error: Invalid input. The number must be a double.");
				return;
			}
			
		}
		
		public void setOperand2(double operand2) {
			try {
				this.operand2 = operand2;
				
			}catch(InputMismatchException e) {
				
				System.out.println("Error: Invalid input. The number must be a double.");
				return;
			}
		}
		//============================
		
		//methods to get the operands
		public double getOperand1() {
			return this.operand1;
		}
		
		public double getOperand2() {
			return this.operand2;
		}
		//============================
		
		@Override //???????????????????????????????????
		public String toString(){
			
			String statement;
			
			statement = "Operand 1 = " + operand1 + ", Operand 2 = " + operand2;
			
			return statement;
		}
		
		
		//Methods
		
		public void printMenu() {
			System.out.println("Enter the option for the math operation:");
			System.out.print("1 - Addition;\n2 - Subtraction;\n3 - Multiplication;\n"
					+ "4 - Division;\n5 - Modulus; \n6 - Close application\nOption: ");
	
		}
		
		public void choseOption(int option) {
			
			switch(option) {
				case 1:
					System.out.println("Result of Addition: "+add(operand1,operand2));
					System.out.println("============================================");
					printMenu();
					break;
				case 2:
					System.out.println("Result of Subtraction: "+sub(operand1,operand2));
					System.out.println("============================================");
					printMenu();
					break;
				case 3:
					System.out.println("Result of Multiplication: "+mult(operand1,operand2));
					System.out.println("============================================");
					printMenu();
					break;
				case 4:
					System.out.println("Result of Division: "+div(operand1,operand2));
					System.out.println("============================================");
					printMenu();
					break;
				case 5:
					System.out.println("Result of Modulus: "+mod(operand1,operand2));
					System.out.println("============================================");
					printMenu();
					break;
					
				case 6:
					System.out.println("Bye!");
					break;
			}
		}
		
		
		public double add(double operand1, double operand2) {
			
			return operand1 + operand2;
			
		}
		
		public double sub(double operand1, double operand2 ) {
			
			return operand1 - operand2;
			
		}
		
		public double mult(double operand1, double operand2 ) {
			
			return operand1 * operand2;
			
		}
		
		public double div(double operand1, double operand2) {
			
			
			if(operand2!=0) {
				return operand1/operand2;
			}
			else {
				
				return Double.NaN;
			}
			
		}
		
		public double mod(double operand1, double operand2) {
			
			if(operand2!=0) {
				
				return operand1%operand2;
			}
			else {
				
				return Double.NaN;
			}
			
		}

}

