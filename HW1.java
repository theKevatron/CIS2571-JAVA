//import java.util.scanner to allow user input to be stored
import java.util.Scanner;
public class Eggs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//prompt user to enter the amount of eggs they want to order
		System.out.print("Enter the number of eggs you want to order:");
		
		//store user input as variable "totalEggs"
		int totalEggs = input.nextInt();
		//calculate the amount of eggs in dozens
		int dozens = totalEggs / 12;
		//calculate the remainder of eggs
		int singles = totalEggs % 12;
		
		//calculate the dozen price by multiplying the dozens by 3.25
		double dozenPrice = dozens * 3.25;
		//calculate the single price by multiplying the singles by 0.45
		double singlePrice = singles * 0.45;
		//calculate the total by adding the dozenPrice and the singlePrice
		double total = dozenPrice + singlePrice;
		
		//display the total price of the eggs
		System.out.println("You ordered " + totalEggs + " eggs. That's " + dozens + " dozen at $3.25 per dozen and " + singles + " loose eggs at 45 cents each for a total of $" + total +"."); 
		
		
	}

}
