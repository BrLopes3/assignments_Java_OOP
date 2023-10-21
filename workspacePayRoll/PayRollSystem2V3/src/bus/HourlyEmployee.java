package bus;

public class HourlyEmployee extends Employee{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6877345106099740500L;
	//specific data members for this class
	private double hourlyWage;
	private double hoursWorked;
	
	//operation members
	
	public HourlyEmployee() {
		super();
		this.hourlyWage = 0.0;
		this.hoursWorked = 0.0;
	}
	
	//constructor with parameters
	
	public HourlyEmployee(String firstName, String lastName, String ssNumber, double hourlyWage, double hoursWorked) {
		
		super(firstName, lastName,ssNumber);
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}
	
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public double getHourlyWage() {
		return this.hourlyWage;
	}
	
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double getHoursWorked() {
		return this.hoursWorked;
	}
	
	//methods
	//@Override
	public double calculatePayment() {
		
		double finalPayment;
		if (getHoursWorked()<=40) {
			finalPayment = getHourlyWage()*getHoursWorked();
		}else {
			finalPayment = (40*getHourlyWage())+((getHoursWorked()-40)*getHourlyWage()*1.5);
		}
		return finalPayment;
		
		/*double finalPayment = this.hourlyWage*this.hoursWorked;
		return finalPayment;*/
	}
	
	
	@Override
	
	public String toString() {
		
		return super.toString()+", "+this.hourlyWage+", "+this.hoursWorked;
	}
	
}
