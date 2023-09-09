package exceptionhandling;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		int n1,n2,result;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first no");
		n1=sc.nextInt();
		System.out.println("Enter second no");
		n2=sc.nextInt();
		try {
		result=n1/n2;
		System.out.println("Result = " +result);

		}
		catch(ArithmeticException e) {
			System.out.println("Divide by zero is not possible");
		System.out.println(e);
		}
		//System.out.println("Result = " +result);
		
	}
}
