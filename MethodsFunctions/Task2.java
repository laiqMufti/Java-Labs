import java.util.Scanner;

public class Task2 {

    public static int reverse(int number){
        int rev = 0;
        while(number != 0){
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        if(isPalindrome(n))
            System.out.println(n + " is a palindrome");
        else
            System.out.println(n + " is not a palindrome");
    }
}
