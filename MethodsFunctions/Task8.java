import java.util.Scanner;

public class Task8 {

    public static int countVowels(String s){
        s = s.toLowerCase();
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                count++;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("Number of vowels in the string: " + countVowels(s));
    }
}
