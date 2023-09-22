package bus;

//package to keep all the operations

public class Operation {
	
		
		public static double add(double operand1, double operand2 ) {
			
			return operand1 + operand2;
			
		}
		
		public static double sub(double operand1, double operand2 ) {
			
			return operand1 - operand2;
			
		}
		
		public static double mult(double operand1, double operand2 ) {
			
			return operand1 * operand2;
			
		}
		
		public static double div(double operand1, double operand2) {
			
			
			if(operand2!=0) {
				return operand1/operand2;
			}
			else {
				
				return Double.NaN;
			}
			
		}
		
		public static double mod(double operand1, double operand2) {
			
			if(operand2!=0) {
				
				return operand1%operand2;
			}
			else {
				
				return Double.NaN;
			}
			
		}

	}


