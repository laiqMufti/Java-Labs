import java.util.Scanner;

public class Task6 {

    public static String capitalize(String word){
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String line = input.nextLine();
        String[] words = line.split(" ");

        String result = "";

        for(String w : words){
            result += capitalize(w) + " ";
        }

        System.out.println(result.trim());
    }
}
