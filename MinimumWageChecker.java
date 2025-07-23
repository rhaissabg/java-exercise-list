package exercises;

import java.util.Scanner;

public class MinimumWageChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the minimum wage per hour: ");
		double min = sc.nextDouble();
		
		System.out.print("Enter your salary per hour: ");
		double hourly = sc.nextDouble();
		
		System.out.print("Enter how many hours you work per week: ");
		int hours = sc.nextInt();
		
		double salariesPerHour = hourly / min;
		double difPerHour = hourly - min;
		double difPerMonth = (hourly * hours * 4) - (min * hours * 4);
		
		System.out.printf("\nYour salary is %.2f times bigger than the minimum wage."
				+ "\nYou make $ %.2f more than the minimum wage per hour and $ %.2f more than the minimum wage working %d hours per month.", salariesPerHour, difPerHour, difPerMonth, hours);
		
		sc.close();

	}

}
