/* @ author Kevin Morales
 * 
 * Description:
 * This program prompts the user to enter up to 20 double
 * values. The sentinel value (value to end program) is
 * "99999". An error message will be displayed if no numbers
 * are entered before "99999". All double values will be stored
 * in an array and sorted in ascending order. The sorted numbers 
 * and their respective distance from average will be displayed. 
 * 
 * enjoy!!
 */

//Imported java.utils
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab7 
{
	public static void main(String[] args) 
	{
		  //Declaring the necessary variables
		  //Declaring array
		  double[] numbers = new double[20];
		  //Declaring input variable
	      double number;
	      //Declare i to control while loop
	      int i = 1;
	      //Declare i to control for loop
	      int j = 0;
	      //Declare count to calculate number of elements in array
	      double count = 1;
	      //Declare sum to calculate sum
	      double sum = 0;
	      //Declare average to calculate average
	      double average;
	      //Scanner to gather user input
	      Scanner input = new Scanner(System.in);
	      
	      //Defining user input and break value
	      System.out.println("You can enter up to 20 double values(Enter 99999 to stop user input).");
	      System.out.print("Enter Number: ");
	      number = input.nextDouble();
	      //If statement to display error message if only "99999" was entered
	      if(number == 99999)
	         System.out.println("You cannot quit without entering any numbers. Please enter at least one number.");
	      //While loop to gather user input up to 20 numbers
	      while(number != 99999 && i < numbers.length)
	      {
	    	 numbers[i] = number;
	    	 //Finding sum of all numbers in array to calculate average later
	         sum = sum + number;
	         System.out.print("Enter Number: ");
	         number = input.nextDouble();
	         //If statement to break if "99999" is entered
	         if(number == 99999)
	            break;
	         //Increment i and count for every number added to array
	         i++;
	         count++;
	      }
	      
	      //Formatting to 2 decimal places
	      DecimalFormat numberFormat = new DecimalFormat("#.00");
	      
	      //Equation to calculate average
	      average = sum / count;
	      //Print header
	      System.out.println("Number   Distance from average");
	      //For loop to display numbers in array and distance from average
	      for (j = 1; j < i+1; ++j)
	      {
	    	 //Math.abs() equation to calculate distance from average as a positive number
	    	 double distance = Math.abs(numbers[j] - average);
	         System.out.println(numbers[j] + "      " + numberFormat.format(distance));
	      }
    }
}