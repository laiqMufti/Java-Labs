import java.util.*;

public class LT3
{
 public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int c1, c2, c3, desks;

	System.out.print("Enter the number of students in class 1: ");
	c1 = sc.nextInt();
	System.out.println();

 	System.out.print("Enter the number of students in class 2: ");
	c2 = sc.nextInt();
	System.out.println();

	System.out.print("Enter the number of students in class 3: ");
	c3 = sc.nextInt();
	System.out.println();

	desks = (c1 + 1)/2 + (c2 + 1 )/2 + (c3 + 1)/2;
	System.out.print("Desks: " + desks);
}
} 

	