import java.util.*;

public class LT2
{
 public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	 int S, A, get, rem;
	System.out.print("Number of students: ");
	S = sc.nextInt();
	System.out.println();
	
	System.out.print("Number of apples: ");
	A = sc.nextInt();
	System.out.println();

	rem = A % S;
	get = A / S;
	
	System.out.println("Everyone will get: " + get);
	System.out.println("Apples in the basket: " + rem);
}
}