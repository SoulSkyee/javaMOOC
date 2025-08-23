
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.print("First number?");
        int inp1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Second number?");
        int inp2 = Integer.parseInt(scanner.nextLine());

        for(int i = inp1 ; i <= inp2; i++){
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }

}
