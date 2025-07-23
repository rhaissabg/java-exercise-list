package exercises;

import java.util.Scanner;

public class FivePercentIncrease {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your salary per month: ");
		double salary = sc.nextDouble();
		double increase = (salary * 0.05);
		double increasedSalary = salary + increase;
		System.out.printf("\nIncrease = $ %.2f \nNew salary = $ %.2f", increase, increasedSalary);
		
		sc.close();

	}

}
