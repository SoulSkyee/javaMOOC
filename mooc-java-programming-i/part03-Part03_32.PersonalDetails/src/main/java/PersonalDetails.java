
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "";
        String longestName = "";
        int longest = 0;
        int sum = 0;
        int num = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] split = input.split(",");
            word = split[0];
            int length = word.length();
            int year = Integer.parseInt(split[1]);
            if (length > longest) {
                longest = length;
                longestName = word;
            }

            sum = sum + year;
            num = num + 1;
        }

        System.out.println("longest name " + longestName);

        double average = 1.0 * sum / num;
        System.out.println("Average of the birth years: " + average);
    }
}
