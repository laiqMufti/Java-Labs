import java.util.*;
public class a3{
	static Scanner sc = new Scanner(System.in);
	static final int SENTINEL = -999;
	public static void main(String [] args){
	
	int num, sum = 0, count = 0;
	System.out.println("Enter positive integers " + "ending with " + SENTINEL);
	num = sc.nextInt();

	while(num != SENTINEL){
	sum = sum + num;
	count++;
	num = sc.nextInt();
	}

	System.out.printf("The sum of %d " + " numbers = %d%n", count, sum);

	if (count != 0)
	System.out.printf("The average = %d%n", (sum/count));
	else
	System.out.println("No input.");
 }
}