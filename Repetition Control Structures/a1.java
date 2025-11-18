import java.util.Scanner;
public class a1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	

	int n1 = (int)(Math.random() * 10);
	int n2 = (int)(Math.random() * 10);
	System.out.print("What is " + n1 + " + " + n2 + "? ");
	int ans = sc.nextInt();

	while (n1 + n2 != ans){
	System.out.print("wrong answer, try again. What is " + n1 + " + " + n2 + "? ");
	ans = sc.nextInt();
}
	System.out.println("You got it!");
 }
}