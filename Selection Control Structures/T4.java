import java.util.Scanner;

public class T4
{
	public static void main(String[] args)
 {
	Scanner sc = new Scanner(System.in);

	int a,b;
	System.out.print("Enter 1st number: ");
	a = sc.nextInt();
	System.out.println();
	System.out.print("Enter 2nd number: ");
	b = sc.nextInt();
	System.out.println();

	if(a>b)
{
	System.out.println("Smaller number: " + b);
}
	else
{
	System.out.println("Smaller number: " + a);
}

	int c,d;
	System.out.print("Enter 1st number: ");
	c = sc.nextInt();
	System.out.println();
	System.out.print("Enter 2nd number: ");
	d = sc.nextInt();
	System.out.println();

	if(c>d)
{
	System.out.println("Smaller number: " + d);
}
	else
{
	System.out.println("Smaller number: " + c);
}

	int x;
	System.out.print("Enter a number: ");
	x = sc.nextInt();
	System.out.println();
	
	if(x>0)
{
	System.out.println("1");
}
	else if (x<0)
{
	System.out.println("-1");
}
	else
{
	System.out.print("0");
}

	int n1,n2,n3;
	System.out.print("Enter 1st number: ");
	n1 = sc.nextInt();
	System.out.println();
	System.out.print("Enter 2nd number: ");
	n2 = sc.nextInt();
	System.out.println();
	System.out.print("Enter 1st number: ");
	n3 = sc.nextInt();
	System.out.println();
	
	if(n1 < n2 && n1 < n3)
{
	System.out.println("Smallest number: " + n1);
}
	else if(n2 < n3 && n2 < n3)
{
	System.out.println("Smallest number: " + n2);
}
	else
{
	System.out.print("Smallest number: " + n3);
}
 }
}
	
	