import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double num = 0;
        double sum = 0;

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 0) {
                break;
            }

            if (input > 0) {
                num = num + 1;
                sum = sum + input;
            }
        }

        if (num == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * sum/num);
        }
    }
}