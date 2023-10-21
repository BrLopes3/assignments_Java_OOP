package bus;

public class BasePlusCommissionEmployee extends CommissionEmployee{

	//specific private arguments
	private double baseSalary;
	
	//default constructor without parameter
	public BasePlusCommissionEmployee() {
		super();
		this.baseSalary = 0.0;
	}
	
	//constructor with parameter
	public BasePlusCommissionEmployee(String firstName,String lastName, String ssNumber, 
			double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, ssNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}
	
	//getters and setters
	
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary() {
		return this.baseSalary;
	}
	
	//methods
	
	@Override
	public double calculatePayment() {
		
		double payment = super.calculatePayment()+this.baseSalary;
		return payment;
	}
	
	@Override
	public String toString() {
		String statement = super.toString()+", "+this.baseSalary;
		return statement;	
	}
		
	
}
