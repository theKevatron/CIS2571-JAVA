//import java.util.Scanner to gather user input
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) 
	{ 
		//Declare the necessary variables
		
		//String used to store user input
	    String user;
	    //String used to store computers value
	    String computer = "";
	    //Variable used to generate a random number to calculate computers move
	    int randomInt; 

	    //Used to get user input
	    Scanner scan = new Scanner(System.in); 

	    //Defining user input
	    System.out.println("Please choose one of the three options: " + "R = Rock, P = Paper" + 
	                       ", and S = Scissors.");

	    //Generate a random number
	    randomInt = (int)(Math.random() * 3);

	    //Use random number generated above to assign the computer a move
	    if (randomInt == 0) 
	       computer = "R"; 
	    else if (randomInt == 1) 
	       computer = "P"; 
	    else if (randomInt == 2) 
	       computer = "S"; 

	    //Store user input
	    System.out.println("Enter your play: "); 
	    user = scan.next();

	    //Print computer's move
	    System.out.println("Computer play is: " + computer); 

	    //Determine the winner by using if statements for each of the possible outcomes
	    
	    //If statement for if there is R-R, P-P, S-S
	    if (user.equals(computer)) 
	       System.out.println("You both chose the same move, it's a tie!"); 
	    
	    //If statement for if the is R-S or R-P
	    else if (user.equals("R")) {
	       if (computer.equals("S")) 
	          System.out.println("Rock beats scissors. You win!");
	    else if (computer.equals("P")) 
	            System.out.println("Paper beats rock. Computer wins!"); 
	    }
	    
	    //If statement for if the is P-S or P-R
	    else if (user.equals("P")) {
	       if (computer.equals("S")) 
	       System.out.println("Scissor beats paper. Computer wins!"); 
	    else if (computer.equals("R")) 
	            System.out.println("Paper beats rock. You win!!"); 
	    }
	    
	    //If statement for if the is S-P or S-R
	    else if (user.equals("S")) {
	         if (computer.equals("P")) 
	         System.out.println("Scissor beats paper. You win!"); 
	    else if (computer.equals("R")) 
	            System.out.println("Rock beats scissors. Computer wins!"); 
	    }
	    
	    //If statement for if the program fails/user input is not accepted
	    else 
	         System.out.println("Invalid user input."); 
	}

}
