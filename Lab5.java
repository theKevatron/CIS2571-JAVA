/* @author Kevin Morales
 * 
 * Description:
 * This program will prompt the user to enter
 * a few numbers, then enter 0 to end the input.
 * Once 0 has been entered, the program will display
 * the number of positive numbers entered, the 
 * number of negative numbers entered, the sum of all
 * numbers entered, as well as the average of all numbers
 * entered. 
 * 
 * enjoy!
 */

//import java.util to use scanner
import java.util.*;  
public class Lab5 {

	public static void main(String[] args) {
		//Declare the necessary variables
		//positive number counter
		int positive = 0;
		//negative number counter
		int negative = 0;
		//counter for all numbers, used to calculate the average
		int count = -1;
		//total variable used to store the sum of all numbers entered
		float total = 0;
		//number variable used to store user input
		float number;
		//average variable used to calculate the average of all numbers entered
		float average;
		//scanner used to gather user input
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a few numbers(type 0 to end): ");
		
		//do-while loop to gather user input and increment certain variables while the input value is not equal to 0
		do { number = input.nextInt();
		//add the new number to the total
		 total += number;
		 	//increment the counter every time a new number is typed
		    count++;  
		    //if the number is a negative, increment the negative count
		    if(number > 0){
		    	positive++;
		    }
		    //if the number is a negative, increment the negative count
		    else if(number < 0){
		    	negative++;
		    }
		}
		//if the number entered is 0, end the loop
		while(number != 0);
		//display the average
		average = total / count;
		//display the positives
		System.out.println("The number of positives is "+ positive);
		//display the negatives
		System.out.println("The number of negatives is "+ negative);
		//display the total/sum
		System.out.println("The total is "+ total);
		//display the average
		System.out.println("The average is "+ average);

	}

}

