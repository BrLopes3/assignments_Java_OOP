package client;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import bus.BasePlusCommissionEmployee;
import bus.CommissionEmployee;
import bus.Employee;
import bus.HourlyEmployee;
import bus.IPayable;
import bus.SalariedEmployee;

/*Write into the file: serialize
 * FileOutputStrem
 * ObjectOutputStream
 * 
 * read from file: de-serialize
 * FileInputStream
 * ObjectInputStream
 * 
 * Exception: 
 * IOException
 * 
 * 
 * */


public class PayrollSystemTester2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{

		ArrayList<IPayable> listFromConsole = new ArrayList<IPayable>();



		//Using class HourlyEmployee
		IPayable employee1 = new HourlyEmployee("John", "Smith", "123abc", 45, 40);

		listFromConsole.add(employee1);

		//Using class SalariedEmployee
		IPayable employee2 = new SalariedEmployee("James", "Sulivan", "111rrr", 1000.50);

		listFromConsole.add(employee2);

		//Using class CommissionEmployee
		IPayable employee3 = new CommissionEmployee("Bruce", "Wayne", "444bbb", 22000.75, 0.15);

		listFromConsole.add(employee3);

		//Using class BasePlusCommissionEmployee
		IPayable employee4 = new BasePlusCommissionEmployee("Logan", "Roy", "444aaa", 22000.75, 0.15, 2000);

		listFromConsole.add(employee4);

		//print all employees in the list and their respective payments
		System.out.println();
		System.out.println();
		System.out.println("List of employees (FROM CONSOLE)");
		System.out.println();

				
		for (IPayable element: listFromConsole){

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
		}



		//write into/Read File: serialized file

		String filePath = "src//data//list.ser";
		ArrayList<IPayable> listFromFile = new ArrayList<IPayable>();

		//write into file: serialize

		FileOutputStream fileOutputStream = new FileOutputStream(filePath);


		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		objectOutputStream.writeObject(listFromConsole);

		objectOutputStream.close();

		//Read from File : DeSerialize

		FileInputStream fileInputStream = new FileInputStream(filePath);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

		listFromFile = (ArrayList<IPayable>)objectInputStream.readObject();

		System.out.println();
		System.out.println();
		System.out.println("List of employees (FROM FILE)");
		System.out.println();

		for (IPayable element : listFromFile) {

			//System.out.println(element);
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

		}


	}



}




