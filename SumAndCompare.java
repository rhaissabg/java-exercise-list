package exercises;

import java.util.Scanner;

public class SumAndCompare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numbers = new int[3];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter #" + (i+1) +  " number: ");
			numbers[i] = sc.nextInt();
		}

		int sum = numbers[0] + numbers[1];

		System.out.println();
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Number #" + (i+1) + " = " + numbers[i]);
		}

		System.out.println("\n" + numbers[0] + " + " + numbers[1] + " = " + sum);

		if (sum > numbers[2]) {
			System.out.println("The sum is greater than " + numbers[2]);
		} else if (sum < numbers[2]) {
			System.out.println("The sum is less than " + numbers[2]);
		} else {
			System.out.println("The sum is equal to " + numbers[2]);
		}

		sc.close();

	}

}
