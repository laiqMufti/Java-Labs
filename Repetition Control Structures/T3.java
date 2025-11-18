import java.util.*;

public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int N = sc.nextInt();

        int zeros = 0;  
        int count = 0;

        while (count < N) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int num = sc.nextInt();
            if (num == 0) {
                zeros++;
            }
            count++;
        }

        System.out.println("Total zeros entered: " + zeros);
        sc.close();
    }
}
