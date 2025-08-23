
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inp1 = Integer.parseInt(scanner.nextLine());
        int inp2 = Integer.parseInt(scanner.nextLine());

       if (inp1 > inp2) {
        System.out.println(inp1 + " is greater than " + inp2);
       } else if (inp1 < inp2) {
        System.out.println(inp1 + " is smaller than " + inp2);
       } else if (inp1 == inp2) {
        System.out.println(inp1 + " is equal to " + inp2);
       }
    }
}
