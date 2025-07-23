package exercises;

import java.util.Scanner;

public class DescendingSorter {

	public static void main(String[] args) {
		
		// https://stackoverflow.com/questions/13548619/java-sort-integer-array-without-using-arrays-sort
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[3];
		
		boolean sameNumbers = true;
		
		while (sameNumbers) {
			for (int i = 0; i < numbers.length; i++) {
				System.out.print("Enter #" + (i+1) + " number: ");
				numbers[i] = sc.nextInt();
			}
			if (numbers[0] == numbers[1] || numbers[1] == numbers[2] || numbers[0] == numbers[2]) {
				System.out.println("\nPlease, enter different numbers.\n");
			} else {
				sameNumbers = false;
			}
		}
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int temp = 0;
				if (numbers[j] > numbers[i]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		System.out.print("\nDescending order: ");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		
		sc.close();

	}

}
