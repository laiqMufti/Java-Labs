import java.util.*;
public class t1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= N) {
            sum += i * i * i;
            i++;
        }

        System.out.println("Sum of cubes from 1 to " + N + " = " + sum);
        sc.close();
    }
}
