/* @ author Kevin Morales
 * 
 * Description:
 * This program prompts the user to enter a
 * string of text and will count the number
 * of words in the text and return the 
 * total number of words. As an example, we can input 
 * President Abraham Lincoln's Gettysburg
 * address and the program will count the 
 * number of words, and return the total.
 * 
 * enjoy!!
 */


//Import scanner to gather user input
import java.util.Scanner; 
public class HW6 {

	public static void main(String[] args) {
		
		//Define user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter some text to find out how many words are in it: ");
		
		//Store user input into a string
		String text = scan.nextLine();
		
		//Convert string to character array to work with individual characters
		char[] cText = text.toCharArray();
		
		//Counter to keep track of number of words
		int words = 0;
		
		
	    //If statement and for statement below calculate the number of words in the string
	    int i = 0;
	    if (Character.isLetter(cText[0]))
	    {
	        words++;
	    }
	    //For loop to loop through the string
	    for (i = 1; i < text.length(); i++)
	    {
	        //If statement to that increments "words" if an alphabetic 
	        //character is found and the index behind it is not an alphabetical character
	        if (Character.isLetter(cText[i]) && (!Character.isLetter(cText[i - 1])))
	        {
	            words++;
	        }
	    }
	    
	    //Print out the number of words counted
	    System.out.println("There are " + words + " words in this text.");

	}
	
}
