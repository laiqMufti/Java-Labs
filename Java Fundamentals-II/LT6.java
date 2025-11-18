import java.util.*;

public class LT6
{
 public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);

	double payrate,hours;

	System.out.print("Enter your Pay rate: ");
	payrate = sc.nextDouble();
	System.out.println();
	System.out.print("Enter the amount of hours you worked: ");
	hours = sc.nextDouble();
	System.out.println();
	
	double income = payrate * hours * 5;
	double tax = income * 0.14;
	double net = income - tax;

	double clothes = net * 0.1;
	double supplies = net * 0.01;
	double rem = net - clothes - supplies;
	double bonds = rem * 0.25;
	double parentsbond = bonds * 0.5;

	System.out.println("Income before tax: $ " + income);
	System.out.println("Income after tax: $ " + net);
	System.out.println("Clothes and accessories: $ " + clothes);
	System.out.println("School supplies: $ " + supplies );
	System.out.println("Saving Bonds: $ " + bonds );
	System.out.println("Parents Contribution: $ " + parentsbond );

	}
}
 
	
	
	
