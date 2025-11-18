public class Task4 {

    public static int numberOfDaysInAYear(int year){
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            return 366;
        return 365;
    }

    public static void main(String[] args){
        for(int year = 2000; year <= 2020; year++){
            System.out.println(year + ": " + numberOfDaysInAYear(year));
        }
    }
}
