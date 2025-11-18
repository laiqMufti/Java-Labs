import java.util.Scanner;

public class Task3b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        char ch = Character.toUpperCase(input.next().charAt(0));

        if(ch >= '0' && ch <= '9'){
            int val = ch - '0';
            System.out.println("The binary value is " + Integer.toBinaryString(val));
        }
        else if(ch >= 'A' && ch <= 'F'){
            int val = ch - 'A' + 10;
            System.out.println("The binary value is " + Integer.toBinaryString(val));
        }
        else{
            System.out.println(ch + " is an invalid input");
        }
    }
}
