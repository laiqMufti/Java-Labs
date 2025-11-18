import java.util.*;
public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, index = 0, maxIndex = 0, max = Integer.MIN_VALUE;

        System.out.println("Enter numbers (end with 0): ");
        do {
            num = sc.nextInt();
            if (num != 0) {
                index++;
                if (num > max) {
                    max = num;
                    maxIndex = index;
                }
            }
        } while (num != 0);

        System.out.println("Index of maximum number: " + maxIndex);
        sc.close();
    }
}
