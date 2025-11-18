import java.util.*;
public class a2{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);

	int limit, num, sum, counter;
	System.out.print("Enter the number " + " integers in the list: ");
	limit = sc.nextInt();
	System.out.println();
	sum = 0;
	counter = 0;

	System.out.println("Enter " + limit + " integers.");
	while (counter < limit){
	num = sc.nextInt();
	sum = sum + num;
	counter++;
	}

	System.out.printf("The sum 0f the %d "+" numbers = %d%n", limit, sum);

	if (counter != 0)
	System.out.printf("The average = %d%n", (sum/ counter));
	else
	System.out.println("No input.");
 }
}	
