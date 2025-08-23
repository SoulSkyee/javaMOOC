
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int inp1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int inp2 = Integer.parseInt(scanner.nextLine());

        int sum = inp1 + inp2;
        int min = inp1 - inp2;
        int times = inp1 * inp2;
        double bagi = 1.0 * inp1 / inp2;

        System.out.println(inp1 + " + " + inp2 + " = " + sum);
        System.out.println(inp1 + " - " + inp2 + " = " + min);
        System.out.println(inp1 + " * " + inp2 + " = " + times);
        System.out.println(inp1 + " / " + inp2 + " = " + bagi);
    }
}
