package bus;

public class CommissionEmployee extends Employee{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6618641817503485838L;
	//private arguments
	private double grossSales;
	private double commissionRate;
	
	//default constructor without parameter
	public CommissionEmployee() {
		super();
		this.grossSales = 0.0;
		this.commissionRate = 0.0;
	}
	
	//constructor with parameters
	public CommissionEmployee(String firstName,String lastName, String ssNumber, 
			double grossSales, double commissionRate) {
		super(firstName, lastName, ssNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	//getters and setters
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	
	public double getGrossSales() {
		return this.grossSales;
	}
	
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	public double getCommissionRate() {
		return this.commissionRate;
	}
	
	//methods
	
	//@Override
	
	public double calculatePayment() {
		
		return this.commissionRate*this.grossSales;
	}
	
	@Override
	
	public String toString() {
		String statement = super.toString()+", "+this.commissionRate+", "+this.grossSales;
		return statement;
	}
	

}
