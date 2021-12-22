/* @ author Kevin Morales
 * 
 * Description:
 * This program declares the class Payroll
 * which has the attributes name, hourlyRate,
 * hoursWorked, and payment. This class contains
 * three constructors. One constructor takes 
 * name, hourlyRate and hoursWorked as inputs, one 
 * constructor only takes the name as an input, and
 * one needs no input and sets default values. There
 * are .get() and .set() methods for each attribute
 * to manipulate values. There is a .computePay() 
 * method to calculate gross pay based on attribute 
 * values and a .toString() method to display all 
 * object information. 
 * 
 * enjoy!!
 */
import java.text.DecimalFormat;
public class HW5 {

	public static void main(String[] args) {
		//Class array
		Payroll [] employee = new Payroll[5];
		//Constructor taking name, hourly rate, and hours
		employee[0] = new Payroll("John Kit", 14.68, 33);
		//Constructor taking name only
		employee[1] = new Payroll("Andrew Jack");
		//Constructor setting default values
		employee[2] = new Payroll();
		employee[3] = new Payroll("Michael Peterson", 16.25, 25);
		employee[4] = new Payroll("Anna Watson", 15.56, 28);
		
		//Calling .set() methods for employee 3
		employee[2].setName("Katy Tommers");
		employee[2].setHourlyRate(15.21);
		employee[2].setHoursWorked(31);
		
		//Calculating pay
		employee[0].computePay();
		employee[1].computePay();
		employee[2].computePay();
		employee[3].computePay();
		employee[4].computePay();
		
		//Calling .get() methods for employee 3
		System.out.println("Employee 3: ");
		System.out.println(" Name: " + employee[2].getName() + "  Hourly Rate: $" + employee[2].getHourlyRate() + "  Hours:" + employee[2].getHoursWorked());
		//Calling .computePay() method to calculate gross pay for employee
		System.out.println("Employee 1: ");
		System.out.println(" Gross Pay: $" + employee[0].computePay());
		//Calling .toString() method to display all employee information
		System.out.println("Employee 4: ");
		System.out.println(" All Information: " + employee[3].toString());
		
		//Displaying all employee information to show that all methods/constructors work
		System.out.println();
		System.out.println("All Employee Information: ");
		System.out.println(employee[0].toString());
		System.out.println(employee[1].toString());
		System.out.println(employee[2].toString());
		System.out.println(employee[3].toString());
		System.out.println(employee[4].toString());
		
	}

}

//Payroll Class
class Payroll {
	//Four data fields of the Payroll class
	private String name;
	private double hourlyRate;
	private double hoursWorked;
	private double payment;
	
	//Default/no-arg constructor
	//Constructor that sets name blank and hourly rate and hours worked equal to 0
	public Payroll() {
		name = "";
		hourlyRate = 0;
		hoursWorked = 0;
	}
	
	//Constructor that takes employee's name, hourly rate, and hours worked
	public Payroll(String newName, double newHourlyRate, double newHoursWorked) {
		name = newName;
		hourlyRate = newHourlyRate;
		hoursWorked = newHoursWorked;
	}
	
	//Constructor that only takes' employees name
	public Payroll(String newName) {
		name = newName;
		hourlyRate = 0;
		hoursWorked = 0;
	}
	
	//get() method for name
	public String getName() 
	{
		return name;
	}
	
	//get() method for hourly rate
	public double getHourlyRate() 
	{
		return hourlyRate;
	}
	
	//get() method for hours worked
	public double getHoursWorked() 
	{
		return hoursWorked;
	}
	
	//set() method for name
	public void setName(String newName) {
		name = newName;
	}
	//set() method for hourly rate
	public void setHourlyRate(double newHourlyRate) {
		hourlyRate = newHourlyRate;
	}
	//set() method for hours worked
	public void setHoursWorked(double newHoursWorked) {
		hoursWorked = newHoursWorked;
	}
		
	//Method to calculate gross pay of employee
	public double computePay() {
		payment = hourlyRate * hoursWorked;
		return payment;
	}
	
	//Method to print all employee information
	public String toString() {
		DecimalFormat df=new DecimalFormat("#.##");
		return "Name: " + name + "  Hourly Rate: $" + hourlyRate + "  Hours: " + hoursWorked + "  Gross Pay: $" + df.format(payment);
	}
	
}
