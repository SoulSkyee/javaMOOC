
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.parseInt(sc.nextLine());

            if (input == 0) {
                break;
            }

            if (input !=0) {
                num = num + 1;
                sum = sum + input;
            }
        }

        System.out.println("Number of numbers: " + num);
        System.out.println("Sum of the numbers: " + sum);
    }
}
