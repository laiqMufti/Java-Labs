import java.util.*;
public class t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repeat;

        do {
            System.out.println("Choose a pattern to print:");
            System.out.println("1. Star Triangle");
            System.out.println("2. Number Triangle");
            System.out.println("3. Inverted Star Triangle");
            System.out.println("4. Inverted Number Triangle");
            System.out.println("5. Star Pyramid");
            System.out.print("Enter your choice (1–5): ");
            int choice = sc.nextInt();

            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();

            if (choice == 1) {
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            } 
            else if (choice == 2) {
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
            } 
            else if (choice == 3) {
                for (int i = rows; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            } 
            else if (choice == 4) {
                for (int i = rows; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
            } 
            else if (choice == 5) {
                for (int i = 1; i <= rows; i++) {
                    for (int space = i; space < rows; space++) {
                        System.out.print(" ");
                    }
                    for (int star = 1; star <= (2 * i - 1); star++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } 
            else {
                System.out.println("Invalid choice!");
            }

            System.out.print("Do you want to print another pattern? (y/n): ");
            repeat = sc.next();
            System.out.println();

        } while (repeat.equalsIgnoreCase("y"));

        System.out.println("Program ended.");
        sc.close();
    }
}
