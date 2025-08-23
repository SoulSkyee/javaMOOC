
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        int input = Integer.parseInt(scan.nextLine());

        System.out.println("You gave the number " + input);
    }
}
