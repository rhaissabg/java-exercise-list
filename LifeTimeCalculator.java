package exercises;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class LifeTimeCalculator {

	public static void main(String[] args) {

		// https://stackoverflow.com/questions/54967602/how-to-find-difference-between-two-dates-in-years-months-and-days-in-java
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your birth date (MM/DD/YYYY): ");
		String date = sc.nextLine();
		
		String[] splitDate = date.split("/");
		int birthDay = Integer.parseInt(splitDate[1]);
		int birthMonth = Integer.parseInt(splitDate[0]);
		int birthYear = Integer.parseInt(splitDate[2]);
		LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
		
		LocalDate today = LocalDate.now();
		
		int yearsUntil = Period.between(birthDate, today).getYears();
		int monthsUntil = Period.between(birthDate, today).getMonths();
		int daysUntil = Period.between(birthDate, today).getDays();
		
		System.out.println(yearsUntil + " years, " +
						monthsUntil + " months and " +
						daysUntil + " days");
		
		sc.close();
		
	}

}
