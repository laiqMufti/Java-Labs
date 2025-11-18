import java.util.*;

public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter numbers (0 to stop): ");
        int num = sc.nextInt();

        while (num != 0) {
            count++;
            num = sc.nextInt();
        }

        System.out.println("Length of sequence (excluding 0): " + count);
        sc.close();
    }
}
