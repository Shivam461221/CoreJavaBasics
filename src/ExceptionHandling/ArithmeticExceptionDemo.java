package ExceptionHandling;

import java.util.Scanner;

public class ArithmeticExceptionDemo {
	//Arithmetic exceptions occurs when we try to divide a number by zero
	public static void main(String[] args) {
		int a, b, c;
		try {
		System.out.println("Enter two integers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = a / b;
		System.out.println("Result " + c);
		}
		catch(ArithmeticException e) {
			System.out.println("Please do not enter 0");
		}
		finally {
			System.out.println("Finally executed always ");
		}
		System.out.println("Rest of the code");
	}
}
