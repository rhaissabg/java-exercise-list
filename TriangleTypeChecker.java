package exercises;

import java.util.Scanner;

public class TriangleTypeChecker {

	public static void main(String[] args) {

		// equilateral: three sides are equal
		// isosceles: two sides are equal
		// scalene: three sides are differents 
		
		Scanner sc = new Scanner(System.in);
		
		int[] sides = new int[3];
		
		boolean validSides = false;
		
		while (!validSides) {
			for (int i = 0; i < sides.length; i++) {
				System.out.printf("Enter #%d side: ", (i+1));
				sides[i] = sc.nextInt();
			}
			if ((sides[0] + sides[1] > sides[2]) && 
				(sides[1] + sides[2] > sides[0]) &&
				(sides[2] + sides[0] > sides[1])) {
				validSides = true;
			} else {
				System.out.println("\nInvalid sides, try again\n");
			}
		}
		
		
		if (sides[0] == sides[1] && sides[0] == sides[2] && sides[1] == sides[2]) {
			System.out.println("\nEquilateral triangle");
		} else if (sides[0] == sides[1] || sides[0] == sides[2] || sides[1] == sides[2]) {
			System.out.println("\nIsosceles triangle");
		} else {
			System.out.println("\nScalene triangle");
		}
		
		sc.close();
		
	}

}
