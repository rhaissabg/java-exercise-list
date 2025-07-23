package exercises;

import java.util.Scanner;

public class StudentAverageCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter student's name: ");
		String name = sc.nextLine();
		
		int[] grades = new int[4];
		int sum = 0;
		
		for (int i = 0; i < grades.length; i++) {
			boolean validGrade = false;
			while (!validGrade) {
				System.out.print("Enter #" + (i+1) + " grade (0 - 100): ");
				grades[i] = sc.nextInt();
				if (grades[i] < 0 || grades[i] > 100 ) {
					System.out.println("\nPlease, enter a valid grade.\n");
				} else {
					validGrade = true;
				}
			}
			sum += grades[i];
		}
		
		double average = (double) sum / grades.length;
		
		System.out.println("\nStudent's name: " + name);
		System.out.println("Student's Grades: ");
		for (int i = 0; i < grades.length; i++) {
			System.out.printf("#%d: %d\n", (i+1), grades[i]);
		}
		System.out.printf("Average: %.2f\n", average);
		
		if (average < 60) {
			System.out.println("F - Unsatisfactory");
		} else if (average >= 60 && average < 70) {
			System.out.println("D - Satisfactory");
		} else if (average >= 70 && average < 80) {
			System.out.println("C - Good");
		} else if (average >= 80 & average < 90) {
			System.out.println("B - Very Good");
		} else {
			System.out.println("A - Excellent");
		}
		
		sc.close();

	}

}
