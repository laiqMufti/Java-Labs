import java.util.Scanner;

public class T6
{
	public static void main(String[] args)
 {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a number from 1-10: ");
	int n = sc.nextInt();
	System.out.println();

	if( n == 1)
{
	System.out.print("Roman number = i ");
}
	else if (n == 2)
{
	System.out.print("Roman number = ii ");
}
	else if (n == 3)
{
	System.out.print("Roman number = iii ");
}
	else if (n == 4)
{
	System.out.print("Roman number = iv ");
}
	else if (n == 5)
{
	System.out.print("Roman number = v ");
}
	else if (n == 6)
{
	System.out.print("Roman number = vi ");
}
	else if (n == 7)
{
	System.out.print("Roman number = vii ");
}
	else if (n == 8)
{
	System.out.print("Roman number = viii ");
}
	else if (n == 9)
{
	System.out.print("Roman number = ix ");
}
	else if (n == 10)
{
	System.out.print("Roman number = x ");
}
	else
{
	System.out.print("Error! Wrong number");
}
	sc.close();
 }
}