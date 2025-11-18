import java.util.*;
public class t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count = 0;

        System.out.println("Enter numbers (end with 0): ");
        num = sc.nextInt();

        while (num != 0) {
            if (num % 2 == 0) {
                count++;
            }
            num = sc.nextInt();
        }

        System.out.println("Number of even elements: " + count);
        sc.close();
    }
}
