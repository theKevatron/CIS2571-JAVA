//import java.until.scanner to allow user input to be stored
import java.util.Scanner;
public class Lab2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Print to console to ask for type of input
		System.out.print("Enter the driving distance(in miles): ");
		//store input as variable "distance"
		double distance = input.nextDouble();
		
		//Print to console to ask for type of input
		System.out.print("Enter miles per gallon: ");
		//store input as variable "milespg"
		double milespg = input.nextDouble();
		
		//Print to console to ask for type of input
		System.out.print("Enter price per gallon: ");
		//store input as variable "pricepg"
		double pricepg = input.nextDouble();
			
		//store equation as variable
		double total = (distance / milespg) * pricepg;
			
		//print result of "total" out
		System.out.println("The cost of driving is: $" + total); 		
		}
}
