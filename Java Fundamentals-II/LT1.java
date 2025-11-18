import java.util.*;

public class LT1
{
public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);

	double amount;
	System.out.print("Amount: ");
	amount = sc.nextDouble();
        System.out.println();

	double cents;
	cents = amount * 100;
	double dollars;
	dollars = cents / 100;
	System.out.print("Dollars: " + (int)dollars);
	System.out.println();

	cents = cents % 100;  
	double quarters;
	quarters = cents / 25;
	System.out.print("Quarters:" + (int)quarters );
	System.out.println();

	cents = cents % 25;
	double dimes;
	dimes = cents / 10;
	System.out.print("Dimes:" + (int)dimes);
	System.out.println();
	
	cents = cents % 10;
	double nickels;
	nickels = cents / 5;
	System.out.print("Nickels: " + (int)nickels);
	System.out.println();

	cents = cents % 5;
	double pennys;
	pennys = cents;
	System.out.print("Pennies: " + (int)pennys);
	 System.out.println();
	}
}