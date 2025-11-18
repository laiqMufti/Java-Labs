import java.util.Scanner;

public class T7
{
	public static void main(String[] args)
 {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter length of first rectangle: ");
	double l1 = sc.nextDouble();
	System.out.println();
	System.out.print("Enter width of first rectangle: ");
	double w1 = sc.nextDouble();
	System.out.println();

	double A1 = l1 * w1;

	System.out.print("Enter length of second rectangle: ");
	double l2 = sc.nextDouble();
	System.out.println();
	System.out.print("Enter width of second rectangle: ");
	double w2 = sc.nextDouble();
	System.out.println();

	double A2 = l2 * w2;

	if(A1>A2)
{
	System.out.print("A1 is greater");
}
	else if(A2>A1)
{
	System.out.print("A2 is greater");
}
	else if(A1 == A2)
{
	System.out.print("Both are equal");
}
	else
{
	System.out.print("Error!");
}
	sc.close();
 }
}

