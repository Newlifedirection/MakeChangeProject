import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the intem price $: \n");
		double price = kb.nextDouble();
		// Prompt user for value, and get input
//		System.out.println("The price is $: " + price);
		System.out.print("Enter amount paid $ (either 1, 5, 10, or 20): ");
		double tendered = kb.nextDouble();
		double tenderedIn = kb.nextDouble();

		if (tendered < price) {
			System.out.println("Invalid, enter more money ");

		} else if (tendered == price) {
			System.out.println("Your change is $0 ");

		}
		// Prompt user for amount tendered, and get input
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