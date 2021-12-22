/* @ author Kevin Morales
 * 
 * Description:
 * This program declares the class "Rectangle"
 * which contains 2 double data fields(width and 
 * height), 2 constructors, and 2 methods.
 * One constructor is a no-arg constructor and 
 * creates a rectangle with default values of 
 * width and height, and the other constructor 
 * creates a rectangle with specified values 
 * of width and height. One method calculates
 * the area of an instance of rectangle(object)
 * and one method calculates the perimeter of
 * an instance of rectangle(object). Both rectangle's
 * values are displayed when the program is 
 * executed.
 * 
 * enjoy!!
 */

public class Lab9 {

	public static void main(String[] args) {
		//Creating object/instance of rectangle1
		Rectangle rectangle1 = new Rectangle(); 
		//Call getArea() method and getPerimeter() method and display
		System.out.println("The area of rectangle 1 is " + rectangle1.getArea() + ", and the perimeter is " +rectangle1.getPerimeter());
		
		//Creating object/instance of rectangle2 
		Rectangle rectangle2 = new Rectangle(2, 3);
		//Call getArea() method and getPerimeter() method and display
		System.out.println("The area of rectangle 2 is " + rectangle2.getArea() + ", and the perimeter is " +rectangle2.getPerimeter());
	}

}

//Rectangle Class
class Rectangle {
	//Two data fields of the rectangle class
	double width = 1;
	double height = 1;
	
	//Default/no-arg constructor
	//Constructs a rectangle with a width and height of 1
	Rectangle() {
		width = 1;
		height = 1;
	}
	
	//Constructs a rectangle with a specified width and height
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	//Method to get the area of the rectangle
	double getArea() {
		return width * height;
	}
	
	//Method to get the perimeter of the rectangle
	double getPerimeter() {
		return (width * 2) + (height * 2);
	}
	
	
}
