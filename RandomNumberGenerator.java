package exercises;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		
		// generate random numbers between 1 and 100
		// https://stackoverflow.com/questions/5271598/java-generate-random-number-between-two-given-values
		
		// using Random
		Random rd = new Random();
		System.out.println(rd.nextInt(100) + 1);
		
		// using Math
		System.out.println((int) (Math.random() * (100)) + 1);
		

	}

}
