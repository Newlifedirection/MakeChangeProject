import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
			System.out.print("Enter the intem price $: ");
		//Prompt user for value, and get input
			double price = kb.nextDouble();
			System.out.println("The price is $: " + price);
		//Prompt user for amount tendered, and get input
			kb.close();
	}
}
