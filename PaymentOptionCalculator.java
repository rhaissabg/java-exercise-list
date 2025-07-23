package exercises;

import java.util.Scanner;

public class PaymentOptionCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the price of the product: ");
		double price = sc.nextDouble();

		boolean confirmation = false;

		while (!confirmation) {
			boolean validOption = false;
			int option = 0;
			while (!validOption) {
				System.out.println("\nChoose payment option: \n" +
						"1 - Cash or Zelle\n" +
						"2 - Credit Card - single payment\n" +
						"3 - Credit Card - 2 monthly payments\n" +
						"4 - Credit Card - 3 or more monthly payments");
				option = sc.nextInt();
				if (option < 1 || option > 4) {
					System.out.println("Invalid option, try again.");
				} else {
					validOption = true;
				}
			}

			double finalPrice = price;

			switch (option) {
			case 1:
				finalPrice -= price * 0.15;
				break;
			case 2:
				finalPrice -= price * 0.10;
				break;
			case 3:
				finalPrice = price;
				System.out.printf("\n2 monthly payments of $ %.2f", (finalPrice/2));
				break;
			case 4:
				finalPrice += price * 0.10;
				boolean validInstallment = false;
				int installments = 0;
				while (!validInstallment) {
					System.out.print("Enter number of monthly payments (min 3 and max 12): ");
					installments = sc.nextInt();
					if (installments < 3 || installments > 12) {
						System.out.println("Invalid amount of monthly payments, try again.");
					} else {
						validInstallment = true;
					}
				}
				System.out.printf("\n%d monthly payments of $ %.2f", installments, (finalPrice/installments));
				break;
			}
			System.out.printf("\nFinal price: $ %.2f\n", finalPrice);
			System.out.print("\nConfirm payment option? (y/n) ");
			char answer = sc.next().toLowerCase().charAt(0);
			if (answer == 'y') {
				confirmation = true;
			} else {
				System.out.println("Returning to payment option menu.");
			}
		}

		System.out.println("Thank you for shopping!");

		sc.close();

	}

}
