package bus;

public class Operation {
	
	//private attributes
	private double operand1;
	private double operand2;
	
	//============================
	
	//methods to set the operands
	public void setOperand1(double number1) {
		operand1 = number1;
	}
	public void setOperand2(double number2) {
		operand2 = number2;
	}
	//============================
	
	//methods to get the operands
	public double getOperand1() {
		return operand1;
	}
	
	public double getOperand2() {
		return operand2;
	}
	//============================
	
	/*Default Constructor
	
	public Operation() {
		double operand1;
		double operand2;
	}
	//============================*/
	
	
	//Methods
	
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

