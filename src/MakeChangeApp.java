import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the intem price $: ");
		// Prompt user for value, and get input
//		double price = kb.nextDouble();
//		System.out.println("The price is $: " + price);
		double tendered = kb.nextDouble();
		System.out.print("Enter amount paid $ (either 1, 5, 10, or 20): ");
		
		double tenderedIn = kb.nextDouble();
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