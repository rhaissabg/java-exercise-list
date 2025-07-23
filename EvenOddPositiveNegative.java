package exercises;

import java.util.Scanner;

public class EvenOddPositiveNegative {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		boolean even = num % 2 == 0;
		boolean positive = num > 0;

		if (positive && even) {
			System.out.println("The number is positive and even");
		} else if (!positive && !even) {
			System.out.println("The number is negative and odd");
		} else if (positive && !even) {
			System.out.println("The number is positive and odd");
		} else if (!positive && even) {
			System.out.println("The number is negative and even");
		}

		sc.close();

	}

}
