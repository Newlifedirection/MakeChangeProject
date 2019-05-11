import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the intem price :$ \n");
		double price = kb.nextDouble();
		// Prompt user for value, and get input
//		System.out.println("The price is $: " + price);
		System.out.print("Enter amount paid $ (either 1, 5, 10, or 20): ");
		double tendered = kb.nextDouble();
		int answer = (int) (((tendered - price) + 0.0001) * 100);
		int answer1 = (answer % 2000);	
		int Twenties = 0;
		int Tens = 0;
		int Fives = 0;
		int Ones = 0;
		int Quarters = 0;
		int Dimes = 0;
		int Nickels = 0;
		int Pennies = 0;
		
		System.out.println("answer" + answer);
		
		if (tendered < price) {
			System.out.println("Invalid, enter more money ");

		} else if (tendered == price) {
			System.out.println("Your change is $0 ");

		} else if (tendered > price && answer < 50) {
			System.out.println("Your change includes " + (tendered / 2000));
			
		} else if (tendered > price && answer < 20) {
			System.out.println("Your change includes " + (tendered / 1000));
			
		} else if (tendered > price && answer < 10) {
			System.out.println("Your change includes " + (tendered / 500));
			
		} else if (tendered > price && answer < 5) {
			System.out.println("Your change includes " + (tendered / 100));
			
		} else if (tendered > price && answer < 1) {
			System.out.println("Your change includes " + (tendered / 25));
			
		} else if (tendered > price && answer < .25) {
			System.out.println("Your change includes " + (tendered / 10));
			
		} else if (tendered > price && answer < .10) {
			System.out.println("Your change includes " + (tendered / 5));
			
		} else {
			System.out.println("Your change includes " + (answer) + "Pennies");
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