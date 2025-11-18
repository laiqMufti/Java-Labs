import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        System.out.println(s.charAt(2));
        System.out.println(s.charAt(s.length() - 2));
        System.out.println(s.substring(0, 5));
        System.out.println(s.substring(0, s.length() - 2));

        // even index characters
        for(int i = 0; i < s.length(); i += 2)
            System.out.print(s.charAt(i));
        System.out.println();

        // odd index characters
        for(int i = 1; i < s.length(); i += 2)
            System.out.print(s.charAt(i));
        System.out.println();

        // reverse
        for(int i = s.length() - 1; i >= 0; i--)
            System.out.print(s.charAt(i));
        System.out.println();

        // reverse stepping by 2
        for(int i = s.length() - 1; i >= 0; i -= 2)
            System.out.print(s.charAt(i));
        System.out.println();

        System.out.println(s.length());
    }
}
