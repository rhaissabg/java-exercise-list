package exercises;

import java.util.Scanner;

public class BooleanComparison {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.print("Do you have a driver's license? (y/n) ");
		char dl = sc.next().toLowerCase().charAt(0);
		
		boolean ofAge = age >= 18;
		boolean driver = dl == 'y';
		
		if (ofAge && driver) {
			System.out.println("Both are true, you are of age and have a driver's license.");
		} else if (!ofAge && !driver) {
			System.out.println("Both are false, you aren't of age and don't have a driver's license.");
		} else {
			System.out.println("One of them is false, either you aren't of age or don't have a driver's license.");
		}
		
		sc.close();

	}

}
