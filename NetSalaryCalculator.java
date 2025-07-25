package exercises;

import java.util.Scanner;

public class NetSalaryCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your hourly wage: ");
		double hourly = sc.nextDouble();
		
		System.out.print("Enter how many hours you worked this month: ");
		int hours = sc.nextInt();
		
		System.out.print("Enter the withholding percentage: ");
		double tax = sc.nextDouble();
		
		double gross = hourly * hours;
		double net = gross - (gross * (tax / 100));
		
		System.out.printf("%nHourly salary: $ %.2f"
						+ "%nHours worked: %d h"
						+ "%nGross salary: $ %.2f"
						+ "%nNet pay: $ %.2f", hourly, hours, gross, net);
		
		sc.close();

	}

}
