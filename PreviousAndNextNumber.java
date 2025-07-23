package exercises;

import java.util.Scanner;

public class PreviousAndNextNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		System.out.print("\nPrevious number: " + (num - 1) +
				"\nCurrent number: " + num +
				"\nNext number: " + (num + 1));

		sc.close();

	}

}
