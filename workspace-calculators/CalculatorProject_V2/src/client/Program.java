package client;

import java.util.Scanner;

public class Program {
	
	// static methods with operations (static, because we can call them without creation of an object)
	
	public static int add(int parm1, int parm2) {
		
		return parm1+parm2;
	}
	public static int subt(int parm1, int parm2) {
		
		return parm1-parm2;
	}
	public static int mult(int parm1, int parm2) {
		
		return parm1*parm2;
	}
	public static int divs(int parm1, int parm2) {
		if(parm2!=0) {
			return parm1/parm2;
		}
		else {
			System.out.println("Division by zero not allowed!");
			return 0;
		}
		
	}
	public static int modul(int parm1, int parm2) {
		
		if(parm2!=0) {
			return parm1%parm2;
		}
		else {
			System.out.println("Division by zero not allowed!");
			return 0;
		}
	}

	public static void main(String[] args) {
		//1) variable declaration
				Scanner scan = new Scanner(System.in);
				int x, y;
				int sum;
				int sub;
				int mul;
				int div;
				int mod;
				
				//2) input/output block
				System.out.println("\t\t----Calculator (Version 2)----\n");
				
				System.out.print("input the first integer number: ");
				x = scan.nextInt();
				System.out.print("input the second integer number: ");
				y = scan.nextInt();
				//sum = x+y;
				sum = add(x,y);
				sub = subt(x,y);
				mul = mult(x,y);
				
				System.out.println(x +" + "+ y +" = "+sum);
				System.out.println(x +" - "+ y +" = "+sub);
				System.out.println(x +" * "+ y +" = "+mul);
				
				if(y!=0) {
					div = divs(x,y);
					mod = modul(x,y);
					
					System.out.println(x +" / "+ y +" = "+div);
					System.out.println(x +" % "+ y +" = "+mod);
				}
				else {
					System.out.println(x +" / "+ y +" = Out of Range");
					System.out.println(x +" % "+ y +" = Out of Range");
				}
				
				scan.close();
	}

}
