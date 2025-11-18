import java.util.*;
public class t5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter first day of the year (0=Sun, 1=Mon, ..., 6=Sat): ");
        int startDay = sc.nextInt();

        // Leap year check
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29;
        }

        for (int month = 0; month < 12; month++) {
            System.out.println();
            System.out.println("--------------- " + months[month] + " " + year + " ---------------");
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            for (int i = 0; i < startDay; i++) {
                System.out.print("    ");
            }

            for (int day = 1; day <= daysInMonth[month]; day++) {
                System.out.printf("%3d ", day);
                if ((day + startDay) % 7 == 0) {
                    System.out.println();
                }
            }

            System.out.println("\n----------------------------------------------");
            startDay = (startDay + daysInMonth[month]) % 7;
        }

        sc.close();
    }
}
