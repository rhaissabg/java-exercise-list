package exercises;

import java.util.Scanner;

public class MultiplicationTableGenerator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number to generate its table: ");
		int number = sc.nextInt();
		
		System.out.print("Enter the start number: ");
		int start = sc.nextInt();
		
		System.out.print("Enter the end number: ");
		int end = sc.nextInt();
		
		if (start < end) {
			for (int i = start; i <= end; i++) {
				System.out.printf("%d x %d = %d%n", number, i, (number * i));
			}
		} else if (start > end) {
			for (int i = start; i >= end; i--) {
				System.out.printf("%d x %d = %d%n", number, i, (number * i));
			}
		} else {
			System.out.printf("%d x %d = %d", number, start, (number * start));
		}
		
		sc.close();
		
	}

}
