package exercises;

import java.util.Scanner;

public class AgeChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		if (age >= 18) {
			System.out.printf("%n%s you're %d. You're an adult!", name, age);
		} else {
			System.out.printf("%n%s you're %d. You're a minor!", name, age);
		}
		
		sc.close();

	}

}
