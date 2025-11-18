import java.util.Scanner;

public class T5
{
	public static void main(String[] args)
 {
	Scanner sc = new Scanner(System.in);

	int n1,n2,n3;
	System.out.print("Enter 1st number: ");
	n1 = sc.nextInt();
	System.out.println();
	System.out.print("Enter 2nd number: ");
	n2 = sc.nextInt();
	System.out.println();
	System.out.print("Enter 3rd number: ");
	n3 = sc.nextInt();
	System.out.println();

	if(n1 == n2 && n1 == n3)
{
	System.out.print("3");
}
	else if((n1 == n2 && n1 != n3) || (n1 != n2 && n2 == n3))
{
	System.out.print("2");
}
	else
{
	System.out.print("0");
}

 }
}