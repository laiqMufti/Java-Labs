import java.util.Scanner;

public class Task3a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int n = input.nextInt();

        if(n < 0 || n > 15){
            System.out.println(n + " is an invalid input");
        } else {
            if(n < 10)
                System.out.println("The hex value is " + n);
            else
                System.out.println("The hex value is " + (char)(n - 10 + 'A'));
        }
    }
}
