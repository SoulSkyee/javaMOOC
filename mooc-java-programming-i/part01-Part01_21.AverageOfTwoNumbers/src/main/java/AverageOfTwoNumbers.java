import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int inp1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int inp2 = Integer.parseInt(scanner.nextLine());

        double average = 1.0 * (inp1 + inp2) / 2; 
        System.out.println("The average is " + average);
    }
}
