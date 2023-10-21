package client;
import bus.*;
import java.util.ArrayList;



public class PayrollSystemTester1 {
	
	
	public static void main(String[] args) {
		
		ArrayList<IPayable> listOfEmployees = new ArrayList<IPayable>();
		
		//Using class HourlyEmployee
		IPayable employee1 = new HourlyEmployee("John", "Smith", "123abc", 45, 40);
		
		listOfEmployees.add(employee1);
		
		//Using class SalariedEmployee
		IPayable employee2 = new SalariedEmployee("James", "Sulivan", "111rrr", 1000.50);
		
		listOfEmployees.add(employee2);
		
		//Using class CommissionEmployee
		IPayable employee3 = new CommissionEmployee("Bruce", "Wayne", "444bbb", 22000.75, 0.15);
		
		listOfEmployees.add(employee3);
		
		//Using class BasePlusCommissionEmployee
		IPayable employee4 = new BasePlusCommissionEmployee("Logan", "Roy", "444aaa", 22000.75, 0.15, 2000);
		
		listOfEmployees.add(employee4);
		
		//print all employees in the list and their respective payments
		for (IPayable element: listOfEmployees){
			
			if (element instanceof SalariedEmployee) {
				System.out.println("List of Salaried Employee");
				System.out.println(element.toString());
				System.out.println("Payment = "+ element.calculatePayment());
			}
			else if (element instanceof HourlyEmployee) {
				System.out.println("List of Hourly Employee");
				System.out.println(element.toString());
				System.out.println("Payment = "+ element.calculatePayment());
			}
			else if (element instanceof CommissionEmployee) {
				System.out.println("List of Commission Employee");
				System.out.println(element.toString());
				System.out.println("Payment = "+ element.calculatePayment());
			}
			else if (element instanceof BasePlusCommissionEmployee) {
				System.out.println("List of BasePlusCommission Employee");
				System.out.println(element.toString());
				System.out.println("Payment = "+ element.calculatePayment());
			}
						
			
			//System.out.println(element+"\t payment: "+element.calculatePayment());
		}
		
			
		
	}
	
	

}
