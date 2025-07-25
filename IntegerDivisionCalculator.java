package exercises;

import java.util.Scanner;

public class IntegerDivisionCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter dividend: ");
		int dividend = sc.nextInt();
		
		System.out.print("Enter divisor: ");
		int divisor = sc.nextInt();
		
		try {
			int quotient = dividend / divisor;
			int remainder = dividend % divisor;
			System.out.printf("%n%d / %d = %d%nRemainder = %d", dividend, divisor, quotient, remainder);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero!");
			e.printStackTrace();
		}
		sc.close();

	}

}
