import java.util.*;
public class t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (end with 0): ");
        int prev = sc.nextInt();
        int count = 0;

        if (prev == 0) {
            System.out.println("Sequence is empty.");
            sc.close();
            return;
        }

        int curr = sc.nextInt();
        while (curr != 0) {
            if (curr > prev) {
                count++;
            }
            prev = curr;
            curr = sc.nextInt();
        }

        System.out.println("Count of numbers greater than previous: " + count);
        sc.close();
    }
}
