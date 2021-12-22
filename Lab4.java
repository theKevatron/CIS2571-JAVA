//import java.util.Scanner to gather user input
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) 
	{
		//Declare the necessary variables
		int a;
		char c;
		
		//Generate a random number from 65 to 90
		a = (int)(Math.random() * (91 - 65) + 65);
		
		//Convert int value to char variable so the randomly generated number
		//be used to print out an ASCII character from A(65) to Z(90)
		c = (char)a;
		
		System.out.println("Randomly generated letter is: " + c);
	}

}
