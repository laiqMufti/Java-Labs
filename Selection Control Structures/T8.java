import java.util.Scanner;

public class T8
{
	public static void main(String[] args)
 {
	Scanner sc = new Scanner(System.in);

	int date, month, year;
	System.out.print("Enter the date: ");
	date = sc.nextInt();
	System.out.println();
	
	System.out.print("Enter the month (numeric form): ");
	month = sc.nextInt();
	System.out.println();

	System.out.print("Enter the year (two digits): ");
	year = sc.nextInt();
	System.out.println();

	int game = date * month;

	if(game == year)
{
	System.out.print("The date is magic.");
}
	else
{
	System.out.print("The date is not magic.");
}
	sc.close();
 }
}
	