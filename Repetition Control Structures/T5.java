import java.util.*;
public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter numbers (end with 0): ");
        num = sc.nextInt();
        int max = num;

        while (num != 0) {
            if (num > max) {
                max = num;
            }
            num = sc.nextInt();
        }

        System.out.println("Maximum number in sequence = " + max);
        sc.close();
    }
}
