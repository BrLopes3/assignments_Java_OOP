package bus;

public class SalariedEmployee extends Employee{
	
	
	
	//specific arguments
	private double weeklySalary;
	
	//constructor without parameter
	public SalariedEmployee() {
		
		super();
		this.weeklySalary = 0.0;
	}
	
	//constructor with parameter
	public SalariedEmployee(String firstName, String lastName, String ssNumber, double weeklySalary) {
		
		super(firstName, lastName, ssNumber);
		
		this.weeklySalary = weeklySalary;
		
	}
	
	//getters and setters
	
	public void setWeeklySalary(double weekSalary) {
		this.weeklySalary = weekSalary;
	}
	
	public double getWeeklySalary() {
		return this.weeklySalary;
	}
	
	//methods
	
	@Override
	
	public double calculatePayment() {
		
		return this.weeklySalary;
	}
	
	
	@Override
	
	public String toString() {
		
		String statement = super.toString()+", "+this.weeklySalary;
		
		return statement;
	}
	
	

}
