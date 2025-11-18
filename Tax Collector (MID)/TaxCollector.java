import java.util.*;
public class TaxCollector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double income, anum_tax, exceed, anum, mon_tax, net_income;
        int option = 1;   // FIXED

        do {
            System.out.print("Please! Enter your monthly income: ");
            income = sc.nextDouble();
            anum = income * 12;
            System.out.println("Your annual income = " + anum);

            if (anum <= 600000) {
                anum_tax = 0;
                System.out.println("Total annual tax payable = " + anum_tax);
                mon_tax = anum_tax / 12;
                System.out.println("Monthly tax = " + mon_tax);

                net_income = income - mon_tax;
                System.out.println("Your net montly salary after tax = " + net_income);

                System.out.println("Run again (1 for yes/ 0 for no): ");
                option = sc.nextInt();
            }

            else if (anum > 600000 && anum <= 1200000) {
                exceed = anum - 600000;
                anum_tax = exceed * 0.1;
                System.out.println("Total annual tax payable = " + anum_tax);

                mon_tax = anum_tax / 12;
                System.out.println("Monthly tax = " + mon_tax);

                net_income = income - mon_tax;
                System.out.println("Your net montly salary after tax = " + net_income);

                System.out.println("Run again (1 for yes/ 0 for no): ");
                option = sc.nextInt();
            }

            else if (anum > 1200000 && anum <= 2200000) {
                exceed = anum - 1200000;
                anum_tax = (exceed * 0.11) + 6000;
                System.out.println("Total annual tax payable = " + anum_tax);

                mon_tax = anum_tax / 12;
                System.out.println("Monthly tax = " + mon_tax);

                net_income = income - mon_tax;
                System.out.println("Your net montly salary after tax = " + net_income);

                System.out.println("Run again (1 for yes/ 0 for no): ");
                option = sc.nextInt();
            }

            else if (anum > 2200000 && anum <= 3200000) {
                exceed = anum - 2200000;
                anum_tax = (exceed * 0.23) + 116000;
                System.out.println("Total annual tax payable = " + anum_tax);

                mon_tax = anum_tax / 12;
                System.out.println("Monthly tax = " + mon_tax);

                net_income = income - mon_tax;
                System.out.println("Your net montly salary after tax = " + net_income);

                System.out.println("Run again (1 for yes/ 0 for no): ");
                option = sc.nextInt();
            }

            else if (anum > 3200000 && anum <= 4100000) {
                exceed = anum - 3200000;
                anum_tax = (exceed * 0.30) + 346000;
                System.out.println("Total annual tax payable = " + anum_tax);

                mon_tax = anum_tax / 12;
                System.out.println("Monthly tax = " + mon_tax);

                net_income = income - mon_tax;
                System.out.println("Your net montly salary after tax = " + net_income);

                System.out.println("Run again (1 for yes/ 0 for no): ");
                option = sc.nextInt();
            }

            else if (anum > 4100000) {
                exceed = anum - 4100000;
                anum_tax = (exceed * 0.35) + 616000;
                System.out.println("Total annual tax payable = " + anum_tax);

                mon_tax = anum_tax / 12;
                System.out.println("Monthly tax = " + mon_tax);

                net_income = income - mon_tax;
                System.out.println("Your net montly salary after tax = " + net_income);

                System.out.println("Run again (1 for yes/ 0 for no): ");
                option = sc.nextInt();
            }

            else {
                System.out.println("Invalid entry");
                System.out.println("Run again (1 for yes/ 0 for no): ");
                option = sc.nextInt();
            }

        } while (option != 0);

        System.out.println("bye bye");
        sc.close();
    }
}
