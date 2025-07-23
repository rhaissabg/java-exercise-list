package exercises;

import java.util.Scanner;

public class SwapValues {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter #1 number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter #2 number: ");
		int num2 = sc.nextInt();
		
		System.out.printf("%nOriginal values: %n" +
						"A = %d%n" +
						"B = %d", num1, num2);
		
		int aux = num1;
		num1 = num2;
		num2 = aux;
		
		System.out.printf("%n%nSwapped values: %n" +
				"A = %d%n" +
				"B = %d", num1, num2);
		
		sc.close();
		
	}

}
