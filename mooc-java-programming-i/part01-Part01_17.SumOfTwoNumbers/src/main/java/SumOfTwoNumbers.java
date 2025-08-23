
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
       System.out.println("Give the first number:");
       int inp1 = Integer.parseInt(scan.nextLine());
       System.out.println("Give the second number:");
       int inp2 = Integer.parseInt(scan.nextLine());

       int sum = inp1 + inp2;

       System.out.println("The sum of the numbers is " + sum);
    }
}
