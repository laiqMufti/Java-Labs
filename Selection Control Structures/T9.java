import java.util.Scanner;

public class T9
{
	public static void main(String[] args)
 {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the number of pennies: ");
	int pennies = sc.nextInt();
	System.out.println();

	System.out.print("Enter the number of nickelss: ");
	int nickels = sc.nextInt();
	System.out.println();

	System.out.print("Enter the number of dimes: ");
	int dimes = sc.nextInt();
	System.out.println();

	System.out.print("Enter the number of quarters: ");
	int quarters = sc.nextInt();
	System.out.println();

	double Tcents = pennies + (nickels * 5) + (dimes * 10) + (quarters * 25);
	
	if(Tcents == 100)
{
	System.out.print("Congrats!");
}
	else if(Tcents > 100)
{
	System.out.print("Amount is more than 100.");
}
	else
{
	System.out.print("Amount is less than 100.");
}
	sc.close();
 }
}