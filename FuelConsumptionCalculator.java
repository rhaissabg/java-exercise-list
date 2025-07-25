package exercises;

import java.util.Scanner;

public class FuelConsumptionCalculator {

	public static void main(String[] args) {
		
		// 1L - 12km
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the duration of the trip in hours: ");
		int hours = sc.nextInt();
		
		System.out.print("Enter your average speed in km/h: ");
		double speed = sc.nextDouble();
		
		double distance = hours * speed;
		double fuel = distance / 12;
		
		System.out.printf("%nTime spent: %dh"
						+ "%nAverage speed: %.2f km/h"
						+ "%nDistance traveled: %.2f km"
						+ "%nFuel used: %.2f L", hours, speed, distance, fuel);
		
		sc.close();

	}

}
