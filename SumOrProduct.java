package exercises;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter #1 number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter #2 number: ");
		int num2 = sc.nextInt();

		int num3;

		if (num1 == num2) {
			num3 = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + num3);
		} else {
			num3 = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + num3);
		}

		sc.close();

	}

}
