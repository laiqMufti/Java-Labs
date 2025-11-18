import java.util.Scanner;

public class Task3 {

    public static void displaySortedNumbers(double a, double b, double c){
        double temp;
        if(a > b){ temp = a; a = b; b = temp; }
        if(a > c){ temp = a; a = c; c = temp; }
        if(b > c){ temp = b; b = c; c = temp; }

        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        displaySortedNumbers(x, y, z);
    }
}
