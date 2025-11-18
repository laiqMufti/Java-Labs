import java.util.*;

public class LT4
{
 public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);

	int raw, min, hours;

	System.out.print("Enter the minutes passed midnight: ");
	raw = sc.nextInt();
	System.out.println();

	hours = raw / 60;
	min = raw % 60;
	System.out.print("The time is " + hours + ":" + min);
	}
}