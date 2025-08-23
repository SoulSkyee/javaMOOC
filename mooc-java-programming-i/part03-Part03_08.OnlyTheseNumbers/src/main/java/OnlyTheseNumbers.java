
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       ArrayList<Integer> num = new ArrayList<>();

       while (true) {
        int input = Integer.parseInt(scanner.nextLine());
        if (input == -1) {
            break;  
        }

        num.add(input);

       }

       System.out.print("From where?");
       int a = Integer.parseInt(scanner.nextLine());

       System.out.print("To where?");
       int b = Integer.parseInt(scanner.nextLine());

       for(int i = a; i <= b; i++){
        System.out.println(num.get(i));
       }

    }
}
