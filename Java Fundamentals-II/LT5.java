import java.util.*;

public class LT5
{
 public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);

	double milk;
	System.out.print("Enter the total amount of milk produced in the morning: ");
	milk = sc.nextDouble();

	double cartonSize = 3.78;
	double costperliter = 0.38;
	double profitperCarton = 0.27;

	int cartons;
	double cost, profit;
	cartons = (int)(milk / cartonSize + 0.5);
	cost = milk * costperliter;
	profit = cartons * profitperCarton;

	System.out.println("Cartons: " + cartons);
	System.out.println("Cost: " + cost);
	System.out.println("Profit: " + profit);
	}
}
	
	
	
