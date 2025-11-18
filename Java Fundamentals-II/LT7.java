import java.util.*;

public class LT7
{
 public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the number of tickets sold of class A: ");
	int a = sc.nextInt();
	System.out.println();

	System.out.print("Enter the number of tickets sold of class B: ");
	int b = sc.nextInt();
	System.out.println();

	System.out.print("Enter the number of tickets sold of class C: ");
	int c = sc.nextInt();
	System.out.println();

	System.out.print("Enter the number of tickets sold of class D: ");
	int d = sc.nextInt();
	System.out.println();

	int total = a*20 + b*15 + c*10 + d*5;

	System.out.println("Class A: $ " + (a*20));
	System.out.println("Class B: $ " + (b*15));
	System.out.println("Class C: $ " + (c*10));
	System.out.println("Class D: $ " + (d*5));
	System.out.println("Total income: $ " + total);

	}
}