
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to?");
        int input = Integer.parseInt(scanner.nextLine());

        System.out.print("Where from?");
        int input2 = Integer.parseInt(scanner.nextLine());



        for(int i = input2; i <= input; i++){
            System.out.println(i);
        }
    }
}
