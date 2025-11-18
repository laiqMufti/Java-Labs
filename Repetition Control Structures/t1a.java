import java.util.*;

public class t1a {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter A: ");
	int A = sc.nextInt();
	System.out.print("Enter B: ");
	int B = sc.nextInt();
	
	while (A<=B){
		System.out.print(A + " ");
		A++;
	}
	sc.close();
 }
}