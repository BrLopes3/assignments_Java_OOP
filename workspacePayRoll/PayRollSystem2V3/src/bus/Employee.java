package bus;

import java.io.Serializable;

public abstract class Employee implements IPayable, Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8232299561851817365L;
	private String firstName;
	private String lastName;
	private String ssNumber;
	
	//constructor without parameter
	public Employee() {
		super();
		this.firstName = "Undefined";
		this.lastName = "Undefined";
		this.ssNumber = "Undefined";
		
	}
	//constructor with parameter
	public Employee(String firstName,String lastName, String ssNumber) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssNumber = ssNumber;
		
	}
	
	//getters and setters
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setSSN(String ssn) {
		this.ssNumber = ssn;
	}
	public String getSSN(){
		return this.ssNumber;
	}
	
	//toString override
	
	@Override
	public String toString() {
		
		return this.firstName+", "+ this.lastName + ", "+ this.ssNumber;
	}
	
/*	public Double alculatePayment() {
		
		return 0.0;
	}*/
	
	public abstract double calculatePayment();
	
	

}
