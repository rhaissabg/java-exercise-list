package exercises;

public class HeightComparison {

	public static void main(String[] args) {

		// fran - 1.50m - 2cm per year
		// sara - 1.10m - 3cm per year

		double franHeight = 1.50;
		double saraHeight = 1.10;
		int years = 0;

		while (saraHeight < franHeight) {
			franHeight += 0.02;
			saraHeight += 0.03;
			years++;
		}

		System.out.printf("Sara's height: %.2fm\nFran's height: %.2fm", saraHeight, franHeight);
		System.out.printf("\nSara is gonna be taller than Fran in %d years.", years);

	}

}
