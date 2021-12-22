/* @ author Kevin Morales
 * 
 * Description:
 * This prompts the user to enter 5 numbers.
 * These numbers are stored in an array list.
 * The numbers are then sorted in ascending order 
 * using a "sort" method declared below for array lists.
 * After the numbers are sorted, the list is displayed
 * on the console. 
 * 
 * enjoy!!
 */

//Import scanner and array list
import java.util.Scanner;
import java.util.ArrayList;

public class Lab11 {

	public static void main(String[] args) {
		
			//Declare integer array list
			ArrayList<Integer> numbers = new ArrayList<>();
			
			//Utilize scanner to gather user input
	        Scanner input = new Scanner(System.in);
	        System.out.print("Please enter 5 numbers: ");
	        
	        //For loop to gather 5 numbers using scanner
	        for (int i = 0; i <= 4; i++) 
	        {
	        	numbers.add(input.nextInt());
	        }
	        
	        //Call "sort" method
	        sort(numbers);
	        
	        //Display sorted list
	        System.out.println("Sorted list of numbers in increasing order:");
	        System.out.println(numbers);

	    }

		//Method to sort an array list
	    public static void sort(ArrayList<Integer> list) {

	        for (int i = 0; i < list.size() - 1; i++) {
	        	//Find the minimum in the list
	            int currentMin = list.get(i);
	            int currentMinIndex = i;
	            
	            for (int j = i + 1; j < list.size(); j++) {
	                if (currentMin > list.get(j)) {
	                    currentMin = list.get(j);
	                    currentMinIndex = j;
	                }
	            }
	            //Swap if necessary
	            if (currentMinIndex != i) {
	                list.set(currentMinIndex, list.get(i));
	                list.set(i, currentMin);
	            }
	        }

	    }
}
