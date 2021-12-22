/* @ author Kevin Morales
 * 
 * Description:
 * This program prompts the user to enter 10 numbers.
 * The 10 numbers will be stored into an array. The 
 * array will be sorted in ascending order and displayed. 
 * The highest number, lowest number, sum of all
 * numbers, and average of all numbers will be calculated 
 * and displayed as well.
 * 
 * enjoy!!
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HW4 
{
	public static void main(String[] args) 
	{
		//Declare variable to store sum of all numbers in array
		double sum = 0;
		
		//Scanner util to gather user input
        Scanner input = new Scanner(System.in);
        
        //Defining user input
        System.out.println("You will enter 10 numbers that will be stored in an array. ");
        
        //Defining array name, variable type, and array size
        double[] numbers = new double [10];
        
        //For loop that gathers user input for each index of the array
        for (int i = 0; i < numbers.length; i++) 
        {
        	//Displays where user input in going
        	System.out.println("Enter Number " + (i+1) + ": ");
        	numbers[i] = input.nextDouble();
        	//Equation that calculates the sum of all numbers in array
            sum += numbers[i];
        }
        
        
        //For loop that calculates the highest number in the array
        double max = numbers[0];
        for (int i = 1; i < numbers.length; i++) 
        {
        	if (numbers[i] > max) 
        	{
        		//If statement to make max equal to the highest number in the array
        		max = numbers[i];
        	}
        }
        
        
        //For loop that calculates the lowest number in the array
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) 
        {
        	if (numbers[i] < min) 
        	{
        		//If statement to make min equal to the lowest number in the array
        		min = numbers[i];
        	}
        }
        
        
        //Calculates the average using the sum and array length
        double average = sum / numbers.length;
        
        
        //Sort array using java.itil.Arrays;
        java.util.Arrays.sort(numbers);
        
        //Loops through the array to print out each value in the array
        System.out.println("Sorted List");
        for (int i = 0; i < numbers.length; i++) 
        {
        	System.out.print(numbers[i] + " ");
        }
        //Prints out the stored variables: max, min, sum, and average
        System.out.println();
        System.out.println("Largest = " + max);
        System.out.println("Smallest = " + min);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        
    }
}