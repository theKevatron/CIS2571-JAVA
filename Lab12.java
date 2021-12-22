/* @ author Kevin Morales
 * 
 * Description:
 * This program tests throwing 
 * exceptions. In this example the
 * OutOfMemoryError exception is thrown to
 * test. It is caught, then the list of instructions
 * under the "catch" method is executed. We then print
 * outside of the "try/catch" methods to verify the
 * system continues running.
 * 
 * enjoy!!
 */

public class Lab12 {

	public static void main(String[] args) {
		
		//Throw OutOfMemoryError()
		try {
			
			throw new OutOfMemoryError();
		}
		
		//Catch OutOfMemoryError exception
		catch (OutOfMemoryError ex) {
			System.out.println("Out of memory error occurred ");
		}
		
		//Verify System continues
		System.out.println("System continuing");
	}

}
