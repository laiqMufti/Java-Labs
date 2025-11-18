import java.util.*;

public class t1c {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter how many number (N): ");
	int N = sc.nextInt();
	int sum = 0;
	int count = 0;

	while(count<N) {
		System.out.print("Enter number " + (count + 1) + ": ");
		int num = sc.nextInt();
		sum += num;
		count++;
	}
 
	System.out.println("Sum of " + N + " numbers = " + sum);
	sc.close();
 }
}