package exercises;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your weight in kg: ");
		double weight = sc.nextDouble();
		
		System.out.print("Enter your height in meters: ");
		double height = sc.nextDouble();
		
		double bmi = weight / Math.pow(height, 2);
		
		if (bmi <= 18.5) {
			System.out.println("You're underweight.");
		} else if (bmi > 18.5 && bmi <= 24.9) {
			System.out.println("You're at your ideal weight.");
		} else if (bmi > 25.0 && bmi <= 29.9) {
			System.out.println("You're slightly overweight.");
		} else if (bmi > 30 && bmi <= 34.9) {
			System.out.println("Obesity level I.");
		} else if (bmi > 35.0 && bmi <= 39.9) {
			System.out.println("Obesity level II.");
		} else {
			System.out.println("Obesity level III.");
		}
		
		sc.close();
		
	}

}
