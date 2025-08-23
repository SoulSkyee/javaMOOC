
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int inp1 = Integer.parseInt(sc.nextLine());
       int inp2 = Integer.parseInt(sc.nextLine());

       double root = Math.sqrt(inp1 + inp2);
       System.out.println(root);
    }
}
