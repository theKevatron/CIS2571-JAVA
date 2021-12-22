//import java.util.Scanner to gather user input
import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) 
	{ 
		//Define user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hex digit: ");
		String hexDigit = input.nextLine();
		//Declare value variable to be used later for converting decimal to binary number
		int value = 0;
		
		// If statement to check if the hex digit is only one digit long
		if (hexDigit.length() != 1) {
			System.out.println(hexDigit + " is and invalid input. You may only enter one hex digit.");
			System.exit(1);
		}
		
		//Convert hexDigit to char
		char ch = Character.toUpperCase(hexDigit.charAt(0));
		
		//Convert character to an integer
		if ('A' <= ch && ch <= 'F') {
			value = ch - 'A' + 10;
			}
		
		else if (Character.isDigit(ch)) {
			value = ch;
			}
		
		//Invalid input statement
		else {
			System.out.println(ch + " is an invalid input");
			}
			
		//An array to store digits of binary number
		int[] binaryNum = new int[32];
				 
		int i = 0;
		while (value > 0) {
	    //Store remainder in array
		  binaryNum[i] = value % 2;
		  value = value / 2;
		  i++;
		}
				 
		//Print out array in reverse order to show binary number correctly
		for (int j = i - 1; j >= 0; j--)
			System.out.print(binaryNum[j]);
	}
}
