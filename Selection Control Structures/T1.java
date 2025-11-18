public class T1
{
	public static void main(String [] args)
 {
	int x = 10, y = 15, z = 20;
	
	boolean e1 = !(x > 10);
	System.out.println(e1);

	boolean e2 = x <= 5 || y < 15 ;
	System.out.println(e2);

	boolean e3 = (x != 5) && (y != z);
	System.out.println(e3);

	boolean e4 = x >= z || (x + y >= z);
	System.out.println(e4);
	
	boolean e5 = (x <+ y - 2) && (y >= z) || (z - 2 != 20);
	System.out.println(e5);

 }
}