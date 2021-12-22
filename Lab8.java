/* @ author Kevin Morales
 * 
 * Description:
 * This program prompts user the to enter an employee name.
 * After the user has entered an employee name, the program
 * will then prompt the user to enter the number of hours 
 * worked each day of the week for that employee. The program
 * will store 8 employee names and the number of hours worked
 * each day of the week for each employee. The program will then 
 * calculate the total number of hours worked during the week
 * for each employee and sort them in descending order. The
 * program will then display the total number of hours worked
 * during the week by each employee in descending order.
 * 
 * enjoy!!
 */

//Import java.util.Scanner to gather user input
import java.util.Scanner;
public class Lab8 {
	public static void main(String[] args) 
	{
		//Declaring the necessary variables
		
		//Two-dimensional array to store all hours of all employees
		int[][] twoDArray = new int[8][7];
		
		//Array to store TOTAL HOURS worked for EACH employee during the week
		int[] totalHours = new int [twoDArray.length];
		
		//Array to store days of the week
		String[] daysOfTheWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		//Array to store employee names
		String employees[] = new String[twoDArray.length];
		
		
		//Scanner to gather user input
		Scanner hours = new Scanner(System.in);
		Scanner names = new Scanner(System.in);
		
		//For loop to gather employee names
		for (int i = 0; i < employees.length; i++) {
			System.out.print("Enter the name of Employee: ");
	        employees[i] = names.nextLine();
	        //For loop and scanner to gather hours worked each day for each employee
			for (int j = 0; j < 7; j++) {
				System.out.print("Enter hours on " + daysOfTheWeek[j] + ": ");
				twoDArray[i][j] = hours.nextInt();
			}
	    }
		
		//For loop which calculates the total number of hours worked for each row(each employee)
		for (int i = 0; i < twoDArray.length; ++i) {
			totalHours[i] = twoDArray[i][0] + twoDArray[i][1] + twoDArray[i][2] +twoDArray[i][3] + twoDArray[i][4] + twoDArray[i][5] + twoDArray[i][6];
		}
		
		
		//Bubble sort to sort employee hours and names in descending order
		boolean needNextPass = true; 
		for (int k = 1; k < totalHours.length && needNextPass; k++) {
			// Array may be sorted and next pass not needed
			needNextPass = false;
			
			for (int i = 0; i < (totalHours.length) - k; i++) {
				if (totalHours[i] < totalHours[i + 1]) {
					// Swap totalHours[i] with with totalHours[i + 1]
					int x = totalHours[i];
					totalHours[i] = totalHours[i + 1];
					totalHours[i + 1] = x;
					
					// Swap employees[i] with with employees[i + 1]
					String y = employees[i];
					employees[i] = employees[i + 1];
					employees[i + 1] = y;
					
					needNextPass = true;
				}
			}
		}
		
		//For loop to display "employees" array and "totalHours" array after being sorted
		System.out.println("Employee details after sorting: ");
		for (int i = 0; i < totalHours.length; ++i) {
			System.out.println("Employee: " + employees[i] + " hours: " + totalHours[i]);
		}	
		
	}
}
