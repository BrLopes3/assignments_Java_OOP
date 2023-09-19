package AccountTest;
import java.util.Scanner;



public class AccountTest {
	

	public static void main(String[] args) {
	
		Account account1 = new Account(50.00);
		Account account2 = new Account(-7.50);
		
		System.out.printf("account1 balance: $.2f\n",account1.getBalance());
		System.out.printf("account2 balance: $.2f\n",account2.getBalance());
		
		Scanner read = new Scanner(System.in);
		
		//read from the user the amount to add in the balance
		System.out.print("Enter the amount deposit in account1");
		double depositAmount = read.nextDouble();
		
		System.out.printf("\nAdding $%.2f to account1 balance\n", depositAmount);
		

	}

}
