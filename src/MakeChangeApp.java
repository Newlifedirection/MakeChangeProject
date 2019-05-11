import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the intem price :$ \n");
		double price = kb.nextDouble();
//		System.out.println("The price is $: " + price);
		System.out.print("Enter amount paid $ (example 1, 5, 10, etc.): ");
		double tendered = kb.nextDouble();
		int answer = (int) (((tendered - price) + 0.0001) * 100);
		int Fifties;
		int Twenties;
		int Tens = 0;
		int Fives = 0;
		int Ones = 0;
		int Quarters = 0;
		int Dimes = 0;
		int Nickels = 0;
		int Pennies = 0;

//		System.out.println("answer" + answer);

		if (tendered < price) {
			System.out.println("Invalid, enter more money ");

		}
		if (tendered == price) {
			System.out.println("Your change is $0 ");

		}
		if (tendered > price && answer > 5000) {
			Fifties = answer / 5000;
			answer = answer % 5000;
//			System.out.println(answer);
			System.out.println("Your change includes " + Fifties + " Fifties");

		}
		if (tendered > price && answer > 2000) {
			Twenties = answer / 2000;
			answer = answer % 2000;
//			System.out.println(answer);
			System.out.println("Your change includes " + Twenties + " Twenties");

		}
		if (tendered > price && answer > 1000) {
			Tens = answer / 1000;
			answer = answer % 1000;
			System.out.println("Your change includes " + Tens + " Tens");

		}
		if (tendered > price && answer > 500) {
			Fives = answer / 500;
			answer = answer % 500;
			System.out.println("Your change includes " + Fives + " Fives");

		}
		if (tendered > price && answer > 100) {
			Ones = answer / 100;
			answer = answer % 100;
			System.out.println("Your change includes " + Ones + " Ones");

		}
		if (tendered > price && answer > 25) {
			Quarters = answer / 25;
			answer = answer % 25;
			System.out.println("Your change includes " + Quarters + " Quarters");

		}
		if (tendered > price && answer > 10) {
			Dimes = answer / 10;
			answer = answer % 10;
			System.out.println("Your change includes " + Dimes + " Dimes");

		}
		if (tendered > price && answer > 5) {
			Nickels = answer / 5;
			answer = answer % 5;
			System.out.println("Your change includes " + Nickels + " Nickels");

		}
		if (tendered > price && answer > 1) {
			Pennies = answer / 1;
			answer = answer % 1;

			System.out.println("Your change includes " + Pennies + " Pennies");
		}

		kb.close();
	}
}

//User Story #1
//The user is prompted asking for the price of the item.
//
//User Story #2
//The user is then prompted asking how much money was tendered by the customer.
//
//User Story #3
//Display an appropriate message if the customer provided too little money or the exact amount.
//
//User Story #4
//If the amount tendered is more than the cost of the item, display the number of bills and 
//coins that should be given to the customer.