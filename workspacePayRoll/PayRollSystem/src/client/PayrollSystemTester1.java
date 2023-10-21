package client;
import bus.*;
import java.util.ArrayList;

public class PayrollSystemTester1 {
	
	
	public static void main(String[] args) {
		
		ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
		
		//Using class HourlyEmployee
		Employee employee1 = new HourlyEmployee("John", "Smith", "123abc", 45, 40);
		
		listOfEmployees.add(employee1);
		
		//Using class SalariedEmployee
		Employee employee2 = new SalariedEmployee("James", "Sulivan", "111rrr", 1000.50);
		
		listOfEmployees.add(employee2);
		
		//Using class CommissionEmployee
		Employee employee3 = new CommissionEmployee("Bruce", "Wayne", "444bbb", 22000.75, 0.15);
		
		listOfEmployees.add(employee3);
		
		//Using class BasePlusCommissionEmployee
		Employee employee4 = new BasePlusCommissionEmployee("Logan", "Roy", "444aaa", 22000.75, 0.15, 2000);
		
		listOfEmployees.add(employee4);
		
		//print all employees in the list and their respective payments
		for (Employee element: listOfEmployees){
			
			System.out.println(element+"\t payment: "+element.calculatePayment());
		}
		
			
		
	}
	
	

}
