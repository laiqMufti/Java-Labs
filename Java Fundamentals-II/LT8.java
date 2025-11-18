import java.util.*;

public class LT8
{
 public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int num, n1, n2, n3,sum;
	System.out.print("Enter a number between 0-1000: ");
	
	num = sc.nextInt();
	n1 = num / 100;
	num = num % 100;
	n2 = num / 10;
	n3 = num % 10; 
	//n3 = num / 1;

	sum = n1 + n2 + n3;
	System.out.print("" + sum);
	
}
}
	
	
