package exercises;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter temperature: ");
		double temperature = sc.nextDouble();

		System.out.println("\n1 - Fahrenheit to Celsius \n2 - Celsius to Fahrenheit");
		int option = sc.nextInt();

		double convertedTemperature = 0;

		switch (option) {
		case 1:
			convertedTemperature = (5 * (temperature - 32) / 9);
			System.out.printf("\nFahrenheit to Celsius: %.2f ºC", convertedTemperature);
			break;
		case 2:
			convertedTemperature = (temperature * 9 / 5) + 32;
			System.out.printf("\nCelsius to Fahrenheit: %.2f ºF", convertedTemperature);
			break;
		default:
			System.out.println("\nInvalid option, try again.");
		}

		sc.close();

	}

}
