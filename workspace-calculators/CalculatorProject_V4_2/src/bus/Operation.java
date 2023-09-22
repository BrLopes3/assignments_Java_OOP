package bus;

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
		
		public Operation(double operand1, double operand2) {
			
			this.operand1 = operand1;
			this.operand2 = operand2;	
		}
		
		//copy constructor ??????????????????????????????????
		public Operation(Operation operation) {
			this.operand1 = operation.operand1;
			this.operand2 = operation.operand2;
		}
		
		
		//============================
		
		
		//methods to set the operands
		public void setOperand1(double operand1) {
			this.operand1 = operand1;
		}
		public void setOperand2(double operand2) {
			this.operand2 = operand2;
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

