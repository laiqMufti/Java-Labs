import java.util.Scanner;

public class GL3
{
	public static void main(String [] args)
  {
	Scanner console = new Scanner (System.in);
	
	int SECRET = 11;
	double RATE = 12.50;

	int num1;
	int num2;
	int newNum;
	String name;
	double hoursWorked;
	double wages;

	System.out.print("Please! enter first number: ");
	num1 = console.nextInt ();
	System.out.println();
	System.out.print("Please! enter the  second number: ");
	num2 = console.nextInt ();
	System.out.println();

	System.out.print("The value of num1 is: " + num1);
	System.out.println();
	System.out.print("The value of num2 is: " + num2);
	System.out.println();

	newNum = (num1 * 2) + num2;
	System.out.print("The value of new number is: " + newNum);
	System.out.println();

	newNum = newNum + SECRET;
	System.out.print("The value of new numer is: " + newNum);
	System.out.println();

	System.out.print("Please enter your last name: ");
	name = console.next();
	System.out.println();
	
	System.out.print("Please enter a decimal number between 0-70: ");
	hoursWorked = console.nextDouble();
	System.out.println();
	
	wages = RATE * hoursWorked;

	System.out.println("Name: " + name);
	System.out.println("Pay Rate: $ " + RATE);
	System.out.println("Hours Worked: " + hoursWorked);
	System.out.println("Salary: $ " + wages);

  }
}

	
